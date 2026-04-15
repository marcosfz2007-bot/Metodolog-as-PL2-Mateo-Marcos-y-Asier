package es.uah.matcomp.persistencia.ejercicio2; // Paquete al que pertenece esta clase.

// Esta clase representa a un autor de forma sencilla.
// Solo guarda su nombre y su correo.
public class Author {

    private String name;   // Aquí se guarda el nombre del autor.
    private String email;  // Aquí se guarda su email.

    // Constructor: crea un autor pasándole nombre y correo.
    public Author(String name, String email) {
        this.name = name;     // Guardamos el nombre recibido.
        this.email = email;   // Guardamos el email recibido.
    }

    // Devuelve el nombre del autor.
    public String getName() {
        return name;
    }

    // Devuelve el email del autor.
    public String getEmail() {
        return email;
    }

    // Permite cambiar el email si hiciera falta.
    public void setEmail(String email) {
        this.email = email;
    }

    // Sirve para mostrar el autor en formato texto de una manera más clara.
    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + "]";
    }
}