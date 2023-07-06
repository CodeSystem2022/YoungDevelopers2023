
archivo = open('prueba.txt','r', encoding='utf8') #Las letras son: 'r' read, 'a' append, 'w' write, 'x'
# print(archivo.read())
# print(archivo.read(16))
# print(archivo.read(10)) #Continuamos desde la linea anterior
# print(archivo.readline())
# print(archivo.readline())

# Vamos a iterear el archivo, cada una de las linaas
# for linea in archivo:
 #print(linea): iterarmos todos los elementos del archivo
# print(archivo.readlinrs()[11] # acceddemos al archivo como si fuera una lista

# A nexamos informacion, copiamos a otro
archivo2 = open('copia.txt','w', encoding='utf8')
archivo2.write(archivo.read())
archivo.close() # cerramos el primer archivo
archivo.close() # cerramos el segundo archivo
