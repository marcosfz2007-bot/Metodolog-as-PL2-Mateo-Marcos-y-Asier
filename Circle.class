package es.uah.matcomp.persistencia.ejercicio1; // Paquete de la clase.

public class Circle { // Aquí empieza la clase.

    private double radius; // Radio del círculo.
    private String color;  // Color del círculo.

    // Constructor sin parámetros.
    // Si no se da nada, el círculo sale con radio 1.0 y color rojo.
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor que recibe solo el radio.
    // El color se deja por defecto en rojo.
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // Constructor completo: radio y color.
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Devuelve el radio del círculo.
    public double getRadius() {
        return radius;
    }

    // Calcula el área del círculo usando la fórmula PI * r².
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Devuelve el color del círculo.
    public String getColor() {
        return color;
    }

    // Permite cambiar el radio, pero solo si el valor es positivo.
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    // Permite cambiar el color del círculo.
    public void setColor(String color) {
        this.color = color;
    }

    // Muestra el objeto en formato texto.
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}