import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo1_6 {

    public static void main(String[] args) {

        try {
            // Bloque try
            System.out.println("Start of the main logic");
            System.out.println("Try opening a file ...");

            // Intentamos abrir un fichero
            Scanner in = new Scanner(new File("test.in"));

            // Si el fichero existe seguimos normalmente
            System.out.println("File Found, processing the file ...");

            // Ejemplo de lectura
            if (in.hasNextLine()) {
                System.out.println("First line: " + in.nextLine());
            } else {
                System.out.println("The file is empty.");
            }

            // Cerramos
            in.close();

            System.out.println("End of the main logic");

        } catch (FileNotFoundException ex) {

            // Este bloque catch se ejecuta solo si el fichero no existe
            System.out.println("File Not Found caught ...");

        } finally {

            // El bloque finally se ejecuta siempre,
            // haya o no excepción
            System.out.println("finally-block runs regardless of the state of exception");
        }

        // Esta línea se ejecuta después del try-catch-finally
        System.out.println("After try-catch-finally, life goes on...");
    }
}