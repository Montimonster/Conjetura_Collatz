# Conjetura_Collatz
    
    
La formulación de la conjetura es muy simple. Dado un número entero positivo x cualquiera, se aplica la siguiente operación (que se suele denominar función C): si x es par se     divide entre 2; si x es impar se multiplica por 3 y se suma 1. El resultado es un nuevo número, C(x). Se puede repetir esta misma operación con C(x), obteniendo otro número       C(C(x)), y así sucesivamente. Por ejemplo, empezando con el número 12, aplicando este proceso se obtienen los números 6, 3, 10, 5, 16, 8, 4, 2, 1, 4, 2 ,1, etc. La conjetura       de Collatz dice que, sea cual sea el número x inicial, tras un número finito de repeticiones de la operación se llega a 1.

En este programa para determinar si un numero nos acabara llevando hasta el 1 hacemos uso de una lista, la qual vamos a llamar lista de numeros finalizadores(numFinales), para     codificar los valores de esta lista de manera que sean facilmente accesibles a la hora de leerla esta codificada en 0 y 1, 0 si el valor asignado aun no hemos comprobado si       llega a 1 o bien este no llega nunca, y 1 para aquellos valores que sabemos que en algun momento nos acabaran llevando al 1, y con ello al bucle 1-4-2-1. Para saber a que         valor hace referencia cada 1 y 0 haremos uso de los indices de la propia lista, descartando el indice 0 para cuadrar los valores con los indices, de esta manera el valor 1         estara codificado como 1 o 0 en el indice 1 de la lista, y el valor 25 estara codificado como 0 o 1 en el indice 25. De esta manera nos sera mucho mas facil comprovar si un       numero es finalizador o no, ademas de ser mucho mas sencillo haciendo uso de una lista temporal(numFinalesTemp) codificar nuevos valores.
    
Ej.
Indices dela lista --> [0,1,2,3,4,5,6,7,8]      
Lista finalizadora --> [0,1,1,0,1,0,0,0,1]
    
Dada esta lista podemo ver facilmente que los valores fijados en 1 corresponden a los valores (1,2,4,8)
