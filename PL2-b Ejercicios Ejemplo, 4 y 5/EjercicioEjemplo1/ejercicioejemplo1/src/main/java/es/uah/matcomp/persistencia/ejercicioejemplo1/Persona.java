package es.uah.matcomp.persistencia.ejercicioejemplo1; // Paquete al que pertenece esta clase.

// Esta clase representa a una persona de forma muy simple.
// Se usa como ejemplo porque tiene pocos atributos y es fácil ver cómo se pasa a JSON.
public class Persona {

    private String nombre; // Aquí guardamos el nombre de la persona.
    private int edad;      // Aquí guardamos la edad.

    // Constructor vacío.
    // Suele venir bien cuando se trabaja con librerías como Gson al reconstruir objetos.
    public Persona() {
    }

    // Constructor completo.
    // Permite crear una persona directamente con su nombre y su edad.
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // Guardamos el nombre recibido.
        this.edad = edad;     // Guardamos la edad recibida.
    }

    // Devuelve el nombre de la persona.
    public String getNombre() {
        return nombre;
    }

    // Permite cambiar el nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve la edad.
    public int getEdad() {
        return edad;
    }

    // Permite cambiar la edad.
    public void setEdad(int edad) {
        this.edad = edad;
    }
}