class PersonaDAO:
    '''
    DAO Significa: Data Access Object
    CRUD significa:
                    create -> Insertar
                    Read -> Seleccionar
                    Updata-> Actualizar
                    Delete -> Eliminar
    '''
    _SELECCIONR = 'SELECT * FROM persona ORDER BY id_persona'
    _INSERTAR = 'INSERT INTO persona(nombre,apellido,email) VALUES (%s, %s , %s '
    _Actuañizar = 'UPDATE persona SET nombre = %s, apellido =%s, email=%s WHERE id_persona = %s'