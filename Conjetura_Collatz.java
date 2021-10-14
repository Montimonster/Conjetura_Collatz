/*
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

*/
         
/*
Importamos las librerias necesarias
Java.util.Scanner
Java.util.list
Java.util.array
Java.util.collections
*/
import java.util.*;

public class ConjeturaCollatz  {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Introduccion de variables enteras
        int numSerie;           //Variable usada para registrar el progreso del numero de la serie
        int iteracion = 1;      //variable usada para contear el numero de iteraciones necesarias para finalizar

        //Introduccion de listas
        List<Integer> numFinales = new ArrayList<>();           //Lista para almacenar los numeros finalizadores
        numFinales.add(0);      //Añadimos un 0 al inicio de la lista para inabilitar el indice 0
        numFinales.add(1);      //Añadimos un 1 en el indice 1 para marcarlo como valor de finalizacion

        List<Integer> numFinalesTemp = new ArrayList<>();       //Lista temporal para almacenar los numeros de cada serie hasta que sean añadidos a la lista principal
        
        //Introduccion de variable boleanas
        boolean finalSerie = false;         //Varable para marcar el fin de cada serie (Cuando una serie llega a un valor finalizador)
        
   
        //Iniciamos el programa imprimiendo por pantalla las opciones disponibles
        System.out.println("Programa para verifirar o bien que un numero cumple con la funcion de Collatz o bien para comprobar una serie de numeros");
        System.out.println("Selecciona 1 para verificar un solo numero");
        System.out.println("Selecciona 2 para verificar un rango de numeros");
        System.out.print("Selecciona: 1 / 2 : ");

