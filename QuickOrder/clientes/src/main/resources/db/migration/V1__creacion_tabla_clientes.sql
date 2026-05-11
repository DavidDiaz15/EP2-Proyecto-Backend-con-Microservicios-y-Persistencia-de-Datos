CREATE TABLE clientes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    appaterno VARCHAR(100) NOT NULL,
    apmaterno VARCHAR(100) NOT NULL,
    telefono VARCHAR(20)
);