public class Ejemplo1_2_MethodCallStackDemoError {

    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }

    public static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }

    public static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }

    public static void methodC() {
        System.out.println("Enter methodC()");

        // ERROR: división por 0, lanza ArithmeticException
        System.out.println(1 / 0);

        // Esto no se ejecuta nunca
        System.out.println("Exit methodC()");
    }
}
