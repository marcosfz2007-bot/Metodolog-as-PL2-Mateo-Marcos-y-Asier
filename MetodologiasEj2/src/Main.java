import EjercicioN2.Alumno;
import EjercicioN3.ApartadoN1.*;
import EjercicioN3.ApartadoN4.Asignatura;
import EjercicioN3.ApartadoN4.Estudiante;
import com.google.gson.Gson;


import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class Main{
    public static void main(String[] args) {
        //Ejercicio 2 / Clase Alumno
        switch (args[0]) {
            case "init" -> guardarObjetoEnArchivo(args[1], new Alumno());
            case "show", "showAlumnoEnAlumno" -> {
                Alumno datoCargado = cargarObjetoDesdeArchivo(args[1], Alumno.class);
                if (datoCargado != null) System.out.println(datoCargado);
            }
            //Ejercicio 3.1
            //Clase Circle
            case "initCircle" -> guardarObjetoEnArchivo(args[1], new Circle());
            case "showCircle" -> {
                Circle datoCargado = cargarObjetoDesdeArchivo(args[1], Circle.class);
                if (datoCargado != null) System.out.println(datoCargado);
            }
            //Clase Rectangle
            case "initRectangle" -> guardarObjetoEnArchivo(args[1], new Rectangle());
            case "showRectangle" -> {
                Rectangle datoCargado = cargarObjetoDesdeArchivo(args[1], Rectangle.class);
                if (datoCargado != null) System.out.println(datoCargado);
            }
            //Clase MyCircle
            case "initMyCircle" -> guardarObjetoEnArchivo(args[1], new MyCircle());
            case "showMyCircle" -> {
                MyCircle datoCargado = cargarObjetoDesdeArchivo(args[1], MyCircle.class);
                if (datoCargado != null) System.out.println(datoCargado);
            }
            //Clase MyPoint
            case "initMyPoint" -> guardarObjetoEnArchivo(args[1], new MyPoint());
            case "showMyPoint" -> {
                MyPoint datoCargado = cargarObjetoDesdeArchivo(args[1], MyPoint.class);
                if (datoCargado != null) System.out.println(datoCargado);
            }
            //Clase Point2D
            case "initPoint2D" -> guardarObjetoEnArchivo(args[1], new Point2D());
            case "showPoint2D" -> {
                Point2D datoCargado = cargarObjetoDesdeArchivo(args[1], Point2D.class);
                if (datoCargado != null) System.out.println(datoCargado);
            }
            //Clase Point3D
            case "initPoint3D" -> guardarObjetoEnArchivo(args[1], new Point3D());
            case "showPoint3D" -> {
                Point3D datoCargado = cargarObjetoDesdeArchivo(args[1], Point3D.class);
                if (datoCargado != null) System.out.println(datoCargado);
            }
            //Ejercicio 3.2
            case "initAlumnoEnAlumno" -> {
                Alumno nuevoAlumno = new Alumno("Paco", 18, "1º Año 1º Cuatrimestre", 15);
                guardarObjetoEnArchivo(args[1], new Alumno(nuevoAlumno));
            }
            //Ejercicio 3.3
            case "initArray" -> guardarObjetoEnArchivo(args[1], new int[]{1, 2, 3, 4});
            case "showArray" -> {
                int[] datoCargado = cargarObjetoDesdeArchivo(args[1], int[].class);
                if (datoCargado != null) System.out.println(Arrays.toString(datoCargado));
            }
            //Ejercicio 3.4
            case "initAsignatura" -> {
                Estudiante alumno1 = new Estudiante("Manolo", 6, "1º Primaria");
                Estudiante alumno2 = new Estudiante("Manola", 6, "1º Primaria");
                guardarObjetoEnArchivo(args[1], new Asignatura("Física Cuántica", "Pepe", "AulaE360", new Estudiante[]{alumno1, alumno2}));
            }
            case null, default -> {
                break;
            }
        }
        System.out.println("Comando no válido");
    }

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
}