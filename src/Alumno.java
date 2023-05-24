import java.util.List;

public class Alumno {
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", listaAsignaturas=" + listaAsignaturas +
                '}';
    }// tostring para definir la forma de impresion
    //creo los atributos de los objetos
    private String nombre;
    private int edad;
    private List<Asignatura> listaAsignaturas;
    public Alumno(){
    } //constructor vacio
    public Alumno(String nombreA, int edad, List<Asignatura> listaAsignaturas) {
        this.nombre = nombreA;
        this.edad = edad;
        this.listaAsignaturas = listaAsignaturas;
    } // constructor de objetos, con todos los atributos
    /*public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Asignaturas: " + listaAsignaturas);
    }*/ //creo un metodo para imprimir el nombre, la edad de un estudiante y las asignaturas q esta cursando
    //Getters and setters
    public List<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }
    public void setListaAsignaturas(List<Asignatura> listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
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
}
