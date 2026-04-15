package es.uah.matcomp.persistencia.ejercicio3; // Paquete al que pertenece esta clase.

// Esta clase representa a un alumno.
// Aquí guardamos sus datos básicos para luego poder trabajar con ellos o guardarlos en JSON.
public class Alumno {

    private String nombre;     // Nombre del alumno.
    private int edad;          // Edad del alumno.
    private String curso;      // Curso en el que está matriculado.
    private double notaMedia;  // Nota media del alumno.
    private String email;      // Correo electrónico.

    // Constructor vacío.
    // Este suele venir bien cuando una librería como Gson necesita reconstruir objetos desde JSON.
    public Alumno() {
    }

    // Constructor completo para crear un alumno con todos sus datos.
    public Alumno(String nombre, int edad, String curso, double notaMedia, String email) {
        this.nombre = nombre;         // Guardamos el nombre.
        this.edad = edad;             // Guardamos la edad.
        this.curso = curso;           // Guardamos el curso.
        this.notaMedia = notaMedia;   // Guardamos la nota media.
        this.email = email;           // Guardamos el email.
    }

    // Devuelve el nombre del alumno.
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

    // Devuelve el curso.
    public String getCurso() {
        return curso;
    }

    // Permite cambiar el curso.
    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Devuelve la nota media.
    public double getNotaMedia() {
        return notaMedia;
    }

    // Permite cambiar la nota media.
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    // Devuelve el email.
    public String getEmail() {
        return email;
    }

    // Permite cambiar el email.
    public void setEmail(String email) {
        this.email = email;
    }
}