import java.util.List;

public class Alumno {
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", listaAsignaturas=" + listaAsignaturas +
                '}';
    }

    private String nombre;
    private int edad;
    private List<Asignatura> listaAsignaturas;
    public Alumno(){
    }
    public Alumno(String nombreA, int edad, List<Asignatura> listaAsignaturas) {
        this.nombre = nombreA;
        this.edad = edad;
        this.listaAsignaturas = listaAsignaturas;
    }
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Asignaturas" + listaAsignaturas.toString());
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
}
