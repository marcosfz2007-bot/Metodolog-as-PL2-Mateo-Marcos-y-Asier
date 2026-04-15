package es.uah.matcomp.persistencia.ejercicioejemplo2; // Paquete donde está esta clase.

import com.google.gson.Gson;   // Importamos Gson para convertir objetos a JSON y al revés.
import java.io.FileReader;     // Se usa para leer archivos.
import java.io.FileWriter;     // Se usa para escribir archivos.
import java.io.IOException;    // Se usa para controlar errores relacionados con archivos.

// Esta clase sirve de apoyo para no repetir siempre el mismo código.
// Aquí centralizamos el guardado y la lectura de objetos en archivos JSON.
public class GsonUtil {

    // Método genérico para guardar cualquier objeto en un archivo JSON.
    // El <T> indica que vale para cualquier tipo de objeto.
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson(); // Creamos el objeto Gson que convertirá el objeto a JSON.

        // Abrimos el fichero en modo escritura.
        // Gracias al try-with-resources se cierra solo al terminar.
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer); // Convertimos el objeto a JSON y lo escribimos en el archivo.
        } catch (IOException e) { // Si algo falla al escribir, entra aquí.
            e.printStackTrace();  // Mostramos el error por consola.
        }
    }

    // Método genérico para leer un objeto desde un archivo JSON.
    // Recibe la ruta del fichero y la clase del objeto que queremos reconstruir.
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson(); // Creamos Gson otra vez, ahora para convertir JSON en objeto Java.

        // Abrimos el fichero en modo lectura.
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase); // Leemos el JSON y devolvemos el objeto reconstruido.
        } catch (IOException e) { // Si hay algún problema al leer, se controla aquí.
            e.printStackTrace();  // Mostramos el error por consola.
            return null;          // Si falla, devolvemos null.
        }
    }
}
