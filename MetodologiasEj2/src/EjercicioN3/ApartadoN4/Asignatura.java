package EjercicioN3.ApartadoN4;

public class Asignatura {
    private String nombre;
    private String docente;
    private String aula;
    private Estudiante[] estudiantes;

    public Asignatura(String nombre, String docente, String aula, Estudiante[] estudiantes) {
        this.nombre = nombre;
        this.docente = docente;
        this.aula = aula;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
}
