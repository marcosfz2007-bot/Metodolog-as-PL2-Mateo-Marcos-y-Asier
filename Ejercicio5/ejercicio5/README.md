# ejercicio5

## Enunciado
El proceso de persistencia, conocido como serialización, permite transformar los objetos Java en datos para poder almacenarlos o enviarlos a través de la red. En este cuaderno lo hemos visto usando el formato de intercambio JSON, pero existen otras formas de hacerlo. Busca información en la documentación oficial de Java y explica qué diferencias encuentras con lo que hemos hecho aquí.

## Respuesta
En este cuaderno hemos trabajado la persistencia utilizando JSON con la librería Gson. Esto consiste en convertir los objetos Java en texto JSON, que después se puede guardar en un fichero y volver a leer. Es un formato fácil de entender, sencillo de modificar manualmente y muy útil para intercambiar datos.

La serialización nativa de Java funciona de manera distinta. En este caso, Java convierte los objetos en un flujo de bytes mediante clases como `ObjectOutputStream` y `ObjectInputStream`. Para que esto sea posible, la clase debe implementar `Serializable`, o `Externalizable` si se quiere tener un control total sobre el formato en el que se guardan los datos.

Una diferencia importante es que la serialización nativa de Java está pensada específicamente para objetos Java y para reconstruir el grafo de objetos completo. Además, almacena información sobre la clase y sobre sus campos serializables. En cambio, con JSON hemos trabajado con una representación textual más sencilla y mucho más fácil de inspeccionar.

Otra diferencia relevante es el control de versiones. En la serialización nativa aparece `serialVersionUID`, que sirve para comprobar si una versión de una clase es compatible con otra al leer datos antiguos. En JSON con Gson, en estos ejercicios no hemos utilizado un mecanismo automático equivalente.

También cambia el nivel de control sobre el proceso. Con `Serializable`, Java aplica un mecanismo por defecto. Con `Externalizable`, en cambio, es la propia clase la que decide cómo escribir y leer sus datos mediante `writeExternal` y `readExternal`.

Por último, en la documentación oficial de Java se insiste mucho en la seguridad al deserializar objetos. Deserializar datos que no son confiables puede ser peligroso, por lo que existen filtros de deserialización. En nuestros ejercicios con JSON no hemos utilizado ese sistema de serialización nativo de Java, sino una conversión de objetos a texto JSON mediante Gson.

## Relación con la parte de excepciones
La primera parte de la práctica también está relacionada con todo esto, porque al trabajar con ficheros y con lectura de datos siempre es necesario controlar los posibles errores. En la práctica de JSON eso se refleja en los `try-catch` de lectura y escritura, así como en la validación de argumentos cuando el programa se ejecuta desde consola.

## Conclusión
Lo que hemos hecho en el cuaderno es más sencillo de entender y más cómodo para una práctica, porque el JSON se puede ver y editar fácilmente. La serialización nativa de Java está más integrada en el propio lenguaje, ofrece más control y gestiona aspectos como la compatibilidad entre versiones y la reconstrucción completa del objeto, pero también es más técnica y exige más cuidado, especialmente en temas de seguridad.
