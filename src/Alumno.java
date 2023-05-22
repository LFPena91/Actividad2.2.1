public class Alumno {
    private String nombre;
    private int edad;
    private String materia1;
    private String materia2;
    public void alumno (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        materia1 = (String) Asignatura.asignatura();
        materia2 = (String) Asignatura.asignatura();
    }

    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Materias: ");
        System.out.println(materia1);
        System.out.println(materia2);
    }
}
