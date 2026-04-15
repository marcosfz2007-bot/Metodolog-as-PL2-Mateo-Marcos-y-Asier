package es.uah.matcomp.persistencia.ejercicio2; // Paquete donde está la clase.

import com.google.gson.Gson;   // Importamos Gson para convertir objetos a JSON y al revés.
import java.io.FileReader;     // Sirve para leer archivos.
import java.io.FileWriter;     // Sirve para escribir archivos.
import java.io.IOException;    // Se usa para controlar errores con ficheros.

// Esta clase está hecha para no repetir siempre el mismo código.
// Aquí metemos los métodos para guardar y cargar objetos en JSON.
public class GsonUtil {

    // Método genérico para guardar cualquier objeto en un archivo JSON.
    // El <T> quiere decir que vale para cualquier tipo de objeto.
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson(); // Creamos el objeto Gson que hará la conversión a JSON.

        // Abrimos el archivo para escribir.
        // Con try-with-resources se cierra solo al terminar.
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer); // Convertimos el objeto a JSON y lo guardamos en el fichero.
        } catch (IOException e) { // Si algo falla al escribir, entra aquí.
            e.printStackTrace();  // Muestra el error por consola.
        }
    }

    // Método genérico para leer un objeto desde un archivo JSON.
    // Recibe la ruta del archivo y la clase del objeto que queremos reconstruir.
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson(); // Creamos otra vez Gson, ahora para leer JSON.

        // Abrimos el archivo en modo lectura.
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase); // Leemos el JSON y lo convertimos otra vez en objeto Java.
        } catch (IOException e) { // Si hay algún error al leer, se controla aquí.
            e.printStackTrace();  // Mostramos el error.
            return null;          // Si falla, devolvemos null.
        }
    }
}