# Conjetura_Collatz

    *********************************************************************************************
    *********************************************************************************************
    
        $$$$$$$$$$$$$$$$$$        $$$$$                $$$$$             $$$$$$$$$$$$$$$$
        $$$$$$$$$$$$$$$$$$        $$$$$$              $$$$$$           $$$$$$$$$$$$$$$$$$$$            
        $$$$$                     $$$$$$$            $$$$$$$         $$$$$$   
        $$$$$                     $$$$$$$$          $$$$$$$$        $$$$$$   
        $$$$$                     $$$$$$$$$        $$$$$$$$$         $$$$$$             
        $$$$$$$$$$$$$$$$$$        $$$$$ $$$$      $$$$ $$$$$          $$$$$$$$$$$$$$$$$$$
        $$$$$$$$$$$$$$$$$$        $$$$$  $$$$    $$$$  $$$$$            $$$$$$$$$$$$$$$$$$$
        $$$$$                     $$$$$   $$$$  $$$$   $$$$$                          $$$$$$
        $$$$$                     $$$$$    $$$$$$$$    $$$$$                           $$$$$$        
        $$$$$                     $$$$$     $$$$$$     $$$$$                          $$$$$$
        $$$$$$$$$$$$$$$$$$        $$$$$                $$$$$          $$$$$$$$$$$$$$$$$$$$
        $$$$$$$$$$$$$$$$$$        $$$$$                $$$$$            $$$$$$$$$$$$$$$$
        
    *********************************************************************************************
    ********************************************************************************************* 
    
    
    Practica Extra  -->  Conjetura de collatz
    Eric Montoliu Sanchez 04/10/2021
    
    
    Funcion del programa:    
    Crear un programa que sigui capaç de averiguar si un nombre cumpleix amb la conjetura de Collatz,
    la conjetura estableix que si tens un nombre parell es dividira entre 2, i si es senar es multiplicara
    per 3 i se li sumara 1, la cojetura diu que per a cualsevol nombre enter positiu que donis seguint la pauta de dividir
    i multiplicar sempre acabas en 1, i per tant entrant en un bucle.
    
    
    Aclaraciones:
    En este programa para determinar si un numero nos acabara llevando hasta el 1 hacemos uso de una lista, la qual vamos a llamar lista de
    numeros finalizadores(numFinales), para codificar los valores de esta lista de manera que sean facilmente accesibles a la hora de leerla
    esta codificada en 0 y 1, 0 si el valor asignado aun no hemos comprobado si llega a 1 o bien este no llega nunca, y 1 para aquellos 
    valores que sabemos que en algun momento nos acabaran llevando al 1, y con ello al bucle 1-4-2-1.
    Para saber a que valor hace referencia cada 1 y 0 haremos uso de los indices de la propia lista, descartando el indice 0 para cuadrar
    los valores con los indices, de esta manera el valor 1 estara codificado como 1 o 0 en el indice 1 de la lista, y el valor 25 estara
    codificado como 0 o 1 en el indice 25. De esta manera nos sera mucho mas facil comprovar si un numero es finalizador o no, ademas
    de ser mucho mas sencillo haciendo uso de una lista temporal(numFinalesTemp) de codificar nuevos valores.
    
    Ej.
    Indices dela lista --> [0,1,2,3,4,5,6,7,8]
    Lista finalizadora --> [0,1,1,0,1,0,0,0,1]
    
    Dada esta lista podemo ver facilmente que los valores fijados en 1 (1,2,4,8) son valores finalizadores
