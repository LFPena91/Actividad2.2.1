import java.util.Scanner;

public class Asignatura {

    //creo los atributos de los objetos Asignatura
    private String nombre;
    private double nota;

        //Constructor de objetos, solo con 1 atributo
    public Asignatura(String nombre){
        this.nombre = nombre;
    }

        //constructor de objetos, con todos los atributos
    public Asignatura(String nombre, double nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    public static Asignatura leer(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Asignatura: ");
        String nombre = teclado.next();
        System.out.println("Nota: ");
        double nota = teclado.nextDouble();
        return new Asignatura(nombre,nota);
    }

        //Metodo para definir si aprobo o reprobo
    public void resultado (){
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

        // tostring para definir la forma de impresion de las listas
    @Override
    public String toString() {
        return nombre + " - nota: " + nota;
    }

}
