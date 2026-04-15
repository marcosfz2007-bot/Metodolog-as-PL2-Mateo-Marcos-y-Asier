public class Main {

    public static void main(String[] args) {

        // 1.1B
        System.out.println(" Ejemplo 1.1B: TryCatch");
        try {
            Ejemplo1_1B_TryCatch.main(null);
        } catch (Exception e) {
            System.out.println("Error al ejecutar Ejemplo1_1B_TryCatch");
            e.printStackTrace();
        }
        System.out.println();

        // 1.1C
        System.out.println(" Ejemplo 1.1C: Throws ");
        try {
            Ejemplo1_1C_Throws.main(null);
        } catch (Exception e) {
            System.out.println("Excepción capturada en Main desde Ejemplo1_1C_Throws");
            e.printStackTrace();
        }
        System.out.println();

        // 1.2 (primera versión)
        System.out.println(" Ejemplo 1.2: MethodCallStackDemo ");
        try {
            Ejemplo1_2_MethodCallStackDemo.main(null);
        } catch (Exception e) {
            System.out.println("Error al ejecutar Ejemplo1_2_MethodCallStackDemo");
            e.printStackTrace();
        }
        System.out.println();


        // 1.5
        System.out.println(" Ejemplo 1.5 ");
        try {
            Ejemplo1_5.main(null);
        } catch (Exception e) {
            System.out.println("Error al ejecutar Ejemplo1_5");
            e.printStackTrace();
        }
        System.out.println();

        // 1.6
        System.out.println(" Ejemplo 1.6 ");
        try {
            Ejemplo1_6.main(null);
        } catch (Exception e) {
            System.out.println("Error al ejecutar Ejemplo1_6");
            e.printStackTrace();
        }
        System.out.println();

        // 1.6.2
        System.out.println(" Ejemplo 1.6.2 ");
        try {
            Ejemplo1_6_2.main(null);
        } catch (Exception e) {
            System.out.println("Error al ejecutar Ejemplo1_6_2");
            e.printStackTrace();
        }
        System.out.println();

        // 1.7
        System.out.println(" Ejemplo 1.7");
        try {
            Ejemplo1_7.main(null);
        } catch (Exception e) {
            System.out.println("Error al ejecutar Ejemplo1_7");
            e.printStackTrace();
        }
        System.out.println();

        // 1.8
        System.out.println(" Ejemplo 1.8: MyMagicExceptionTest ");
        try {
            Ejemplo1_8_MyMagicExceptionTest.main(null);
        } catch (Exception e) {
            System.out.println("Error al ejecutar Ejemplo1_8_MyMagicExceptionTest");
            e.printStackTrace();
        }
        System.out.println();


    }
}
