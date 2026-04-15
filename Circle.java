# ejercicio1

## Qué hace este ejercicio
Este ejercicio guarda y lee en JSON varias clases de cuadernos anteriores, para demostrar que la persistencia funciona con tipos de objetos diferentes.

## Clases incluidas
- `Employee`
- `InvoiceItem`
- `Author`
- `Book`
- `CircleGO`
- `RectangleGO`
- `GeometricObject`
- `Circle`
- `Cylinder`
- `GsonUtil`
- `MainEjercicio1`

## Compilar
```bash
mvn package
```

## Ejecutar
```bash
java -jar target/ejercicio1-1.0-SNAPSHOT.jar
```


## Relación con la primera parte de la práctica
En este ejercicio también se aplica la parte de excepciones. Aunque aquí el tema principal es JSON, al trabajar con ficheros siempre puede haber errores de lectura o escritura. Por eso se usan bloques `try-catch` y se controla la excepción `IOException` dentro de `GsonUtil`. En `ejercicio4`, además, se valida la operación introducida por el usuario y se usa un `try-catch` sencillo con `IllegalArgumentException` para que el programa no termine de forma brusca.
