package es.uah.matcomp.persistencia.ejercicioejemplo2; // Paquete al que pertenece esta clase.

// Esta clase representa a una persona de forma sencilla.
// Se usa como ejemplo porque tiene pocos datos y así se entiende mejor cómo funciona Gson.
public class Persona {

    private String nombre; // Nombre de la persona.
    private int edad;      // Edad de la persona.

    // Constructor vacío.
    // Va bien tenerlo cuando luego queremos reconstruir el objeto desde JSON.
    public Persona() {
    }

    // Constructor completo.
    // Sirve para crear una persona con todos sus datos ya puestos.
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // Guardamos el nombre.
        this.edad = edad;     // Guardamos la edad.
    }

    // Devuelve el nombre.
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
