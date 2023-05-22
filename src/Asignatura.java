import java.util.Scanner;

public class Asignatura {
    private static Scanner teclado;
    private static String nombre;
    private static double nota;

    public static Object asignatura() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la asignatura:");
        nombre = teclado.next();
        System.out.println("Ingrese la nota obtenida");
        nota = teclado.nextDouble();
        return null;
    }

    public void asignatura(String nombre, double nota){ //metodo constructor de asignaturas
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
