public class Ejemplo1_8_MyMagicExceptionTest {

    // Este método puede lanzar MyMagicException
    public static void magic(int number) throws Ejemplo1_8_MyMagicException {

        // Si el número es 8, lanzamos la excepción
        if (number == 8) {
            throw new Ejemplo1_8_MyMagicException("you hit the magic number");
        }

        // Si no hay problema, se ejecuta esto
        System.out.println("hello");
    }

    public static void main(String[] args) {

        try {
            // No lanza excepción
            magic(9);

            // Sí lanza excepción
            magic(8);

        } catch (Ejemplo1_8_MyMagicException ex) {

            // Capturamos la excepción personalizada
            ex.printStackTrace();
        }
    }
}