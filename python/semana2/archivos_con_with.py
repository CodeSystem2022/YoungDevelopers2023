from ManejoArchivos import ManejoArchivos
# MANEJO DE CONTEXTO WTIH: Sintaxis simplificada, abre y cierra el archivo
# with open('prueba.txt', 'r', encoding='utf8')as archivo:
  #  print(archivo.read())
# No hace dalta el tray, ni el finally
# en el contexto de with lo que se ejcuta de manera automatica
# Utiliza diferentes métodos: __enter__ este es el que abre
#Ahora el siguiente metodo es el que cierra: __exit__

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())