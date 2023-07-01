from logger_base import log
import psycopg2 as bd
import sys
class Conexion:
    _DATABASE = 'test_db'
    _USERNAME = 'postgres'
    _PASSWORD= 'mica'
    _DB_PORT ='5432'
    _HOST = '127.0.0.1'
    _conexion = None
    _cursor = None

    @classmethod
    def obtenerConexion(cls):
        if cls._conexion is None:
            try:
                cls._conexion =bd.connect(host=cls._HOST,
                                          user=cls._USERNAME,
                                          password=cls._PASSWORD,
                                          port=cls._DB_PORT,
                                          database=cls._DATABASE
                                          )
                log.debug(f'conexion exitosa:{cls._conexion}')
                return cls._conexion
            except Exception as e:
                log.debug(f'ocurrio una excepcion {e}')
                sys.exit()
        else:
            return cls._conexion

    @classmethod
    def obtenerCursor(cls):
        if cls._cursor is None:
            try:
                cls._cursor=cls.obtenerConexion().cursor()
                log.debug(f'se abrio correctamente el cursor:{cls._cursor}')
                return cls._cursor
            except Exception as e:
                log.error(f'ocurrio una excepcion al obtener cursor: {e}')
                sys.exit()
        else:
            return cls._cursor

if __name__=='__main__':
    Conexion.obtenerConexion()
    Conexion.obtenerCursor()