import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creo 3 objedos de Alumno
    Alumno Alumno1 = new Alumno();
    Alumno1.setNombre("Luis");
    Alumno1.setEdad(32);
    Alumno Alumno2 = new Alumno();
    Alumno2.setNombre("Fernando");
    Alumno2.setEdad(28);
    Alumno Alumno3 = new Alumno();
    Alumno3.setNombre("Andrea");
    Alumno3.setEdad(30);

        //creo 3 listas de asignaturas para cada alumno
    List<Asignatura> listaAsignaturas1 = new ArrayList<Asignatura> ();
    List<Asignatura> listaAsignaturas2 = new ArrayList<Asignatura>();
    List<Asignatura> listaAsignaturas3 = new ArrayList<Asignatura>();

        //Le asigno a cada alumno una lista
    Alumno1.setListaAsignaturas(listaAsignaturas1);
    Alumno2.setListaAsignaturas(listaAsignaturas2);
    Alumno3.setListaAsignaturas(listaAsignaturas3);

        //creo objetos de Asignatura
    Asignatura Calculo = new Asignatura("Calculo");
    Asignatura LPOO = new Asignatura("LPOO");
    Asignatura Fisica = new Asignatura("Fisica");
    Asignatura Comunicaciones = new Asignatura("Comunicaciones");
    Asignatura Matematicas = new Asignatura("Matematicas");
    Asignatura BaseDeDatos = new Asignatura("Base de datos");
    Asignatura Logica = new Asignatura("Logica de programacion");

        //Asigno materias a los alumnos
    listaAsignaturas1.add(Calculo);
    listaAsignaturas1.add(Fisica);
    listaAsignaturas1.add(Matematicas);

    listaAsignaturas2.add(LPOO);
    listaAsignaturas2.add(BaseDeDatos);
    listaAsignaturas2.add(Matematicas);
    listaAsignaturas2.add(Logica);

    listaAsignaturas3.add(Comunicaciones);
    listaAsignaturas3.add(Calculo);
    listaAsignaturas3.add(Fisica);
    listaAsignaturas3.add(LPOO);

    listaAsignaturas1.get(1).setNota(3);
    listaAsignaturas3.get(2).setNota(4);

        System.out.println(listaAsignaturas1);
        System.out.println(listaAsignaturas3);







    }
}