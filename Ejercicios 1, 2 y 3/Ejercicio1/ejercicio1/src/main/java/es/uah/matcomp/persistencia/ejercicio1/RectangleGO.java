package es.uah.matcomp.persistencia.ejercicio1; // Paquete donde está esta clase.

// Esta clase representa un rectángulo y también implementa la interfaz GeometricObject.
class RectangleGO implements GeometricObject {

    private double width;   // Ancho del rectángulo.
    private double length;  // Largo del rectángulo.

    // Constructor que recibe ancho y largo.
    public RectangleGO(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Calcula el área del rectángulo.
    @Override
    public double getArea() {
        return width * length;
    }

    // Calcula el perímetro del rectángulo.
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Devuelve el objeto en texto para imprimirlo más claro.
    @Override
    public String toString() {
        return "RectangleGO[width=" + width + ", length=" + length + "]";
    }
}
