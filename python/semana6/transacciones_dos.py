import psycopg2 as bd

conexion = bd.connect(user='posrgres', password= 'admin', host='127001', port='5432',database='test_bd')
try:
    conexion.autocommit = False
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES(%s, %s, %s)'
    valores = ('Jorge', 'Prol', 'jprol@gmail.com')
    cursor.execute(sentencia, valores)

    sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    valores = ('Juan', 'Juarez', 'jcjuarez@gmail.com', 1)
    cursor.execute(sentencia, valores)

    conexion.commit()
    print('termina la transacción')
except Exception as e:
    conexion.rollback()
    print(f'Ocurriò un error:{e}')
finally:
    conexion.close() 