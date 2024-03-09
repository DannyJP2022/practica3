package com.practica01.controller;

import com.practica01.model.Arbol;
import com.practica01.service.ArbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArbolController {

    @Autowired
    private ArbolService arbolService;

    @GetMapping("/")
    public String mostrarArboles(Model model) {
        model.addAttribute("arboles", arbolService.findAll());
        return "index";
    }

    @GetMapping("/agregar")
    public String mostrarFormularioDeAgregarArbol(Model model) {
        Arbol arbol = new Arbol();
        model.addAttribute("arbol", arbol);
        return "agregar-arbol";
    }

    @PostMapping("/arboles")
    public String agregarArbol(@ModelAttribute("arbol") Arbol arbol) {
        arbolService.save(arbol);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Integer id, Model model) {
        Arbol arbol = arbolService.findById(id).orElseThrow(() -> new IllegalArgumentException("Id de árbol inválido:" + id));
        model.addAttribute("arbol", arbol);
        return "editar-arbol";
    }

    @PostMapping("/arboles/{id}")
    public String actualizarArbol(@PathVariable Integer id, @ModelAttribute("arbol") Arbol arbol, Model model) {
        arbol.setIdArbol(id);
        arbolService.save(arbol);
        return "redirect:/";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarArbol(@PathVariable Integer id) {
        arbolService.deleteById(id);
        return "redirect:/";
    }
}
