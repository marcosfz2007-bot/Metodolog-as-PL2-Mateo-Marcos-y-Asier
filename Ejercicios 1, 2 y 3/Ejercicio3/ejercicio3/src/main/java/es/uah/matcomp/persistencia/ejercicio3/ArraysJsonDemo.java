package es.uah.matcomp.persistencia.ejercicio3; // Paquete principal de este ejercicio.

// Esta es la clase principal.
// Aquí se prueba cómo guardar y leer arrays en formato JSON.
public class ArraysJsonDemo {

    public static void main(String[] args) { // El programa empieza aquí.

        // ---------- Array de String ----------
        // Creamos un array sencillo con varios nombres.
        String[] nombres = {"Ana", "Luis", "Marta"};

        // Guardamos ese array en un archivo JSON.
        GsonUtil.guardarObjetoEnArchivo("nombres.json", nombres);

        // Leemos el array otra vez desde el archivo.
        String[] nombresLeidos = GsonUtil.cargarObjetoDesdeArchivo("nombres.json", String[].class);

        // Mostramos por pantalla lo que se ha leído.
        System.out.println("Array de String leído:");
        if (nombresLeidos != null) { // Comprobamos que la lectura haya salido bien.
            for (int i = 0; i < nombresLeidos.length; i++) { // Recorremos todas las posiciones del array.
                System.out.println("Posición " + i + ": " + nombresLeidos[i]); // Imprimimos cada elemento con su posición.
            }
        }

        // ---------- Array de Alumno ----------
        // Ahora creamos un array de objetos Alumno.
        Alumno[] alumnos = new Alumno[2]; // Reservamos espacio para 2 alumnos.

        // Metemos en la primera posición un alumno con sus datos.
        alumnos[0] = new Alumno("Ana", 18, "1MatComp", 8.0, "ana@ejemplo.com");

        // Metemos en la segunda posición otro alumno.
        alumnos[1] = new Alumno("Luis", 19, "1MatComp", 7.5, "luis@ejemplo.com");

        // Guardamos el array de alumnos en un archivo JSON.
        GsonUtil.guardarObjetoEnArchivo("alumnosArray.json", alumnos);

        // Leemos otra vez el array desde el archivo.
        Alumno[] alumnosLeidos = GsonUtil.cargarObjetoDesdeArchivo("alumnosArray.json", Alumno[].class);

        // Mostramos algunos datos para comprobar que se ha leído bien.
        System.out.println("Array de Alumno leído:");
        if (alumnosLeidos != null) { // Verificamos que no haya fallado la carga.
            for (int i = 0; i < alumnosLeidos.length; i++) { // Recorremos el array leído.
                System.out.println("Alumno " + (i + 1) + ": " + alumnosLeidos[i].getNombre()); // Sacamos el nombre de cada alumno.
            }
        }
    }
}