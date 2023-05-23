import java.util.Scanner;

public class Asignatura {
    @Override
    public String toString() {
        return "Asignatura: " + nombre + " " + nota;
    }

    private static String nombre;
    private static double nota;
    public Asignatura(String nombre){

    }
    public Asignatura(String nombre, double nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    public void resultado (){ //Metodo para definir si aprobo o reprobo
        if (nota >= 3.5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
    // Getters and setters
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public String getNombre() {
        return nombre;
    }
}
