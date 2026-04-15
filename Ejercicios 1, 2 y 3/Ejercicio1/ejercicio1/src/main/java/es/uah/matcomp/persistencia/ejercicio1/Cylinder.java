package es.uah.matcomp.persistencia.ejercicio1; // Paquete al que pertenece la clase.

// Esta clase representa un cilindro.
// Hereda de Circle, así que reutiliza el radio, el color y el cálculo del área de la base.
public class Cylinder extends Circle {

    private double height; // Altura del cilindro.

    // Constructor vacío.
    // En este caso solo se pone la altura a 1.0.
    // El resto lo hereda del constructor por defecto de Circle.
    public Cylinder() {
        this.height = 1.0;
    }

    // Constructor que recibe solo el radio.
    // Se lo pasa al constructor de la clase padre.
    public Cylinder(double radius) {
        super(radius);
    }

    // Constructor que recibe radio y altura.
    public Cylinder(double radius, double height) {
        super(radius);      // Llama al constructor de Circle para asignar el radio.
        this.height = height; // Guarda la altura.
    }

    // Constructor completo: radio, altura y color.
    public Cylinder(double radius, double height, String color) {
        super(radius, color); // Llama al constructor de Circle con radio y color.
        this.height = height; // Guarda la altura.
    }

    // Devuelve la altura del cilindro.
    public double getHeight() {
        return height;
    }

    // Permite cambiar la altura.
    public void setHeight(double height) {
        this.height = height;
    }

    // Calcula el volumen del cilindro.
    // La fórmula es área de la base por altura.
    public double getVolume() {
        return getArea() * height;
    }

    // Devuelve una representación en texto del cilindro.
    @Override
    public String toString() {
        return "Cylinder[subclase de " + super.toString() + ", height=" + height + "]";
    }
}
