package es.uah.matcomp.persistencia.ejercicio4; // Paquete de esta clase.

import java.util.ArrayList; // Importamos ArrayList para crear listas dinámicas.
import java.util.List;      // Importamos la interfaz List.

// Esta clase representa una asignatura.
// Además de su nombre, guarda una lista de alumnos matriculados.
public class Asignatura {

    private String nombre;         // Nombre de la asignatura.
    private List<Alumno> alumnos;  // Lista de alumnos que pertenecen a la asignatura.

    // Constructor vacío.
    // Aquí aprovechamos para dejar la lista creada desde el principio.
    public Asignatura() {
        alumnos = new ArrayList<Alumno>();
    }

    // Constructor que recibe el nombre de la asignatura.
    public Asignatura(String nombre) {
        this.nombre = nombre;               // Guardamos el nombre recibido.
        alumnos = new ArrayList<Alumno>();  // Creamos la lista vacía de alumnos.
    }

    // Devuelve el nombre de la asignatura.
    public String getNombre() {
        return nombre;
    }

    // Permite cambiar el nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve la lista de alumnos.
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    // Permite sustituir la lista de alumnos por otra.
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}