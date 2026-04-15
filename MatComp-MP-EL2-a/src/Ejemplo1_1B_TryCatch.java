import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo1_1B_TryCatch {

    public static void main(String[] args) {

        // El bloque try contiene el código que puede producir una excepción
        try {
            System.out.println("Intentando abrir el fichero test.in...");

            // Intentamos abrir el fichero con Scanner
            // Si el fichero no existe, aquí se lanzará FileNotFoundException
            Scanner in = new Scanner(new File("test.in"));

            System.out.println("Fichero abierto correctamente.");

            // Comprobamos si el fichero tiene al menos una línea
            if (in.hasNextLine()) {
                // Si la tiene, la leemos y la mostramos por pantalla
                String linea = in.nextLine();
                System.out.println("Primera línea del fichero: " + linea);
            } else {
                // Si el fichero existe pero está vacío, también lo indicamos
                System.out.println("El fichero está vacío.");
            }

            // Cerramos el Scanner para liberar el recurso
            in.close();

            System.out.println("Lectura finalizada correctamente.");

        } catch (FileNotFoundException ex) {

            // Este bloque catch solo se ejecuta si se produce
            // una FileNotFoundException dentro del try

            System.out.println("Error: no se ha encontrado el fichero.");

            // printStackTrace() muestra información detallada del error,
            // incluyendo la pila de llamadas
            ex.printStackTrace();
        }
    }
}