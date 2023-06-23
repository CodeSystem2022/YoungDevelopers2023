import psycopg2

conexion = psycopg2.connect(
    user='postgres1',
    password='mica',
    host='127.0.0.1',
    port='5432',
    database='test_db'
)
print(conexion)

#vamos a crear un cursor que nos permite ejecutar sentencias sql en postgres
cursor = conexion.cursor()
sentencia= 'SELECT *FROM persona'
cursor.execute(sentencia)
#recuperamos registro,fetchall nos permite  recuperar todos los registros
# de la sentencia que se ha ejecutado
registros = cursor.fetchall()




