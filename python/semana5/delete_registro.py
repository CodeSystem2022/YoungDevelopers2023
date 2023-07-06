import psycopg2 # Esto es para poder conectarnos a POSTGRE

conexion = psycopg2.connect(user = 'postgres',password = 'admin',host = '127.0.0.1',port = '5432',database = 'test_Bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'DELETE FROM persona WHERE id_persona=%s'
            entrada = input('Digite el numero de registro a eliminar: ')
            valores = (entrada,)
            cursor.execute(sentencia, valores) # Ejecutamos la sentencia
            #conexion.commit() se utiliza para guardar los cambios en la base de datos
            registros_eliminados = cursor.rowcount
            print(f'Los registros eliminados son: {registros_eliminados}')
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()
