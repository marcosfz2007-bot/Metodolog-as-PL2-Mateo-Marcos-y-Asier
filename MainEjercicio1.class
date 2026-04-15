package es.uah.matcomp.persistencia.ejercicio1; // Paquete principal del ejercicio.

// Esta es la clase principal.
// Aquí se crean los objetos, se guardan en archivos JSON y luego se vuelven a leer.
public class MainEjercicio1 {

    public static void main(String[] args) { // Método principal: por aquí empieza el programa.
        // ---------- Employee ----------
        Employee employee = new Employee(1, "Ana", "Lopez", 1500); // Creamos un empleado de prueba.
        GsonUtil.guardarObjetoEnArchivo("employee.json", employee); // Guardamos el objeto en un archivo JSON.
        Employee employeeLeido = GsonUtil.cargarObjetoDesdeArchivo("employee.json", Employee.class); // Lo leemos otra vez desde el archivo.
        if (employeeLeido != null) { // Comprobamos que se haya leído bien.
            System.out.println(employeeLeido.toString()); // Lo mostramos por pantalla.
        }

        // ---------- InvoiceItem ----------
        InvoiceItem invoiceItem = new InvoiceItem("I1", "Teclado", 2, 25.5); // Creamos una línea de factura.
        GsonUtil.guardarObjetoEnArchivo("invoiceItem.json", invoiceItem); // La guardamos en JSON.
        InvoiceItem invoiceItemLeido = GsonUtil.cargarObjetoDesdeArchivo("invoiceItem.json", InvoiceItem.class); // La cargamos desde el fichero.
        if (invoiceItemLeido != null) { // Si se leyó bien...
            System.out.println(invoiceItemLeido.toString()); // ...la mostramos por consola.
        }

        // ---------- Book con Author dentro ----------
        Author author = new Author("Luis Perez", "luis@ejemplo.com"); // Creamos primero el autor.
        Book book = new Book("12345", "Java Basico", author, 19.95, 3); // Creamos el libro con su autor dentro.
        GsonUtil.guardarObjetoEnArchivo("book.json", book); // Guardamos el libro en JSON.
        Book bookLeido = GsonUtil.cargarObjetoDesdeArchivo("book.json", Book.class); // Lo cargamos otra vez.
        if (bookLeido != null) { // Si todo fue bien...
            System.out.println(bookLeido.toString()); // ...lo imprimimos.
        }

        // ---------- CircleGO ----------
        CircleGO circleGO = new CircleGO(3.0); // Creamos un círculo geométrico.
        GsonUtil.guardarObjetoEnArchivo("circleGO.json", circleGO); // Lo guardamos.
        CircleGO circleGOLeido = GsonUtil.cargarObjetoDesdeArchivo("circleGO.json", CircleGO.class); // Lo volvemos a leer.
        if (circleGOLeido != null) { // Comprobamos que no sea null.
            System.out.println(circleGOLeido.toString()); // Lo enseñamos por pantalla.
        }

        // ---------- RectangleGO ----------
        RectangleGO rectangleGO = new RectangleGO(4.0, 5.0); // Creamos un rectángulo geométrico.
        GsonUtil.guardarObjetoEnArchivo("rectangleGO.json", rectangleGO); // Lo guardamos en archivo.
        RectangleGO rectangleGOLeido = GsonUtil.cargarObjetoDesdeArchivo("rectangleGO.json", RectangleGO.class); // Lo cargamos desde JSON.
        if (rectangleGOLeido != null) { // Si ha salido bien...
            System.out.println(rectangleGOLeido.toString()); // ...lo imprimimos.
        }

        // ---------- Circle ----------
        Circle circle = new Circle(2.5, "blue"); // Creamos un círculo normal con radio y color.
        GsonUtil.guardarObjetoEnArchivo("circle.json", circle); // Lo guardamos.
        Circle circleLeido = GsonUtil.cargarObjetoDesdeArchivo("circle.json", Circle.class); // Lo recuperamos del archivo.
        if (circleLeido != null) { // Verificamos que existe.
            System.out.println(circleLeido.toString()); // Lo mostramos por pantalla.
        }

        // ---------- Cylinder ----------
        Cylinder cylinder = new Cylinder(2.0, 5.0, "green"); // Creamos un cilindro con radio, altura y color.
        GsonUtil.guardarObjetoEnArchivo("cylinder.json", cylinder); // Lo guardamos en JSON.
        Cylinder cylinderLeido = GsonUtil.cargarObjetoDesdeArchivo("cylinder.json", Cylinder.class); // Lo leemos otra vez.
        if (cylinderLeido != null) { // Comprobamos que la lectura no haya fallado.
            System.out.println(cylinderLeido.toString()); // Sacamos el resultado por consola.
        }
    }
}
