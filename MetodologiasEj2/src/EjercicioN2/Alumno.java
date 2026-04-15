package EjercicioN2;

public class Alumno{
    private String nombre;
    private int edad;
    private String curso;
    private int media;

    public Alumno(){
        nombre = "Sin nombre";
        edad = 0;
        curso = "Curso 0";
        media = 0;
    }

    public Alumno(String nombre, int edad, String curso, int media) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.media = media;
    }

    public Alumno(Alumno alumno) {
        this.nombre = alumno.nombre;
        this.edad = alumno.edad;
        this.curso = alumno.curso;
        this.media = alumno.media;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    @Override
    public String toString(){
        return "Alumno[nombre = " + nombre + ", edad = " + edad + ", curso = " + curso + ", nota media = " + media + "]";
    }
}

