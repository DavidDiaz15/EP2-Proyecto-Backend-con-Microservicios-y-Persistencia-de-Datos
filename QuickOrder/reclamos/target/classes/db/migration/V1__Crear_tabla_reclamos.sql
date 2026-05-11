CREATE TABLE reclamos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    pedido_id BIGINT NOT NULL,
    descripcion TEXT NOT NULL,
    estado VARCHAR(50)
);