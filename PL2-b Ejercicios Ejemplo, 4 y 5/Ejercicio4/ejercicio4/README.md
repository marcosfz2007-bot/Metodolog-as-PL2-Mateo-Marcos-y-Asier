# ejercicio4

## Qué hace este ejercicio
Este es el ejercicio principal de la entrega.
Permite crear un fichero JSON con `init` y mostrarlo con `show`.
Además incluye un ejemplo con `Asignatura` y una lista de alumnos.

## Compilar
```bash
mvn package
```

## Ejecutar
```bash
java -jar target/ejercicio4-1.0-SNAPSHOT.jar init datos.json
java -jar target/ejercicio4-1.0-SNAPSHOT.jar show datos.json
```


## Relación con la primera parte de la práctica
En este ejercicio también se aplica la parte de excepciones. Aunque aquí el tema principal es JSON, al trabajar con ficheros siempre puede haber errores de lectura o escritura. Por eso se usan bloques `try-catch` y se controla la excepción `IOException` dentro de `GsonUtil`. En `ejercicio4`, además, se valida la operación introducida por el usuario y se usa un `try-catch` sencillo con `IllegalArgumentException` para que el programa no termine de forma brusca.
