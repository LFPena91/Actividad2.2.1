import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creo un escaner para pedirle al usuario que ingrese datos
        Scanner teclado = new Scanner(System.in);
        //Creo 3 objetos de Alumno
        Alumno Alumno1 = new Alumno();
        Alumno1.setNombre("Luis");
        Alumno1.setEdad(32);
        Alumno Alumno2 = new Alumno();
        Alumno2.setNombre("Fernando");
        Alumno2.setEdad(28);
        Alumno Alumno3 = new Alumno();
        Alumno3.setNombre("Andrea");
        Alumno3.setEdad(30);

        //creo 3 listas de asignaturas una para cada alumno
        List<Asignatura> listaAsignaturas1 = new ArrayList<Asignatura>();
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

        //Asigno asignaturas a los alumnos (cargandolas en la lista anteriormente asignada al alumno
        listaAsignaturas1.add(Calculo);
        listaAsignaturas1.add(Fisica);

        listaAsignaturas2.add(LPOO);
        listaAsignaturas2.add(BaseDeDatos);
        listaAsignaturas2.add(Logica);
        listaAsignaturas2.add(Calculo);

        listaAsignaturas3.add(Comunicaciones);
        listaAsignaturas3.add(Calculo);

        //Le solicito al usuario seleccionar 1 de los estudiantes
        System.out.println("Seleccione un estudiante: ");
        System.out.println("1: " + Alumno1.getNombre());
        System.out.println("2: " + Alumno2.getNombre());
        System.out.println("3: " + Alumno3.getNombre());
        System.out.println("0: Salir");

        int a = teclado.nextInt(); //Con esto le voy a asignar a la variable "a" el numero ingresado por el usuario

        //Segun el valor de "a" se va a seleccionar un caso.
        switch (a){
            case 1:
                Alumno1.imprimir();//llamo el metodo imprimir de Alumno
                //Recorro cada uno de los campos de la lista, para que me imprima el valor que hay alli.
                //y llamo el metodo resultado, para que me diga si esa asignatura fue aprobada o no.
                for(int i = 0; i < Alumno1.getListaAsignaturas().size(); i++) {
                    System.out.println(Alumno1.getListaAsignaturas().get(i));
                    Alumno1.getListaAsignaturas().get(i).resultado();
                }
                Alumno1.promedio();//Llamo el metodo promedio
                int b = 1; //esta variable la creo para usar en el while

                //Mientras "b" sea igual a 1 el programa se va a ejecutar
                while (b == 1){

                    //esta parte del programa es para modificar las notas o agregar mas asignaturas
                    System.out.println("Para modificar las notas presione 1");
                    System.out.println("Para agregar asignaturas presione 2");
                    System.out.println("Para salir presione 0");

                    int n = teclado.nextInt();//llamo el metodo Scanner con teclado

                    switch (n) {
                        case 0: //al usuario ingresar 0 va a cambiar el valor de b a 0 y va a salir del while
                            b = 0;
                            break;
                        case 1: //modificar las notas

                            //recorro cada uno de los datos de la lista para agregarle una nota
                            for (int i = 0; i < Alumno1.getListaAsignaturas().size(); i++) {
                                /*System.out.println(Alumno1.getListaAsignaturas().get(i).getNombre());*/
                                //aqui decido agregar una nota de forma aleatoria
                                //en los casos 2 y 3, lo solicito por teclado
                                Alumno1.getListaAsignaturas().get(i).setNota((double) (Math.random()*5));
                            }

                            //imprimo nuevamente las asignaturas con las notas recien asignadas
                            for (int i = 0; i < Alumno1.getListaAsignaturas().size(); i++) {
                                System.out.println(Alumno1.getListaAsignaturas().get(i));
                                Alumno1.getListaAsignaturas().get(i).resultado();
                            }
                            Alumno1.promedio();//llamo el metodo promedio con las nuevas notas
                            break;
                        case 2: //agregar asignaturas

                            //inicialmente valido que el alumno tenga 4 materias o menos
                            if (Alumno1.getListaAsignaturas().size()<=3) { //si se cumple se ejecutara lo siguiente
                            System.out.println("Seleccione la materia a ingresar:");
                            System.out.println("1. Calculo");
                            System.out.println("2. LPOO");
                            System.out.println("3. Fisica");
                            System.out.println("4. Comunicaciones");
                            System.out.println("5. Matematicas");
                            System.out.println("6. Base de datos");
                            System.out.println("7. Logica de programacion");
                            int m = teclado.nextInt();
                            switch (m) {
                                /*cada caso corresponde a una asignatura, voy a poner comentarios en el primero
                                los demas se ejecutan de la misma forma*/
                                case 1: //Calculo
                                    //valido que la asignatura seleccionada por el usuario no este en la lista
                                    if (Alumno1.getListaAsignaturas().contains(Calculo)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        //al no estar en la lista, la agrefo
                                        Alumno1.getListaAsignaturas().add(Calculo);
                                        System.out.println("Asignatura agregada: " + Calculo.getNombre());

                                        /*llamo nuevamente los metodos imprimir y promedio para que se muestren con la
                                        nueva asignatura y el nuevo promedio*/
                                        Alumno1.imprimir();
                                        Alumno1.promedio();
                                    }
                                    break;
                                case 2: //LPOO
                                    if (Alumno1.getListaAsignaturas().contains(LPOO)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno1.getListaAsignaturas().add(LPOO);
                                        System.out.println("Asignatura agregada: " + Calculo.getNombre());
                                        Alumno1.imprimir();
                                        Alumno1.promedio();
                                    }
                                    break;
                                case 3: //Fisica
                                    if (Alumno1.getListaAsignaturas().contains(Fisica)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno1.getListaAsignaturas().add(Fisica);
                                        System.out.println("Asignatura agregada: " + Fisica.getNombre());
                                        Alumno1.imprimir();
                                        Alumno1.promedio();
                                    }
                                    break;
                                case 4: //Comunicaciones
                                    if (Alumno1.getListaAsignaturas().contains(Comunicaciones)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno1.getListaAsignaturas().add(Comunicaciones);
                                        System.out.println("Asignatura agregada: " + Comunicaciones.getNombre());
                                        Alumno1.imprimir();
                                        Alumno1.promedio();
                                    }
                                    break;
                                case 5: //Matematicas
                                    if (Alumno1.getListaAsignaturas().contains(Matematicas)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno1.getListaAsignaturas().add(Matematicas);
                                        System.out.println("Asignatura agregada: " + Matematicas.getNombre());
                                        Alumno1.imprimir();
                                        Alumno1.promedio();
                                    }
                                    break;
                                case 6: //Base de datos
                                    if (Alumno1.getListaAsignaturas().contains(BaseDeDatos)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno1.getListaAsignaturas().add(BaseDeDatos);
                                        System.out.println("Asignatura agregada: " + BaseDeDatos.getNombre());
                                        Alumno1.imprimir();
                                        Alumno1.promedio();
                                    }
                                    break;
                                case 7: //Logica
                                    if (Alumno1.getListaAsignaturas().contains(Logica)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno1.getListaAsignaturas().add(Logica);
                                        System.out.println("Asignatura agregada: " + Logica.getNombre());
                                        Alumno1.imprimir();
                                        Alumno1.promedio();
                                    }
                                    break;
                                default:
                                    System.out.println("Entrada incorrecta");
                            }
                        }else{ //si el usuario tiene 4 materias o mas
                                System.out.println("El alumno no puede matricular mas asignaturas");
                            }
                    }
                }
                break;
            case 2: /* El caso 2 es igual al 1 solo que cambia al alumno 2, en este alumno se pide que ingrese las
                notas por teclado*/
                Alumno2.imprimir();
                for(int i = 0; i < Alumno2.getListaAsignaturas().size(); i++) {
                    System.out.println(Alumno2.getListaAsignaturas().get(i));
                    Alumno2.getListaAsignaturas().get(i).resultado();
                }
                Alumno2.promedio();
                b = 1;
                while (b == 1){
                System.out.println("Para modificar las notas presione 1");
                System.out.println("Para agregar asignaturas presione 2");
                System.out.println("Para salir presione 0");
                int n = teclado.nextInt();
                switch (n) {
                    case 0:
                        b = 0;
                        break;
                    case 1:
                        for (int i = 0; i < Alumno2.getListaAsignaturas().size(); i++) {
                            System.out.println(Alumno2.getListaAsignaturas().get(i).getNombre());
                            Alumno1.getListaAsignaturas().get(i).setNota(teclado.nextDouble());
                        }
                        for (int i = 0; i < Alumno2.getListaAsignaturas().size(); i++) {
                            System.out.println(Alumno2.getListaAsignaturas().get(i));
                            Alumno2.getListaAsignaturas().get(i).resultado();
                        }
                        Alumno2.promedio();
                        break;
                    case 2:
                        if (Alumno2.getListaAsignaturas().size()<=3) {
                            System.out.println("Seleccione la materia a ingresar:");
                            System.out.println("1. Calculo");
                            System.out.println("2. LPOO");
                            System.out.println("3. Fisica");
                            System.out.println("4. Comunicaciones");
                            System.out.println("5. Matematicas");
                            System.out.println("6. Base de datos");
                            System.out.println("7. Logica de programacion");
                            int m = teclado.nextInt();
                            switch (m) {
                                case 1:
                                    if (Alumno2.getListaAsignaturas().contains(Calculo)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno2.getListaAsignaturas().add(Calculo);
                                        System.out.println("Asignatura agregada: " + Calculo.getNombre());
                                        Alumno2.imprimir();
                                        Alumno2.promedio();
                                    }
                                    break;
                                case 2:
                                    if (Alumno2.getListaAsignaturas().contains(LPOO)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno2.getListaAsignaturas().add(LPOO);
                                        System.out.println("Asignatura agregada: " + Calculo.getNombre());
                                        Alumno2.imprimir();
                                        Alumno2.promedio();
                                    }
                                    break;
                                case 3:
                                    if (Alumno2.getListaAsignaturas().contains(Fisica)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno2.getListaAsignaturas().add(Fisica);
                                        System.out.println("Asignatura agregada: " + Fisica.getNombre());
                                        Alumno2.imprimir();
                                        Alumno2.promedio();
                                    }
                                    break;
                                case 4:
                                    if (Alumno2.getListaAsignaturas().contains(Comunicaciones)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno2.getListaAsignaturas().add(Comunicaciones);
                                        System.out.println("Asignatura agregada: " + Comunicaciones.getNombre());
                                        Alumno2.imprimir();
                                        Alumno2.promedio();
                                    }
                                    break;
                                case 5:
                                    if (Alumno2.getListaAsignaturas().contains(Matematicas)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno2.getListaAsignaturas().add(Matematicas);
                                        System.out.println("Asignatura agregada: " + Matematicas.getNombre());
                                        Alumno2.imprimir();
                                        Alumno2.promedio();
                                    }
                                    break;
                                case 6:
                                    if (Alumno2.getListaAsignaturas().contains(BaseDeDatos)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno2.getListaAsignaturas().add(BaseDeDatos);
                                        System.out.println("Asignatura agregada: " + BaseDeDatos.getNombre());
                                        Alumno2.imprimir();
                                        Alumno2.promedio();
                                    }
                                    break;
                                case 7:
                                    if (Alumno2.getListaAsignaturas().contains(Logica)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno2.getListaAsignaturas().add(Logica);
                                        System.out.println("Asignatura agregada: " + Logica.getNombre());
                                        Alumno2.imprimir();
                                        Alumno2.promedio();
                                    }
                                    break;
                                default:
                                    System.out.println("Entrada incorrecta");
                            }
                        }else{
                            System.out.println("El alumno no puede matricular mas asignaturas");
                        }
                }
            }
                break;
            case 3: /* El caso 3 es igual al 1 solo que cambia al alumno 3, en este alumno se pide que ingrese las
                notas por teclado*/
                Alumno3.imprimir();
                for(int i = 0; i < Alumno3.getListaAsignaturas().size(); i++) {
                    System.out.println(Alumno3.getListaAsignaturas().get(i));
                    Alumno3.getListaAsignaturas().get(i).resultado();
                }
                Alumno3.promedio();
                b = 1;
                while (b == 1){
                System.out.println("Para modificar las notas presione 1");
                System.out.println("Para agregar asignaturas presione 2");
                System.out.println("Para salir presione 0");
                int n = teclado.nextInt();
                    switch (n) {
                        case 0:
                            b = 0;
                            break;
                        case 1:
                            for (int i = 0; i < Alumno3.getListaAsignaturas().size(); i++) {
                                System.out.println(Alumno3.getListaAsignaturas().get(i).getNombre());
                                Alumno3.getListaAsignaturas().get(i).setNota(teclado.nextDouble());
                            }
                            for (int i = 0; i < Alumno3.getListaAsignaturas().size(); i++) {
                                System.out.println(Alumno3.getListaAsignaturas().get(i));
                                Alumno3.getListaAsignaturas().get(i).resultado();
                            }
                            Alumno3.promedio();
                            break;
                        case 2:
                            if (Alumno3.getListaAsignaturas().size()<=3) {
                                System.out.println("Seleccione la materia a ingresar:");
                                System.out.println("1. Calculo");
                                System.out.println("2. LPOO");
                                System.out.println("3. Fisica");
                                System.out.println("4. Comunicaciones");
                                System.out.println("5. Matematicas");
                                System.out.println("6. Base de datos");
                                System.out.println("7. Logica de programacion");
                                int m = teclado.nextInt();
                                switch (m) {
                                case 1:
                                    if (Alumno3.getListaAsignaturas().contains(Calculo)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno3.getListaAsignaturas().add(Calculo);
                                        System.out.println("Asignatura agregada: " + Calculo.getNombre());
                                        Alumno3.imprimir();
                                        Alumno3.promedio();
                                    }
                                    break;
                                case 2:
                                    if (Alumno3.getListaAsignaturas().contains(LPOO)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno3.getListaAsignaturas().add(LPOO);
                                        System.out.println("Asignatura agregada: " + Calculo.getNombre());
                                        Alumno3.imprimir();
                                        Alumno3.promedio();
                                    }
                                    break;
                                case 3:
                                    if (Alumno3.getListaAsignaturas().contains(Fisica)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno3.getListaAsignaturas().add(Fisica);
                                        System.out.println("Asignatura agregada: " + Fisica.getNombre());
                                        Alumno3.imprimir();
                                        Alumno3.promedio();
                                    }
                                    break;
                                case 4:
                                    if (Alumno3.getListaAsignaturas().contains(Comunicaciones)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno3.getListaAsignaturas().add(Comunicaciones);
                                        System.out.println("Asignatura agregada: " + Comunicaciones.getNombre());
                                        Alumno3.imprimir();
                                        Alumno3.promedio();
                                    }
                                    break;
                                case 5:
                                    if (Alumno3.getListaAsignaturas().contains(Matematicas)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno3.getListaAsignaturas().add(Matematicas);
                                        System.out.println("Asignatura agregada: " + Matematicas.getNombre());
                                        Alumno3.imprimir();
                                        Alumno3.promedio();
                                    }
                                    break;
                                case 6:
                                    if (Alumno3.getListaAsignaturas().contains(BaseDeDatos)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno3.getListaAsignaturas().add(BaseDeDatos);
                                        System.out.println("Asignatura agregada: " + BaseDeDatos.getNombre());
                                        Alumno3.imprimir();
                                        Alumno3.promedio();
                                    }
                                    break;
                                case 7:
                                    if (Alumno3.getListaAsignaturas().contains(Logica)) {
                                        System.out.println("El estudiante ya tiene esa asignatura");
                                    } else {
                                        Alumno3.getListaAsignaturas().add(Logica);
                                        System.out.println("Asignatura agregada: " + Logica.getNombre());
                                        Alumno3.imprimir();
                                        Alumno3.promedio();
                                    }
                                    break;
                                default:
                                    System.out.println("Entrada incorrecta");
                                }
                            }else{
                                System.out.println("El alumno no puede matricular mas asignaturas");
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                }
                break;
            default:
                    System.out.println("No existe ningun estudiante");
        }
    }
}