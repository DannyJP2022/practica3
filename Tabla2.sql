CREATE DATABASE IF NOT EXISTS practica3;
USE practica3;

DROP TABLE IF EXISTS arbol;
CREATE TABLE IF NOT EXISTS arbol (
    id_arbol INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    altura INT,
    anchura INT,
    imagen VARCHAR(1024),
    tipo_de_flor VARCHAR(100)
);

DROP USER IF EXISTS 'usuario_practica'@'localhost';
CREATE USER IF NOT EXISTS 'usuario_practica'@'localhost' IDENTIFIED BY 'la_Clave';
GRANT ALL PRIVILEGES ON practica3.* TO 'usuario_practica'@'localhost';
FLUSH PRIVILEGES;

INSERT INTO arbol (nombre, altura, anchura, imagen, tipo_de_flor) VALUES
('Pino', 15, 5, 'https://example.com/palmera.jpg', 'No aplica'),
('Roble', 20, 10, 'https://example.com/palmera.jpg', 'No aplica'),
('Cerezo', 12, 8, 'https://example.com/palmera.jpg*', 'Flor de cerezo'),
('Manzano', 10, 7, 'https://example.com/palmera.jpg', 'Flor de manzano'),
('Palmera', 8, 3, 'https://example.com/palmera.jpg', 'No aplica');
