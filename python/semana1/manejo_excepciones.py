from NumerosIgualesException import NumerosIgualesException

resultado = None

try:
    a = int(input('Digite el primer número: '))
    b = int(input('Digite el segundo número: '))
    if a == b:
        raise NumerosIgualesException('Son números iguales')
    resultado = a / b #modificamos
except TypeError as e:
    print(f'TypeError - Ocurrió un error: {type(e)}') #Se leerá el error mas específico (error de dividir con cadenas)

except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrió un error: {type(e)}') #Se leerá el error mas específico (no dividir con 0)

except Exception as e:
    print(f'Ocurrió un error: {type(e)}') #Larga una excepción madre, utilizando el comando Exception
else:
    print('No se arrojó ninguna excepción') #en el caso de que no haya ningún error, se ejecuta el else

finally:
    print('Ejecución de este bloque finally') #Siempre se va a ejecutar
print(f'El resultado es: {resultado}')
print('seguimos...')

