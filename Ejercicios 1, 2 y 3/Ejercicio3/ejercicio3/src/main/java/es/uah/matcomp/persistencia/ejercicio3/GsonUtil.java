package es.uah.matcomp.persistencia.ejercicio3; // Paquete donde está esta clase.

import com.google.gson.Gson;   // Importamos Gson para convertir objetos a JSON y al revés.
import java.io.FileReader;     // Se usa para leer archivos.
import java.io.FileWriter;     // Se usa para escribir archivos.
import java.io.IOException;    // Se usa para controlar errores de entrada y salida.

// Esta clase sirve para no repetir siempre el mismo código.
// Aquí metemos los métodos que guardan y cargan objetos en archivos JSON.
public class GsonUtil {

    // Método genérico para guardar cualquier objeto en un archivo JSON.
    // El <T> indica que este método vale para cualquier tipo de objeto.
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson(); // Creamos el objeto Gson que hará la conversión a JSON.

        // Abrimos el archivo en modo escritura.
        // El try-with-resources hace que el archivo se cierre solo al terminar.
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer); // Convertimos el objeto a JSON y lo escribimos en el fichero.
        } catch (IOException e) { // Si algo falla al escribir, entra aquí.
            e.printStackTrace();  // Mostramos el error por consola.
        }
    }

    // Método genérico para leer un objeto desde un archivo JSON.
    // Recibe la ruta del archivo y la clase del objeto que queremos recuperar.
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson(); // Creamos otra vez Gson, esta vez para leer el JSON.

        // Abrimos el archivo en modo lectura.
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase); // Leemos el JSON y lo convertimos en un objeto Java.
        } catch (IOException e) { // Si hay algún error leyendo el fichero, se controla aquí.
            e.printStackTrace();  // Mostramos el error por consola.
            return null;          // Si falla, devolvemos null.
        }
    }
}