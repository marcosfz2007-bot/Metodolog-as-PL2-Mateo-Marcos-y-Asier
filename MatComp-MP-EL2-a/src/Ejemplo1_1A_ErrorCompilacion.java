import java.io.File;
import java.util.Scanner;

public class Ejemplo1_1A_ErrorCompilacion {

    public static void main(String[] args) {

        // Aquí intentamos crear un Scanner para leer desde un fichero
        // El problema es que el fichero podría no existir
        // El constructor Scanner(File) puede lanzar FileNotFoundException

        // Como NO estamos usando try-catch
        // y tampoco ponemos "throws FileNotFoundException" en el main,
        // Java da error de compilación.
        Scanner in = new Scanner(new File("test.in"));

        // Esta línea nunca llega a ser útil en compilación
        // porque el código falla antes, al compilar
        System.out.println("Leyendo fichero...");
    }
}