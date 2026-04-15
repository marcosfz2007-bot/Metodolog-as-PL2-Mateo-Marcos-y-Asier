package es.uah.matcomp.persistencia.ejercicio1; // Aquí indicamos en qué paquete está metida esta clase.

// Esta clase representa a un autor de forma bastante simple.
// Básicamente guarda su nombre y su correo.
public class Author {

    private String name;   // Variable para guardar el nombre del autor.
    private String email;  // Variable para guardar el email del autor.

    // Constructor: sirve para crear un autor pasándole nombre y email desde el principio.
    public Author(String name, String email) {
        this.name = name;     // Guardamos el nombre recibido en el atributo de la clase.
        this.email = email;   // Guardamos el email recibido en su atributo.
    }

    // Devuelve el nombre del autor.
    public String getName() {
        return name;
    }

    // Devuelve el email del autor.
    public String getEmail() {
        return email;
    }

    // Permite cambiar el email del autor si hace falta.
    public void setEmail(String email) {
        this.email = email;
    }

    // Este método se usa para mostrar el objeto en formato texto de una forma más clara.
    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + "]";
    }
}