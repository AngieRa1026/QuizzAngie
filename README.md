Instrucción:
Escribe un programa que solicite al usuario un número entero positivo n y genere un patrón numérico en forma de triángulo. El patrón debe seguir una secuencia donde cada línea comienza con el número de línea y aumenta hasta n, y luego disminuye hasta el número de línea nuevamente.
Ejemplo de salida para n = 5:
        5 4 3 2 1
      4 5 4 3 2
    3 4 5 4 3
  2 3 4 5 4
1 2 3 4 5

1. Insertar la biblioteca Scanner
necesito usar un scanner para pedirle al usuario que me ingrese un numero.
ese numero debe ser un entero positivo, entonces voy a usar un int:

voy a usar un if para decirle que si el numero es mayor que 0 entonces es un entero positivo. sino, entonces que el numero que ingreso no es entero positivo.

nombro la variable como num1, indicando que ahi se guardara el numero ingresado por el usuario.

voy a usar un for para realizar el triangulo de numero, en el que va a controlar las lineas del patron desde el 1 hasta num1, y donde i representa el numero de la linea actual

para alinear los espacios usamos un for dentro del que ya tenemos, en ese bucle agregamos los espacios iniciales para alinear el triangulo.

usamos otro for para imprimir los numeros en orden ascendente desde i hasta num1

usamos otro for para imprimir los numeros en forma descendente desde num1-1 hasta i

por ultimo se imprime 