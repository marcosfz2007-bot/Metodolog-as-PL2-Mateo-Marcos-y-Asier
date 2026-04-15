public class Ejemplo1_6_2 {

    public static void main(String[] args) {
        // Comienza el programa
        System.out.println("Enter main()");

        // main llama a methodA()
        methodA();

        // Esta línea no llegará a ejecutarse porque la excepción no se captura
        System.out.println("Exit main()");
    }

    public static void methodA() {
        System.out.println("Enter methodA()");

        try {
            // Esta división por cero lanza una ArithmeticException
            System.out.println(1 / 0);

            // Esta línea nunca se ejecuta
            System.out.println("This line will never be shown.");

        } finally {
            // La hoja destaca que este bloque finally sí se ejecuta,
            // aunque haya una excepción no capturada
            System.out.println("finally in methodA()");
        }

        // Tampoco se ejecuta porque el método termina por la excepción.
        // System.out.println("Exit methodA()");
    }
}
