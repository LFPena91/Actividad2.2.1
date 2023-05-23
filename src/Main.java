import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Alumno Luis = new Alumno();
    Luis.setNombre("Luis");
    Luis.setEdad(32);
    List<Asignatura> asignaturasLuis = new ArrayList<Asignatura>();
    Luis.setListaAsignaturas(asignaturasLuis);

    Asignatura Calculo = new Asignatura("Calculo");
    Asignatura LPOO = new Asignatura("LPOO");
    Asignatura Fisica = new Asignatura("Fisica");
    Asignatura Comunicaciones = new Asignatura("Comunicaciones");

    asignaturasLuis.add(Calculo);
    Calculo.setNota(4.5);
    Calculo.resultado();
    asignaturasLuis.add(LPOO);
    LPOO.setNota(4);
    LPOO.resultado();

    Luis.imprimir();
    }
}