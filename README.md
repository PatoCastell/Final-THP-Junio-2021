Enunciado
Se solicita desarrollar un programa que regule el funcionamiento de los ascensores de un edificio. 
Del Edificio conocemos los siguientes atributos: la cantidad de pisos y una lista con sus ascensores.


En cuanto al Ascensor, conocemos su número identificador, el piso actual en donde se encuentra parado (inicia en 0) y un funcionamiento (TODOS, PARES, IMPARES). 
Aclaración: Que un ascensor tenga funcionamiento PARES, implica que sólo frena en los pisos pares.


Se nos pide crear lo siguiente en donde corresponda:
•	Constructor de Edificio: Recibe la cantidad de pisos del edificio y la cantidad de ascensores. Setea los atributos correspondientes, instanciando la cantidad de ascensores solicitada. 
•	Método obtenerMasCercano(): recibe un piso y devuelve el ascensor que más cerca se encuentra de dicho piso. Si un ascensor que saltea pisos puede parar en el piso deseado y está igual de cerca que uno que acude a todos, el que va es el primero (el que saltea).  
•	Método llamarAscensor(): recibe un piso por parámetro y llama al ascensor que se encuentra más cerca. Actualiza el número de piso que acudió al llamado y devuelve el número de este ascensor.
•	Método setFuncionamientoSegunNumero(): setea el funcionamiento del ascensor en base a su número identificador. Los primeros dos ascensores del edificio siempre llegan a todos los pisos. A partir del tercero, los que tienen identificador par llegan a los pisos pares, los que tienen identificador impar a los impares.
•	Método puedeParar (): recibe un número de piso y devuelve un booleano indicando si dicho ascensor puede parar al piso indicado. 
Recordá: Hay ascensores que pueden llegar a todos los pisos.

