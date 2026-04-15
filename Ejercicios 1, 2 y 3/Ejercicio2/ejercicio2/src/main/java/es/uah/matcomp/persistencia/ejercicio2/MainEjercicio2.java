package es.uah.matcomp.persistencia.ejercicio2; // Paquete principal de este ejercicio.

// Esta es la clase principal.
// Aquí se crea un libro con un autor dentro, se guarda en JSON y luego se vuelve a leer.
public class MainEjercicio2 {

    public static void main(String[] args) { // El programa empieza aquí.
        // Creamos primero el autor.
        Author author = new Author("Maria Gomez", "maria@ejemplo.com");

        // Ahora creamos el libro y le metemos dentro el autor como atributo.
        Book book = new Book("9780001", "Programacion", author, 22.5, 4);

        // Guardamos el libro entero en un archivo JSON.
        GsonUtil.guardarObjetoEnArchivo("ejercicio2_book.json", book);

        // Leemos otra vez ese libro desde el archivo.
        Book bookLeido = GsonUtil.cargarObjetoDesdeArchivo("ejercicio2_book.json", Book.class);

        // Si todo ha ido bien y el libro se ha leído correctamente...
        if (bookLeido != null) {
            System.out.println(bookLeido.toString()); // Mostramos el libro completo.
            System.out.println("Autor dentro del libro: " + bookLeido.getAuthor().toString()); // Mostramos también el autor que lleva dentro.
        }
    }
}