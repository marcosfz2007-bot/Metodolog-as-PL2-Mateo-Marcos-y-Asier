public class Ejemplo1_7 {

    public static void main(String[] args) {

        System.out.println("=== DEMO EXCEPCIONES COMUNES ===");

        //  1. ArrayIndexOutOfBoundsException
        try {
            int[] array = new int[3];

            // Intentamos acceder a una posición fuera del rango.
            System.out.println(array[3]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: índice fuera de rango");
            ex.printStackTrace();
        }

        //  2. NullPointerException
        try {
            String[] strs = new String[3];

            // strs[0] es null → error al usar length()
            System.out.println(strs[0].length());

        } catch (NullPointerException ex) {
            System.out.println("Error: referencia nula");
            ex.printStackTrace();
        }

        //  3. NumberFormatException
        try {
            // Intentamos convertir texto no numérico a entero
            int num = Integer.parseInt("abc");

        } catch (NumberFormatException ex) {
            System.out.println("Error: formato de número incorrecto");
            ex.printStackTrace();
        }

        //  4. ClassCastException
        try {
            Object o = new Object();

            // Intentamos convertir un Object a Integer (no compatible)
            Integer i = (Integer) o;

        } catch (ClassCastException ex) {
            System.out.println("Error: conversión de tipo inválida");
            ex.printStackTrace();
        }

        //  5. IllegalArgumentException
        try {
            // Ejemplo típico: lanzar manualmente esta excepción
            throw new IllegalArgumentException("Argumento no válido");

        } catch (IllegalArgumentException ex) {
            System.out.println("Error: argumento ilegal");
            ex.printStackTrace();
        }

        //  6. IllegalStateException
        try {
            // Se lanza cuando el programa está en un estado incorrecto
            throw new IllegalStateException("Estado no permitido");

        } catch (IllegalStateException ex) {
            System.out.println("Error: estado ilegal");
            ex.printStackTrace();
        }

        System.out.println("=== FIN DEMO ===");
    }
}
