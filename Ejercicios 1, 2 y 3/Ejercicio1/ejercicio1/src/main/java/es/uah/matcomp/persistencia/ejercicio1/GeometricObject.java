package es.uah.matcomp.persistencia.ejercicio1; // Paquete de la interfaz.

// Esta interfaz sirve como "contrato".
// Cualquier clase que la implemente tiene que definir cómo calcula su área y su perímetro.
public interface GeometricObject {

    // Método para obtener el área.
    double getArea();

    // Método para obtener el perímetro.
    double getPerimeter();
}
