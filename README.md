# Proyecto P3: Aplicación de Adopción de Perros

Este trabajo consiste en una aplicación desarrollada para Android que funciona como un visor de animales para un refugio de perros. Hemos tomado como base el modelo del ejercicio de 30 días y lo hemos modificado para manejar una lista de 30 perros diferentes.

### Funcionamiento de la aplicación
La aplicación muestra una lista principal con 30 animales. Para que el uso sea sencillo, se ha incluido una barra inferior con diferentes modos de visualización. Estos modos permiten filtrar la lista para mostrar específicamente a los machos o a las hembras. Además, la aplicación incluye una opción para guardar perros como favoritos, lo que permite consultarlos de forma independiente más tarde.

Cada ficha de la lista es interactiva y se puede expandir al tocarla. Al hacerlo, se muestra información detallada sobre lo que le gusta al perro y sus necesidades. En cuanto al aspecto visual, las fotos aparecen inicialmente con un efecto de fondo desenfocado que desaparece al abrir la ficha, mostrando la imagen con total claridad.

### Organización del código
El código se reparte en tres partes clave. En el archivo Dog.kt se define la estructura de datos de cada perro con sus campos fijos. El archivo DogLists.kt funciona como el almacén de datos donde se guarda la información de los 30 animales. Por último, MainActivity.kt maneja la interfaz de usuario, controlando la expansión de las fichas y la lógica de los filtros.

### Detalles técnicos
Nos hemos enfocado en que el movimiento por la lista sea fluido. El sistema identifica correctamente cada perro para evitar errores visuales al usar los filtros de categorías. Los botones de la barra inferior se mantienen siempre iluminados para indicar al usuario que son elementos interactivos que puede pulsar en cualquier momento.

Víctor Pérez, Javier Benito y Gloria Jiménez.
