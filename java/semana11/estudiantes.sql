-- Comenzamos con CRUD: create(insertar), reed(leer), update(actualizar)
-- Listar los estudiantes (read)
SELECT * FROM estudiantes2022;
-- Insertar estudiante
INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES ("Juan", "Perez", "260444664", "Juan@gmail.com");
UPDATE estudiantes2022 SET nombre="Juan Carlos", apellido="Garcia" WHERE idestudiantes2022= 1;
-- Delate(eliminar)

DELETE FROM estudantes2022 WHERE idestuantes2022=3;

-- Para modificar el id estudiantes2022 y comience en 1
ALTER TABLE estudiantes2022 AUTO_INCREMENT = 1;
