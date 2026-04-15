package es.uah.matcomp.persistencia.ejercicio4; // Paquete donde está la clase.

// Esta clase es un ejemplo extra.
// Sirve para demostrar cómo guardar en JSON un objeto que lleva dentro una lista de otros objetos.
public class AsignaturaDemo {

    public static void main(String[] args) { // El programa empieza aquí.

        // Creamos una asignatura de ejemplo.
        Asignatura asignatura = new Asignatura("Metodologías de la Programación");

        // Creamos dos alumnos.
        Alumno alumno1 = new Alumno("Ana", 18, "1MatComp", 8.2, "ana@ejemplo.com");
        Alumno alumno2 = new Alumno("Luis", 19, "1MatComp", 7.4, "luis@ejemplo.com");

        // Añadimos los dos alumnos a la lista interna de la asignatura.
        asignatura.getAlumnos().add(alumno1);
        asignatura.getAlumnos().add(alumno2);

        // Guardamos la asignatura entera en un fichero JSON.
        GsonUtil.guardarObjetoEnArchivo("asignatura.json", asignatura);

        // Leemos la asignatura otra vez desde el fichero.
        Asignatura asignaturaLeida = GsonUtil.cargarObjetoDesdeArchivo("asignatura.json", Asignatura.class);

        // Si la lectura ha ido bien, mostramos su contenido.
        if (asignaturaLeida != null) {
            System.out.println("Asignatura: " + asignaturaLeida.getNombre());

            // Recorremos la lista de alumnos y mostramos sus nombres.
            for (int i = 0; i < asignaturaLeida.getAlumnos().size(); i++) {
                Alumno alumno = asignaturaLeida.getAlumnos().get(i); // Sacamos el alumno de esa posición.
                System.out.println("Alumno " + (i + 1) + ": " + alumno.getNombre()); // Mostramos su nombre.
            }
        }
    }
}
