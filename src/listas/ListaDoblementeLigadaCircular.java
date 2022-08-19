/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.io.Serializable;

/**
 *
 * @author Jair Díaz
 */
public class ListaDoblementeLigadaCircular implements Serializable {

    public static final long serialVersionUID = 1L;

    private Nodo primero = null;

    /**
     * Método que nos permite ingresar datos a la lista.
     *
     * @param n Nodo a ingresar.
     * @return boolean, true en caso de cambiar el primero, false en caso
     * contrario.
     */
    public boolean inserta(Nodo n) {
        if (n != null) {
            if (primero == null) {
                primero = n;
                primero.setAnterior(n);
                primero.setSiguiente(n);
                return true;
            } else {
                if (n.getEtiqueta().compareTo(primero.getAnterior().getEtiqueta()) > 0) {
                    n.setAnterior(primero.getAnterior());
                    n.setSiguiente(primero);
                    primero.getAnterior().setSiguiente(n);
                    primero.setAnterior(n);
                } else {
                    if (n.getEtiqueta().compareTo(primero.getEtiqueta()) < 0) {
                        n.setAnterior(primero.getAnterior());
                        n.setSiguiente(primero);
                        if (primero.getArriba() != null) {
                            n.setArriba(primero.getArriba());
                            primero.getArriba().setAbajo(n);
                            primero.setArriba(null);
                        }
                        primero.getAnterior().setSiguiente(n);
                        primero.setAnterior(n);
                        primero = n;
                        return true;
                    } else {
                        Nodo aux = primero.getSiguiente();
                        boolean b = true;
                        do {
                            if (n.getEtiqueta().compareTo(aux.getEtiqueta()) < 0) {
                                n.setSiguiente(aux);
                                n.setAnterior(aux.getAnterior());
                                n.getAnterior().setSiguiente(n);
                                n.getSiguiente().setAnterior(n);
                                b = false;
                            }
                            aux = aux.getSiguiente();
                        } while (b && aux != primero);
                    }
                }
            }
        } else {
            System.out.println("No se puede ingresar un Nodo null");
        }
        return false;
    }

    /**
     * Método que nos permite eliminar un nodo de la lista.
     *
     * @param etiqueta String con la etiqueta del nodo a eliminar.
     * @return Nodo eliminado, o null sino se encontró.
     */
    public Nodo elimina(String etiqueta) {
        Nodo dato_eliminar = null;
        if (primero == null) {
            System.out.println("No hay elementos en la lista");
        } else {
            boolean b = true;
            Nodo aux = primero;
            do {
                if (etiqueta.equals(aux.getEtiqueta())) {
                    dato_eliminar = aux;
                    b = false;
                    if (primero != primero.getAnterior()) {
                        if (aux == primero) {
                            primero = primero.getSiguiente();
                        }
                        dato_eliminar.getAnterior().setSiguiente(dato_eliminar.getSiguiente());
                        dato_eliminar.getSiguiente().setAnterior(dato_eliminar.getAnterior());
                    } else {
                        primero = null;
                    }
                    if (dato_eliminar.getArriba() != null) {
                        if (dato_eliminar.getSiguiente() != dato_eliminar) {
                            dato_eliminar.getArriba().setAbajo(dato_eliminar.getSiguiente());
                        } else {
                            dato_eliminar.getArriba().setAbajo(null);
                        }
                        dato_eliminar.setArriba(null);
                    }
                    dato_eliminar.setSiguiente(null);
                    dato_eliminar.setAnterior(null);
                }
                aux = aux.getSiguiente();
            } while (b && aux != primero);
            if (b) {
                System.out.println("No se encontró el nodo buscado");
            }
        }
        return dato_eliminar;
    }

    /**
     * Método que nos permite buscar un Nodo de acuerdo a su etiqueta.
     *
     * @param etiqueta String con la etiqueta a buscar.
     * @return el Nodo encontrado, en caso de no encontrar null.
     */
    public Nodo buscar(String etiqueta) {
        Nodo aux = getPrimero();
        if (aux != null) {
            do {
                if (aux.getEtiqueta().equals(etiqueta)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            } while (aux != getPrimero());
        }
        return null;
    }

    /**
     * Método que nos permite insertar abajo de un Nodo.
     *
     * @param raiz Nodo raiz del cual insertar abajo.
     * @param nuevo Nodo a insertar abajo.
     * @param reemplazar boolean true si se desea reemplazar el objeto del Nodo,
     * false en caso contrario.
     */
    public void insertaAbajo(Nodo raiz, Nodo nuevo, boolean reemplazar) {
        if (raiz != null && nuevo != null) {
            ListaDoblementeLigadaCircular lista = new ListaDoblementeLigadaCircular();
            nuevo.setArriba(raiz);
            if (raiz.getAbajo() != null) {
                lista.setPrimero(raiz.getAbajo());
            } else {
                raiz.setAbajo(nuevo);
            }
            Nodo primeroTmp = getPrimero();
            if (reemplazar) {
                Nodo nodo = lista.buscar(nuevo.getEtiqueta());
                if (nodo != null) {
                    nodo.setObj(nuevo.getObj());
                } else {
                    lista.inserta(nuevo);
                }
            } else {
                lista.inserta(nuevo);
            }
            if (primeroTmp != getPrimero()) {
                raiz.setAbajo(getPrimero());
            }
        }
    }

    /**
     * Método que nos permite eliminar elementos que estan abajo de un Nodo.
     *
     * @param raiz Nodo raiz del cual eliminar sus elementos de abajo.
     * @param etiqueta String etiqueta del Nodo a eliminar.
     * @return Nodo eliminado o null en caso de no encontrarlo.
     */
    public Nodo eliminaAbajo(Nodo raiz, String etiqueta) {
        if (raiz != null && etiqueta != null) {
            if (raiz.getAbajo() != null) {
                ListaDoblementeLigadaCircular lista = new ListaDoblementeLigadaCircular();
                lista.setPrimero(raiz.getAbajo());
                return lista.elimina(etiqueta);
            }
        }
        return null;
    }

    /**
     * Método que nos permite obtener la información de los Nodos de la lista.
     *
     * @return String con la información a mostrar.
     */
    public String desp() {
        Nodo nodo = getPrimero();
        if (nodo != null) {
            String desp = "";
            desp += "---------------------------------------------------\n";
            do {
                desp += nodo.desp();
                desp += "---------------------------------------------------\n";
                nodo = nodo.getSiguiente();
            } while (nodo != getPrimero());
            return desp;
        }
        return "No hay elementos a mostrar";
    }

    /**
     * @return the primero
     */
    public Nodo getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
}
