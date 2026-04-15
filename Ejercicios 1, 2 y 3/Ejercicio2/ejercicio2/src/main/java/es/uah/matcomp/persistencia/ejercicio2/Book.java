package es.uah.matcomp.persistencia.ejercicio2; // Paquete donde está la clase.

// Esta clase representa un libro.
// Lo interesante aquí es que dentro lleva un objeto Author.
public class Book {

    private String isbn;    // Código ISBN del libro.
    private String name;    // Título del libro.
    private Author author;  // Autor del libro.
    private double price;   // Precio.
    private int qty;        // Cantidad disponible.

    // Constructor para crear un libro sin indicar cantidad.
    // En ese caso la cantidad empieza en 0.
    public Book(String isbn, String name, Author author, Double price) {
        this.isbn = isbn;       // Guardamos el ISBN.
        this.name = name;       // Guardamos el nombre.
        this.author = author;   // Guardamos el autor.
        this.price = price;     // Guardamos el precio.
        this.qty = 0;           // Como no se pasa cantidad, la dejamos a 0.
    }

    // Constructor completo, este ya recibe también la cantidad.
    public Book(String isbn, String name, Author author, Double price, int qty) {
        this.isbn = isbn;       // Guardamos el ISBN.
        this.name = name;       // Guardamos el nombre del libro.
        this.author = author;   // Guardamos el autor.
        this.price = price;     // Guardamos el precio.
        this.qty = qty;         // Guardamos la cantidad.
    }

    // Devuelve el ISBN.
    public String getIsbn() {
        return isbn;
    }

    // Devuelve el nombre del libro.
    public String getName() {
        return name;
    }

    // Devuelve el autor completo.
    public Author getAuthor() {
        return author;
    }

    // Devuelve el precio.
    public double getPrice() {
        return price;
    }

    // Permite cambiar el precio.
    public void setPrice(double price) {
        this.price = price;
    }

    // Devuelve la cantidad.
    public int getQty() {
        return qty;
    }

    // Permite cambiar la cantidad.
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Devuelve directamente el nombre del autor.
    // Así no hace falta escribir getAuthor().getName() fuera.
    public String getAuthorName() {
        return author.getName();
    }

    // Convierte el objeto en texto para poder imprimirlo de forma entendible.
    @Override
    public String toString() {
        return "Book[isbn=" + isbn + ", name=" + name + ", " + author.toString() + ", price=" + price + ", qty=" + qty + "]";
    }
}
