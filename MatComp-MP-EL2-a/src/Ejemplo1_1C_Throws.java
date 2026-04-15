import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo1_1C_Throws {

    // En este caso, el método main declara que puede lanzar
    // FileNotFoundException.
    // Eso significa que NO la maneja aquí dentro,
    // sino que la deja subir al nivel superior.
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Intentando abrir el fichero test.in...");

        // Si el fichero no existe, se lanzará la excepción
        // y como aquí no hay try-catch, el programa terminará
        // mostrando el error por pantalla.
        Scanner in = new Scanner(new File("test.in"));

        System.out.println("Fichero abierto correctamente.");

        if (in.hasNextLine()) {
            String linea = in.nextLine();
            System.out.println("Primera línea del fichero: " + linea);
        } else {
            System.out.println("El fichero está vacío.");
        }

        // Cerramos el recurso.
        in.close();

        System.out.println("Lectura finalizada correctamente.");
    }
}