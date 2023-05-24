import java.util.Scanner;

public class Asignatura {
    @Override
    public String toString() {
        return "Asignatura{ Nombre: " + nombre +
                " nota: " + nota + "}";
    } // tostring para definir la forma de impresion
    //creo los atributos de los objetos
    private static String nombre;
    private static double nota;
    public Asignatura(){
    }//constructor de objetos vacio
    public Asignatura(String nombre, double nota){
        this.nombre = nombre;
        this.nota = nota;
    }//constructor de objetos, con todos los atributos
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
