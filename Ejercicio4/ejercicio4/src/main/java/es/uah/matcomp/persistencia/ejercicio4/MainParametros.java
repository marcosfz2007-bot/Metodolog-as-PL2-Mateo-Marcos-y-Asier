package es.uah.matcomp.persistencia.ejercicio4; // Paquete principal de este ejercicio.

// Esta es la clase principal más importante de este apartado.
// Aquí el programa trabaja con parámetros que se pasan por consola.
public class MainParametros {

    public static void main(String[] args) { // El programa empieza aquí.

        // Primero comprobamos que el usuario haya escrito exactamente dos argumentos.
        // Esto evita errores al intentar usar posiciones que no existen dentro de args.
        if (args.length != 2) {

            // Si el número de argumentos no es correcto, mostramos cómo se debe ejecutar.
            System.out.println("Uso:");
            System.out.println("java -jar programa.jar init datos.json");
            System.out.println("java -jar programa.jar show datos.json");

        } else {

            // Guardamos el primer argumento, que indica la operación.
            String operacion = args[0];

            // Guardamos el segundo argumento, que será el nombre o ruta del fichero.
            String fichero = args[1];

            // Metemos la lógica principal en un try-catch para controlar errores sencillos.
            try {

                // Si la operación es "init", el programa crea un fichero con datos iniciales.
                if (operacion.equals("init")) {

                    // Creamos un alumno de ejemplo.
                    Alumno alumno = new Alumno("Noelia", 18, "1MatComp", 8.5, "noelia@ejemplo.com");

                    // Guardamos ese alumno en el fichero indicado.
                    GsonUtil.guardarObjetoEnArchivo(fichero, alumno);

                    // Avisamos de que el fichero se ha creado bien.
                    System.out.println("Fichero creado correctamente: " + fichero);

                } else {

                    // Si la operación es "show", el programa intenta leer el fichero y mostrarlo.
                    if (operacion.equals("show")) {

                        // Leemos el alumno guardado en el JSON.
                        Alumno alumno = GsonUtil.cargarObjetoDesdeArchivo(fichero, Alumno.class);

                        // Si se ha leído bien, mostramos todos sus datos.
                        if (alumno != null) {
                            System.out.println("Datos del alumno:");
                            System.out.println("Nombre: " + alumno.getNombre());
                            System.out.println("Edad: " + alumno.getEdad());
                            System.out.println("Curso: " + alumno.getCurso());
                            System.out.println("Nota media: " + alumno.getNotaMedia());
                            System.out.println("Email: " + alumno.getEmail());
                        } else {

                            // Si no se puede leer el fichero, mostramos un mensaje claro.
                            System.out.println("No se ha podido leer el fichero: " + fichero);
                        }

                    } else {

                        // Si la operación no es ni init ni show, lanzamos una excepción.
                        throw new IllegalArgumentException("Operación no válida. Usa init o show.");
                    }
                }

            } catch (IllegalArgumentException e) {

                // Capturamos esa excepción y mostramos su mensaje sin que el programa termine mal.
                System.out.println(e.getMessage());
            }
        }
    }
}
