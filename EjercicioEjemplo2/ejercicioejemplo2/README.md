# ejercicioejemplo2

## Qué hace este ejercicio
Este ejercicio enseña cómo guardar un objeto en un fichero JSON y cómo volver a leerlo después.

## Archivos
- `Persona.java`: clase de datos.
- `GsonUtil.java`: clase auxiliar para guardar y cargar.
- `GsonFicheroDemo.java`: crea el JSON en fichero y lo lee.
- `JsonSoloLecturaDemo.java`: solo lee un JSON ya existente.

## Compilar
```bash
mvn package
```

## Ejecutar el ejemplo principal
```bash
java -jar target/ejercicioejemplo2-1.0-SNAPSHOT.jar
```

## Ejecutar solo lectura desde IntelliJ
Usa la clase `JsonSoloLecturaDemo` cuando ya exista el fichero `persona.json`.


## Relación con la primera parte de la práctica
En este ejercicio también se aplica la parte de excepciones. Aunque aquí el tema principal es JSON, al trabajar con ficheros siempre puede haber errores de lectura o escritura. Por eso se usan bloques `try-catch` y se controla la excepción `IOException` dentro de `GsonUtil`. En `ejercicio4`, además, se valida la operación introducida por el usuario y se usa un `try-catch` sencillo con `IllegalArgumentException` para que el programa no termine de forma brusca.
