/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author edenj
 */
public class Diary {

    public static boolean b1 = true, b2 = false;

    public static java.util.ArrayList agruparAsignaturas(listas.ListaDoblementeLigadaCircular lista) {
        if (lista != null && lista.getPrimero() != null) {
            //Generamos un ArrayList para contener las asignaturas;
            java.util.ArrayList asignaturas = new java.util.ArrayList<java.util.ArrayList<listas.Nodo>>();
            //Generamos un Array que contiene el nombre de las Asignaturas para agruparlas.
            java.util.ArrayList etiquetasUsadas = new java.util.ArrayList<String>();
            listas.Nodo nodo = lista.getPrimero();
            do {
                String nombreAsignatura = ((models.Subject) nodo.getObj()).getAsignatura();
                int indiceAsignatura = etiquetasUsadas.indexOf(nombreAsignatura);
                java.util.ArrayList asignaturasLista;
                if (indiceAsignatura >= 0) {
                    asignaturasLista = (java.util.ArrayList) asignaturas.get(indiceAsignatura);
                    asignaturasLista.add(nodo);
                } else {
                    asignaturasLista = new java.util.ArrayList<listas.Nodo>();
                    asignaturasLista.add(nodo);
                    asignaturas.add(asignaturasLista);
                    etiquetasUsadas.add(nombreAsignatura);
                }
                nodo = nodo.getSiguiente();
            } while (nodo != lista.getPrimero());
            return asignaturas;
        }
        return null;
    }

    public static void mostrarAsignaturas(java.util.ArrayList<java.util.ArrayList<listas.Nodo>> asignaturas) {
        for (java.util.ArrayList<listas.Nodo> asignaturasLista : asignaturas) {
            System.out.println("*********************************************");
            for (listas.Nodo asignatura : asignaturasLista) {
                System.out.println(asignatura.desp());
                System.out.println("-----------------------------------------");
            }
        }
    }

    public static java.util.ArrayList<java.util.ArrayList<listas.Nodo>> combinarHorarios() {
        listas.ListaDoblementeLigadaCircular lista = listas.ListManager.lista;
        java.util.ArrayList<java.util.ArrayList<listas.Nodo>> asignaturas = agruparAsignaturas(lista);
        java.util.ArrayList<java.util.ArrayList<listas.Nodo>> horarios = null;
        if (asignaturas != null) {
            horarios = new java.util.ArrayList<>();
            combinaRecursivo(horarios, new java.util.ArrayList<>(), asignaturas, getHorario(7, 24, false));
        }
        return horarios;
    }

    public static void combinaRecursivo(java.util.ArrayList<java.util.ArrayList<listas.Nodo>> horarios,
            java.util.ArrayList<listas.Nodo> horarioAcomulado,
            java.util.ArrayList<java.util.ArrayList<listas.Nodo>> asignaturas,
            boolean[][] horario) {
        java.util.ArrayList<java.util.ArrayList<listas.Nodo>> asignaturasCopy = new java.util.ArrayList<>(asignaturas);

        //MOSTRAMOS EL RESULTADO
        if (asignaturasCopy.isEmpty()) {
            horarios.add(horarioAcomulado);
        } else {
            java.util.ArrayList<listas.Nodo> asignaturaLista = asignaturasCopy.remove(0);
            for (listas.Nodo asignatura : asignaturaLista) {
                boolean horarioTmp[][] = new boolean[horario.length][];
                for (int i = 0; i < horario.length; i++) {
                    horarioTmp[i] = new boolean[horario[i].length];
                    System.arraycopy(horario[i], 0, horarioTmp[i], 0, horario[i].length);
                }
                listas.Nodo diaHorario = asignatura.getAbajo();
                if (diaHorario != null) {
                    boolean bandera = true;
                    do {
                        models.Diary diaDiary = (models.Diary) diaHorario.getObj();
                        if (diaDiary != null) {
                            int horaInicio = diaDiary.getHoraInicio();
                            int horaFinal = diaDiary.getHoraFinal();
                            int dia = indiceDia(diaHorario.getEtiqueta());
                            if (dia >= 0) {
                                if (checarCupoEnHorario(horaInicio, horaFinal, horarioTmp[dia])) {
                                    llenarCupo(horaInicio, horaFinal, true, horarioTmp[dia]);
                                } else {
                                    bandera = false;
                                }
                            }
                        }
                        diaHorario = diaHorario.getSiguiente();
                    } while (diaHorario != asignatura.getAbajo() && bandera);
                    if (bandera) {
                        java.util.ArrayList horarioCopy = new java.util.ArrayList<>(horarioAcomulado);
                        horarioCopy.add(0,asignatura);
                        combinaRecursivo(horarios, horarioCopy, asignaturasCopy, horarioTmp);
                    }
                }
            }
        }
    }

    //public static 
    public static boolean[][] getHorario(int dias, int horas, boolean defaultValue) {
        boolean horario[][] = new boolean[dias][horas];
        for (boolean dia[] : horario) {
            for (boolean hora : dia) {
                hora = defaultValue;
            }
        }
        return horario;
    }

    public static boolean checarCupoEnHorario(int horaInicio, int horaFinal, boolean horario[]) {
        for (int i = horaInicio; i < horaFinal; i++) {
            if (horario[i]) {
                return false;
            }
        }
        return true;
    }

    public static void llenarCupo(int horaInicio, int horaFinal, boolean valor, boolean horario[]) {
        for (int i = horaInicio; i < horaFinal; i++) {
            horario[i] = valor;
        }
    }

    public static int indiceEnArrString(String[] arr, String elementoABuscar) {
        int i = 0;
        for (String elemento : arr) {
            if (elemento.equals(elementoABuscar)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int indiceDia(String dia) {
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].equals(dia)) {
                return i;
            }
        }
        return -1;
    }

    public static void mostrarHorario(boolean[][] horario) {
        int i = 0;

        for (boolean dia[] : horario) {
            int j = 0;
            System.out.println(i++ + " -> ");
            for (boolean hora : dia) {
                System.out.print((j++) + " - ");
                System.out.print(hora + "  -  ");
            }
            System.out.println("");
        }
    }

}
