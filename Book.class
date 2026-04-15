package es.uah.matcomp.persistencia.ejercicio1; // Paquete al que pertenece la clase.

// Esta clase representa un libro.
// Además, dentro lleva un objeto Author, o sea, que un libro tiene asociado un autor.
public class Book {

    private String isbn;    // Código ISBN del libro.
    private String name;    // Título o nombre del libro.
    private Author author;  // Autor del libro.
    private double price;   // Precio del libro.
    private int qty;        // Cantidad disponible.

    // Constructor para crear un libro sin indicar cantidad.
    // En ese caso, la cantidad empieza en 0 por defecto.
    public Book(String isbn, String name, Author author, Double price) {
        this.isbn = isbn;       // Guardamos el ISBN.
        this.name = name;       // Guardamos el nombre.
        this.author = author;   // Guardamos el autor.
        this.price = price;     // Guardamos el precio.
        this.qty = 0;           // Como no nos dan cantidad, la ponemos a 0.
    }

    // Constructor para crear un libro indicando también la cantidad.
    public Book(String isbn, String name, Author author, Double price, int qty) {
        this.isbn = isbn;       // Guardamos el ISBN.
        this.name = name;       // Guardamos el nombre.
        this.author = author;   // Guardamos el autor.
        this.price = price;     // Guardamos el precio.
        this.qty = qty;         // Guardamos la cantidad recibida.
    }

    // Devuelve el ISBN del libro.
    public String getIsbn() {
        return isbn;
    }

    // Devuelve el nombre del libro.
    public String getName() {
        return name;
    }

    // Devuelve el objeto Author asociado al libro.
    public Author getAuthor() {
        return author;
    }

    // Devuelve el precio del libro.
    public double getPrice() {
        return price;
    }

    // Permite cambiar el precio del libro.
    public void setPrice(double price) {
        this.price = price;
    }

    // Devuelve la cantidad disponible.
    public int getQty() {
        return qty;
    }

}