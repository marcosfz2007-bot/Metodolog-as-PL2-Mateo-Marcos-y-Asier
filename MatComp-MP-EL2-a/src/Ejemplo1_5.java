public class Ejemplo1_5 {

    public static void main(String[] args) {

        System.out.println("Inicio del programa");

        try {
            // Llamamos al método que puede lanzar excepciones.
            methodD(1);
            methodD(2);
            methodD(3);

        } catch (XxxException ex) {
            // Este bloque captura las excepciones del tipo XxxException.
            System.out.println("Se ha capturado una XxxException.");
            System.out.println("Mensaje: " + ex.getMessage());

        } catch (YyyException ex) {
            // Este bloque captura las excepciones del tipo YyyException.
            System.out.println("Se ha capturado una YyyException.");
            System.out.println("Mensaje: " + ex.getMessage());
        }

        System.out.println("Fin del programa");
    }

    public static void methodD(int option) throws XxxException, YyyException {

        // Este método declara en su firma que puede lanzar
        // dos tipos de excepciones verificadas:
        // XxxException y YyyException.

        System.out.println("Entrando en methodD() con opción = " + option);

        // Si option vale 1, lanzamos una excepción del tipo XxxException.
        if (option == 1) {
            throw new XxxException("Se ha producido una XxxException en methodD()");
        }

        // Si option vale 2, lanzamos una excepción del tipo YyyException.
        if (option == 2) {
            throw new YyyException("Se ha producido una YyyException en methodD()");
        }

        // Si no pasa nada anormal, el método termina normalmente.
        System.out.println("methodD() termina sin errores.");
    }
}
