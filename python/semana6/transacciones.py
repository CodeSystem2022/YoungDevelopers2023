import psycopg2 as bd

conexion = bd.connect(user='posrgres', password= 'admin', host='127001', port='5432',database='test_bd')
try:
    conexion.autocommit = False
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES(%s, %s, %s)'
    valores = ('María', 'Esparza', 'mesparza@gmail.com')
    cursor.execute(sentencia, valores)
    conexion.commit()
    print('termina la transacción')
except Exception as e:
    conexion.rollback()
    print(f'Ocurriò un error:{e}')
finally:
    conexion.close()