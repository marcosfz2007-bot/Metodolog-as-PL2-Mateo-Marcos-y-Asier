public class Ejemplo1_2_MethodCallStackDemo {

    public static void main(String[] args) {

        // La JVM empieza ejecutando main()
        System.out.println("Enter main()");

        // main llama a methodA()
        methodA();

        // Este mensaje se ejecuta cuando todo ha terminado
        System.out.println("Exit main()");
    }

    public static void methodA() {

        // methodA entra en la pila
        System.out.println("Enter methodA()");

        // methodA llama a methodB()
        methodB();

        // Se ejecuta cuando methodB termina
        System.out.println("Exit methodA()");
    }

    public static void methodB() {

        // methodB entra en la pila
        System.out.println("Enter methodB()");

        // methodB llama a methodC()
        methodC();

        // Se ejecuta cuando methodC termina
        System.out.println("Exit methodB()");
    }

    public static void methodC() {

        // methodC entra en la pila
        System.out.println("Enter methodC()");

        // No hay más llamadas → termina aquí
        System.out.println("Exit methodC()");
    }
}