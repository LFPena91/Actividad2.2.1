import java.util.List;

public class Alumno {
        //creo los atributos de los objetos Alumno
    private String nombre;
    private int edad;
    private List<Asignatura> listaAsignaturas;

        //constructor vacio
    public Alumno(){
    }

        // constructor de objetos, con todos los atributos
    public Alumno(String nombre, int edad, List<Asignatura> listaAsignaturas) {
        this.nombre = nombre;
        this.edad = edad;
        this.listaAsignaturas = listaAsignaturas;
    }
    //creo un metodo para imprimir el nombre, la edad de un estudiante y las asignaturas q esta cursando
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Asignaturas: " + listaAsignaturas);
    }

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
    //Creo el metodo para buscar el promedio de las asignaturas.
    public void promedio() {
        double suma = 0;
        for (int i = 0; i < listaAsignaturas.size(); i++) {
            suma = suma + listaAsignaturas.get(i).getNota();
        }
        double promedio = suma/listaAsignaturas.size();
        System.out.println("El promedio de " + nombre + " es: " + promedio);
    }
}
