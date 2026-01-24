# Actividad 2
## Introducción
En esta actividad realizaremos dos ejercicios prácticos en Java, en la primera parte trabajamos con la clase String y con estructuras de selección, además de la entrada de datos mediante Scanner para personalizar la interacción con el usuario, y en la segunda parte aplicamos nuestros conocimientos vistos en clase como pueden ser los bucles y los arreglos, buscando entender mejor su funcionamiento y el como podemos automatizar y organizar mejor la información.

## Explicación parte 1:
Comenzando por la parte 1, las instrucciones nos indican que debemos crear un programa Java que solicite al usuario ingresar un nombre, y usar una estructura de selección para verificar si el String ingresado coincide con uno que yo haya definido previamente para mostrar un mensaje personalizado.
La temática del programa la escogí yo, decidí que seria un sistema de acceso a la oficina del director, el código completo es el que adjuntare a continuación.

Comenzando por la primera línea, lo que hice fue importar el Scanner de la biblioteca de
utilidades de Java.Después de eso creo la clase parte1, que es donde esta guardado el método
main donde contiene el código del programa, todo el código lo guardé aquí ya que no hubo
necesidad de crear más métodos; pues el programa es simple.
Dentro del método main comencé creando mi objeto tipo scanner ‘lector’, que será utilizado
para la entrada de cadenas de texto del usuario, después imprimiendo en la terminal la
bienvenida al sistema, donde escribo además un mensaje avisando al usuario que, si escribe
‘salir’, el programa finalizará.

Decidí meter todo el código dentro de un bucle while, con condición (true) para que el ciclo
siempre se inicie, en el que le pido la entrada de el nombre al usuario. Para comparar el
contenido de la cadena, usamos el método equals(), y para aprender más acerca de la clase
String, guardé el nombre del director dentro de un objeto tipo string llamado ‘director’, pero en
caso de que el usuario quiera finalizar el programa, el salir no esta dentro de un objeto que yo
haya creado anteriormente, dentro del paréntesis del equals() escribí entre comillas el
contenido a comparar, que también es un objeto, pero ahorrándome una línea de código, ya
que no tuve que crear el objeto como en el caso del director.

## Explicación parte 2:
Continuando con la parte 2, las instrucciones solicitan desarrollar un programa que genere una
lista de números pares del 2 al 100, los almacene en un arreglo y finalmente los muestre en
pantalla. Para lograr esto, utilicé estructuras de repetición y la gestión de arreglos de tamaño
fijo.

Al igual que en el ejercicio anterior, todo el código se encuentra dentro del método main, ya
que la lógica es lineal y directa. A continuación, detallo el proceso paso a paso:

Comencé declarando un arreglo de enteros llamado arreglo e inicializándolo con un tamaño
de 50. Esto es debido a que, matemáticamente, existen exactamente 50 números pares en el
rango del 2 al 100.

Utilicé una variable de control llamada numeroPar inicializada en 2. Mediante un ciclo for,
recorrí el arreglo desde la posición 0 hasta su longitud total (arreglo.length). En cada iteración,
asigné el valor actual de numeroPar a la posición correspondiente del arreglo y luego
incrementé dicha variable en 2 para preparar el siguiente número par.

Una vez que el arreglo estuvo completamente lleno, utilicé un segundo ciclo for para recorrerlo
de nuevo. En esta etapa, el programa simplemente imprime cada valor almacenado en la
consola, permitiendo verificar que la secuencia se generó correctamente.

### Enlace del repositorio de GitHub:
https://github.com/oscar-reyes-delgado/java

## Conclusión:
Para concluir, esta actividad me permitió consolidar el uso de las herramientas básicas de
Java. Al implementar tanto el sistema de acceso como la generación de números pares, pude
comprender mejor cómo interactúan las estructuras de control con el almacenamiento de
datos. Estos ejercicios demostraron ser fundamentales para entender la lógica detrás de la
automatización de tareas y la toma de decisiones dentro del código.