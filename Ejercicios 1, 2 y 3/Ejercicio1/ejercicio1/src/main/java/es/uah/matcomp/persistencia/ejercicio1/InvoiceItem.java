package es.uah.matcomp.persistencia.ejercicio1; // Paquete de la clase.

// Esta clase representa una línea de factura.
// Guarda el producto, la cantidad y el precio unitario.
public class InvoiceItem {

    private String id;        // Identificador del artículo.
    private String desc;      // Descripción del artículo.
    private int qty;          // Cantidad.
    private double unitPrice; // Precio por unidad.

    // Constructor para crear la línea de factura con todos sus datos.
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;                 // Guardamos el id.
        this.desc = desc;             // Guardamos la descripción.
        this.qty = qty;               // Guardamos la cantidad.
        this.unitPrice = unitPrice;   // Guardamos el precio por unidad.
    }

    // Devuelve el id del artículo.
    public String getId() {
        return id;
    }

    // Devuelve la descripción.
    public String getDesc() {
        return desc;
    }

    // Devuelve la cantidad.
    public int getQty() {
        return qty;
    }

    // Permite cambiar la cantidad.
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Devuelve el precio unitario.
    public double getUnitPrice() {
        return unitPrice;
    }

    // Permite cambiar el precio unitario.
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Calcula el total multiplicando cantidad por precio unitario.
    public double getTotal() {
        return unitPrice * qty;
    }

    // Devuelve el objeto en formato texto para imprimirlo más fácil.
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
    }
}
