package es.uah.matcomp.persistencia.ejercicio1; // Paquete de la clase.

// Esta clase representa a un empleado.
// Guarda sus datos básicos y permite hacer alguna operación con el salario.
public class Employee {

    private int id;            // Identificador del empleado.
    private String firstName;  // Nombre.
    private String lastName;   // Apellido.
    private int salary;        // Salario mensual.

    // Constructor con todos los datos necesarios para crear el empleado.
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;                 // Guardamos el id.
        this.firstName = firstName;   // Guardamos el nombre.
        this.lastName = lastName;     // Guardamos el apellido.
        this.salary = salary;         // Guardamos el salario.
    }

    // Devuelve el id del empleado.
    public int getId() {
        return id;
    }

    // Devuelve el nombre.
    public String getFirstName() {
        return firstName;
    }

    // Devuelve el apellido.
    public String getLastName() {
        return lastName;
    }

    // Devuelve el salario mensual.
    public int getSalary() {
        return salary;
    }

    // Devuelve el nombre completo juntando nombre y apellido.
    public String getName() {
        return firstName + " " + lastName;
    }

    // Permite cambiar el salario.
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Calcula el salario anual suponiendo 12 meses.
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Aumenta el salario según el porcentaje recibido.
    // Por ejemplo, si pasa 10, sube un 10%.
    public int raiseSalary(int percent) {
        this.salary += this.salary * percent / 100;
        return this.salary; // Devuelve el nuevo salario ya actualizado.
    }

    // Devuelve el empleado en formato texto.
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
}