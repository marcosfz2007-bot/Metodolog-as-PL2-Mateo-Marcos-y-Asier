# ejercicioejemplo1

## Qué hace este ejercicio
Este ejercicio muestra el caso más básico de persistencia con Gson: crear un objeto Java, convertirlo a JSON y mostrar el resultado por consola.

## Archivos
- `Persona.java`: clase sencilla con nombre y edad.
- `MainJsonSimple.java`: crea una persona y la convierte a JSON.

## Compilar
```bash
mvn package
```

## Ejecutar
```bash
java -jar target/ejercicioejemplo1-1.0-SNAPSHOT.jar
```


## Relación con la primera parte de la práctica
En este ejercicio también se aplica la parte de excepciones. Aunque aquí el tema principal es JSON, al trabajar con ficheros siempre puede haber errores de lectura o escritura. Por eso se usan bloques `try-catch` y se controla la excepción `IOException` dentro de `GsonUtil`. En `ejercicio4`, además, se valida la operación introducida por el usuario y se usa un `try-catch` sencillo con `IllegalArgumentException` para que el programa no termine de forma brusca.
