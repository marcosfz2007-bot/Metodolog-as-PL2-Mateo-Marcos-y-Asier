package EjercicioN1;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GsonUtilEjemploV2 {
    // Método para guardar un objeto en un archivo JSON
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {

        String rutaArchivo = "usuario.json";

        String Texto = cargarObjetoDesdeArchivo(rutaArchivo, String.class);
        if (Texto != null) {
            System.out.println("Texto del archivo: " + Texto);
        }
    }

}