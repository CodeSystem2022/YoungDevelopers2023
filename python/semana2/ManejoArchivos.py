class ManejoArchivos:
    def __init__(self, nombre):
        self.nombre = nombre

    def __enter__(self):
        print('Obtenemos el recurso'.center(50,'_'))
        self.nombre = open(self.nombre, 'r', encoding='utf8') # Enacapsulamos el codigo dentreo del metodo
        return self.nombre
    def __exit__(self, tipo_exception, valor_exception, traza_error):
        print('Cerramos el recurso'.center(50,'-'))
        if self.nombre:
            self.nombre.close() # Caerramos el archivo