# Declaramos una variable
try:
    archivo = open("prueba.txt", 'w', encoding = 'utf8') #La w es de write que en significa escribir
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('Los acentos son importante para las palabras\n')
    archivo.write('Como por ejemplo: acción, ejecución y producción\n')
    archivo.write('Las letras son:\nr read leer, \na append anexa, \nw write escribe, \nx crea un archivo')
    archivo.write('\nt esta es para texto o texto, \nb archivos binaririos,\nw+ lee y escribe son iguales r+\n')
    archivo.write('')
    archivo.write('\nCon esto terminamos')
except Exception as e:
    print(e)
finally: #Siempre se ejecuta
    archivo.close() # Con esto se debe cerrrar el archivo
#archivo.write('Todo quedo perfecto'): este es un error