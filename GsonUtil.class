package es.uah.matcomp.persistencia.ejercicio1; // Paquete donde está la utilidad.

import com.google.gson.Gson;   // Importamos Gson para convertir objetos a JSON y al revés.
import java.io.FileReader;     // Importamos FileReader para leer archivos.
import java.io.FileWriter;     // Importamos FileWriter para escribir archivos.
import java.io.IOException;    // Importamos IOException para controlar errores de entrada/salida.

// Esta clase se ha hecho para no repetir el mismo código una y otra vez.
// Básicamente centraliza el guardar y cargar objetos en archivos JSON.
public class GsonUtil {

    // Método genérico para guardar cualquier objeto en un archivo.
    // El <T> significa que funciona con cualquier tipo de dato.
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson(); // Creamos un objeto Gson para hacer la conversión a JSON.

        // Abrimos el archivo para escribir.
        // El try-with-resources hace que el archivo se cierre solo al terminar.
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer); // Convertimos el objeto a JSON y lo escribimos en el archivo.
        } catch (IOException e) { // Si algo falla con el archivo, entra aquí.
            e.printStackTrace();  // Muestra el error por consola para saber qué ha pasado.
        }
    }

    // Método genérico para leer un objeto desde un archivo JSON.
    // Recibe la ruta del archivo y la clase a la que queremos convertir lo leído.
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson(); // Creamos otra vez Gson, ahora para leer JSON y convertirlo en objeto.

        // Abrimos el archivo en modo lectura.
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase); // Leemos el JSON y devolvemos el objeto reconstruido.
        } catch (IOException e) { // Si hay algún fallo leyendo el archivo, se captura aquí.
            e.printStackTrace();  // Mostramos el error por consola.
            return null;          // Si falla, devolvemos null para indicar que no se pudo cargar nada.
        }
    }
}
