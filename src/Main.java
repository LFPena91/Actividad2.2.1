import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Alumno Alumno1 = new Alumno();
    Alumno1.setNombre("Luis");
    Alumno1.setEdad(32);

    List<Asignatura> listaAsignaturas = new ArrayList<Asignatura> ();

    Asignatura Calculo = new Asignatura("Calculo",3.5);
    Asignatura LPOO = new Asignatura("LPOO",4);

    listaAsignaturas.add(Calculo);
    listaAsignaturas.add(LPOO);

    Alumno1.setListaAsignaturas(listaAsignaturas);

        System.out.println("Alumno: " + Alumno1.getNombre() + " Edad: " + Alumno1.getEdad() +
                " Tiene las materias: " + Alumno1.getListaAsignaturas().toString());

    }
}