        //Guardamos la opcion escojida en una variable auxiliar llamada opcion
        int opcion = sc.nextInt();

        
        if (opcion == 1) {

            /*
            Esta opcion sera usada para verificar un solo numero, la serie terminara una vez el numero introducido (numSerie) llegue a un valor
            de finalizacion, en este caso el unico valor establecido es el 1, por lo tanto la serie continuara hasta llegar a 1
            */

            //Introducimos el valor a comprobar
            System.out.print("Introduce un valor para comprobarlo: ");
            numSerie = sc.nextInt();

            System.out.println("Probamos el numero " + numSerie);


            /*Iniciamos un while que sera el que se encarge de ir calculando en cada iteracion el valor de numSerie y comprobar 
            si este es un valor de finalizacion*/
            while (!finalSerie) {                  

                /*Este if del programa es el engargado de determinar si el numero es par o no, y calcular el valor siguiente dependiendo 
                de si es par o no*/
                if (numSerie % 2 != 0) {

                    /*Ademas de calular el valor imprimiremos por pantalla informacion como el valor actual de numSerie, 
                    el numero de iteracion, y el valor despues del calculo*/
                    System.out.print("Numero: " + numSerie + ", iteracion num. " + iteracion + ", impar --> " + numSerie + " x 3 + 1 = ");
                    numSerie = numSerie * 3 + 1;
                    System.out.println(numSerie);
                    
                }else {

                    /*Ademas de calular el valor imprimiremos por pantalla informacion como el valor actual de numSerie, 
                    el numero de iteracion, y el valor despues del calculo*/
                    System.out.print("Numero: " + numSerie + ", iteracion num. " + iteracion + ", par   --> " + numSerie + " / 2 = ");
                    numSerie = numSerie / 2;
                    System.out.println(numSerie);

                }
                

                //Como en este caso el unico valor de finalizacion es 1 solo tenemos que comprovar si numSerie es igual a 1
                if(numSerie == 1) {

                    //En caso de termiar la serie establecemos la variable de finalizacion finalSerie a true e imprimimos por pantalla
                    finalSerie = true;
                    System.out.println("Numero: 1, iteracion num. " + iteracion + ", fin de la serie");

                }       
                
                /*En cada bucle del while sumamos una iteracion, no pasa nada porque esta suma se lleve a cabo despues de finalizar
                aunque numSeerie sea igual a 1, ya que este valor no se volvera a usar una vez esta condicion se de*/
                iteracion += 1;
                
            }          
            
        }else {

            /*
            Esta opcion sera usada para verificar un rango de numeros, en este caso cada serie finalizara al llegar a un valor de finalizacion.
            Al inicio para la primera serie el unico valor de finalizacion sera 1, pero estos se iran actualizando tras finalizar cada una de
            */

            /*Introducimos valores como el inicio i el final del rango, para evitar problemas a la hora de leer las listas el valor minimo del
            rango ha de ser 2, ya que sino habria probleas a la hora de comprobar los valores de finalizacion, ya que se crearian conflicos conflicos
            con los indices de las listas*/
            System.out.println("El valor minimo del rango ha de ser 2");
            System.out.print("Inicio del rango: ");
            int inicioSerie = sc.nextInt();         //Iniciamos una variable auxiliar para establecer el inicio del rango
            System.out.print("Final del rango: ");
            int finSerie = sc.nextInt();            //Iniciamos una variable auxiliar para esta blecer el fin del rango


            //Creamos un for que empezara en el inicio del rango y llegara hasta el final del rango
            for (;inicioSerie <= finSerie; inicioSerie++) {

                //Establecemos numSerie, que al igual que antes sera el valor que se usara para hacer el calculo de la serie al valor del for
                numSerie = inicioSerie;
                System.out.println("Probando el " + numSerie);


                /*Comprobamos si el valor de la serie es un valor de finalizacion antes de empezar a hacer calculos, para ello haremos uso de
                la lista con los valores de finalizacion.
                Devido al metodo usado para almacenar los valores finalizadores cada inice de la lista [0,1,2,3,4,...] respresenta un posible
                valor finalizador, por ello sabemos que si los indices de la lista solo llegan hasta el 10 el valor 20 no puede ser un valor
                finalizador ya que estos solo lleguan hasta el 9. El hecho de que solo lleguen hasta el 9 es devido a que las listas empiezan
                con un indice 0 por lo tanto si el tamaño de la lista es de 10 indices estos iran del 0-9.
                */
                //Comprovamos que el valor de la serie(numSerie) no sea mayor o igual al numero de indices de la lista de numeros finalizadores
                if(numSerie < numFinales.size()) {   

                    //Comprobamos que el indice de la lista que corresponde al valor de la serie sea un 1, el cual indica que es finalizador
                    if (numFinales.get(numSerie) == 1) {

                        //En caso de ser un valor finalizador establecemos el final de la serie
                        finalSerie = true;
                        System.out.println("El numero " + numSerie + " es un valor de flnalizacion, pasando al siguiente numero");

                    }

                }

                /*Al igual que en la otra opcion creamos un while encargado de ir calculando en cada iteracion el valor
                de numSerie y comprobar si este es un valor de finalizacion, ademas en cada iteracion se iran añadiendo los valores
                de la serie a la lista finalizadora temporal y una vez se compruebe que la serie termina en uno se actualizara la lista
                de valores finalizadores con los valores de esta lista temporal*/
                while (!finalSerie) {

                    //Añadimos el valor de la serie a la lista de finalizadores temporal
                    numFinalesTemp.add(numSerie);
        

                    /*Este if del programa es el engargado de determinar si el numero es par o no, y calcular el valor siguiente dependiendo 
                    de si es par o no*/
                    if (numSerie % 2 != 0) {

                        System.out.print("Numero: " + numSerie + ", iteracion num. " + iteracion + ", impar --> " + numSerie + " x 3 + 1 = ");
                        numSerie = numSerie * 3 + 1;
                        System.out.println(numSerie);
                        
                    }else {

                        System.out.print("Numero: " + numSerie + ", iteracion num. " + iteracion + ", par   --> " + numSerie + " / 2 = ");
                        numSerie = numSerie / 2;
                        System.out.println(numSerie);

                    }

                    //Depues de calcular cada nuevo valor de la serie se suma 1 iteracion
                    iteracion += 1;


                    /*Este bloque sera el encargado de determinar si el valor de la serie es un valor de finalizacion, y ademas sera el
                    encargado de en caso de ser el final de la serie actualizar la lista de finalizadores*/

                    //Al igual que antes comprovamos que numSerie no sea mayor o igual al numero de indices de la lista finalizadora
                    if(numSerie < numFinales.size()) {

                        //De nuevo comprovamos si la lista finalizadora indica si el valor de la serie es finalizador o no
                        if (numFinales.get(numSerie) == 1) {

                            //En caso de serlo se establece el final de la serie
                            finalSerie = true;
                            System.out.println("Iteracion num. " + iteracion + ", fin de la serie,  el valor es igual a un valor de finalizacion, " + numSerie);


                            /*Para actualizar la lista de finalizadores lo primero sera determinar si los indices de los cuales disponemos
                            son suficientes para añadir todos los nuevos valores, para ello necesitamos conocer el valor maximo de los valores
                            a introducir, para ello lo que haremos sera ordenar la lista temporal de menor a mayor, quedando asi el mayor valor
                            en el ultimo indice, el qual conseguiremos restando 1 al tamaño de la lista (numFinalesTemp.size()-1) */
                            
                            //Ordenamos la lista temporal
                            Collections.sort(numFinalesTemp);

                            /*Comprovamos si sera necesario añadir indices a la lista finalizadora, comprovando si el numero de indices viables
                            es menor al ultimo valor de la lista temporal (el mayor valor a introducir) */
                            if (numFinales.size() - 1 < numFinalesTemp.get(numFinalesTemp.size() - 1)) {
                                
                                /*En caso de requerir indices adicionales calculamos cuantos de ellos necesitamos. Para ello cogeremos el valor
                                maximo a añadir, el ultimo valor de la lista temporal (numFinalesTemp.get(numFinalesTemp.size()-1)) y le restamos
                                los indices que ya tenemos disponibles, los cuales son el tamaño de la lista finalizadora menos 1, devido a que
                                los indices de las listas comienzan por 0, y este incice no lo estamos contando */
                                int posricionesFaltantes = numFinalesTemp.get(numFinalesTemp.size() - 1) - (numFinales.size() - 1);

                                //Una vez calculados los indices necesarios a añadir creamos un for para que los añada
                                for (int i=0; i < posricionesFaltantes; i++){
                                    numFinales.add(0);
                                }

                            }
            

                            /*Una vez temenos la lista finalizadora lista para añadir los nuevos valores ya podemos actualizara, para ello
                            iremos recoriendo la lista temporal desde el inicio(indice 0), hasta el final(numFinalesTemp.size()), para 
                            ir añadiendo los valores uno a uno */
                            for (int i=0; i<numFinalesTemp.size();i++) {
            
                                /*A la hora de añadirlos lo unico que tenemos que hacer es fijar el valor del indice que coresponde a cada valor
                                a 1, ya que usamos el 1 para indicar que es un valor de finalizacion y 0 para indicar que no, o no lo hemos 
                                comprobado aun */

                                //Comprobamos que el indice que corresponde al valor a añadir este fijado en 0
                                if (numFinales.get(numFinalesTemp.get(i)) == 0){

                                    //En caso de ser 0 lo actualizamos a 1, y en caso de ser 1 no necesitamos hacer nada
                                    numFinales.set(numFinalesTemp.get(i), 1);

                                }
            
                            }

                            //Imprimimos que la lista se ha actualizado y mostramos los nuevos valores añadidos
                            System.out.println("Lista de numeros finalizadores actualizada, numeros añadidos: ");
                            System.out.println(numFinalesTemp);

                        }
                    }           
                    
                }               

                //Imprimimos en blanco par dejar un pequeño espaciado entre cada serie
                System.out.println("");
                
                numFinalesTemp.clear();     //Limpiamos la lista temporal
                iteracion = 1;              //Restavlecemos las iteraciones a 1 para la siguiente serie 
                finalSerie = false;         //Restableceoms el valor de finalizacion a falso para la siguiente serie

            }

        }

    }

}
