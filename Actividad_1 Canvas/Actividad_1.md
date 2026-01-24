# Introducción
En esta actividad se realizaremos una clase en java, que es similar a un molde el cual podemos utilizar crear fácilmente objetos, la clase misma tiene atributos y métodos, y sirve en general para ahorrar partes de código y tener que escribir menos, además de que nos sirve a que el código sea aun mas modular y en un futuro pueda escalar a cosas más grandes.
 
Antes de comenzar a escribir código, el lenguaje UML nos ayuda a programar con dirección, para esta clase, escogí la idea de un alumno, con los atributos y métodos que se ven en el grafico 

## Creación de la clase para nuestro objeto
Para esta actividad comencé por hacer una carpeta en la que cree dos archivos, el primero fue donde escribí la clase en java, le designe cuatro atributos y tres métodos.

En el primer archivo del código, lo nombre Alumno.java, donde escribimos la clase publica “Alumno”. Nuestra clase está basada en un alumno de una universidad, el cual posee: nombre, semestre, carrera y matricula (esos cuatro son sus atributos). Y entre las actividades que hacen todos los estudiantes, se encuentran las siguientes: Estudiar, mostrar su credencial y asistir a clase (esos tres son sus métodos).

En este caso estamos aplicando el principio de la abstracción tomando únicamente los datos necesarios para el sistema, que en este caso es el nombre, el semestre, matricula y carrera del alumno, un objeto complejo como lo podría ser un humano que acude a una universidad lo fragmente en 4 aspectos importantes que utilizaría en este caso. Además, estamos aplicando el principio de la encapsulación al declarar los nombres como privados, para proteger los datos, impidiendo que otra clase como lo puede ser la principal cambie alguna variable.

Para la creación de los métodos de la clase, elegimos tres actividades que realizaría un alumno, las cuales en este caso son métodos públicos que no retornan algún valor. El primero es estudiar(), el usarlo simula que el estudiante realiza la acción de estudiar para sus exámenes, el segundo es mostrar_credencial(), que imprime en la terminal los datos del estudiante, y el ultimo método, asistencia() simula una asistencia a una clase.

## Creación de la clase principal
El segundo archivo es la clase Principal.java, donde escribimos la clase principal en la cual realizamos un ejercicio con la clase del otro archivo. Como la otra clase está dentro de la misma carpeta, la podemos mandar a llamar junto a sus métodos desde la clase principal

Lo que realiza el archivo es primero que nada importar el escáner de la librería de utilidades de java, luego creamos la clase principal en la que creamos un método publico main donde procederemos a pedir datos para crear nuestro primer objeto con la clase que creamos anteriormente: el alumno.

Declaramos cada tipo de dato para cada una de las variables que necesitamos para crear nuestro objeto, y con el scanner el usuario podrá ingresar los datos en la terminal.

Una vez ya tenemos todos los datos, ya podemos crear el objeto, que funciona parecido a cuando creamos una variable de un numero o string. Creamos una variable tipo “Alumno”, que en este caso se llama alumno1, escribimos que es nueva (new) y le asignamos todos las variables que obtuvimos anteriormente, en el orden en el que las añadimos como parámetro al momento de crear la clase, no pueden ser en otro orden.

Finalmente, usamos los métodos que le asignamos a nuestra clase para visualizar el funcionamiento de nuestro objeto, y cerramos el scanner.

## Ejecución del código
1. El primer paso para ejecutar el código fue abrir la terminal, y compilar los archivos que tenemos, para esto utilizamos el comando“javac Alumno.java Principal.java”, después de un segundo se concreta el proceso y se crean los dos archivos de clase en la misma carpeta, tienen la diferencia de que en vez de .java su terminación es .class.

2. El segundo paso fue ejecutar el principal, para esto utilizamos el comando “java Principal.java”, el código se va a ejecutar, llenamos los datos que nos pide y sigue las instrucciones que programamos, al final vamos a ver que se pudieron ejecutar correctamente los métodos, confirmando la creación del objeto y funcionamiento de los métodos.

## Conclusión
En conclusión, realizar esta actividad me ayudó bastante a entender cómo funciona realmente
la programación orientada a objetos más allá de la teoría. Al diseñar la clase "Alumno", pude
notar la importancia de la abstracción, ya que tuve que decidir qué datos eran realmente útiles
para el sistema y cuáles descartar.

También entendí que la encapsulación no es solo poner las variables en private porque sí, sino
que es una medida de seguridad necesaria para proteger la información importante, como lo
puede ser la matricula en mi caso, y evitar errores en el código. Además, aprendí que hacer el
diagrama UML antes de empezar a tirar código en Java es muy útil, porque funciona como un
plano que te guía y hace que programar la lógica sea mucho más rápido y ordenado.