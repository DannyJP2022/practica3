package com.practica01.model;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")
public class Arbol implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idArbol;
    private String nombre;
    private Integer altura;
    private Integer anchura;
    private String imagen;
    private String tipoDeFlor;

    public Arbol() {
    }

    public Integer getIdArbol() {
        return idArbol;
    }

    public void setIdArbol(Integer idArbol) {
        this.idArbol = idArbol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getAnchura() {
        return anchura;
    }

    public void setAnchura(Integer anchura) {
        this.anchura = anchura;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTipoDeFlor() {
        return tipoDeFlor;
    }

    public void setTipoDeFlor(String tipoDeFlor) {
        this.tipoDeFlor = tipoDeFlor;
    }
}
