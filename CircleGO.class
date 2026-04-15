package es.uah.matcomp.persistencia.ejercicio1; // Paquete donde está la clase.

// Esta clase representa otro tipo de círculo,
// pero en este caso implementa la interfaz GeometricObject.
class CircleGO implements GeometricObject {

    private double radius; // Radio del círculo.

    // Constructor que recibe el radio al crear el objeto.
    public CircleGO(double radius) {
        this.radius = radius;
    }

    // Calcula el área del círculo.
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Calcula el perímetro del círculo.
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Devuelve una representación en texto del objeto.
    @Override
    public String toString() {
        return "CircleGO[radius=" + radius + "]";
    }
}