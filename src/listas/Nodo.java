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
public class Nodo implements Serializable {

    private static long serialVersionUID = 1L;
    private String etiqueta;
    private Object obj;
    private Nodo anterior;
    private Nodo siguiente;
    private Nodo arriba;
    private Nodo abajo;

    /**
     * Método constructor para el NODO.
     *
     * @param etiqueta String con la etiqueta del NODO.
     * @param obj Object Objecto a Almacenar.
     * @param anterior Nodo Anterior.
     * @param siguiente Nodo Siguiente.
     * @param arriba Nodo Arriba.
     * @param abajo Nodo Abajo.
     */
    public Nodo(String etiqueta, Object obj, Nodo anterior, Nodo siguiente, Nodo arriba, Nodo abajo) {
        this.etiqueta = etiqueta;
        this.obj = obj;
        this.anterior = anterior;
        this.siguiente = siguiente;
        this.arriba = arriba;
        this.abajo = abajo;
    }

    /**
     * Método constructor para el NODO.
     *
     * @param etiqueta String con la etiqueta del NODO.
     * @param obj Object Objecto a Almacenar.
     */
    public Nodo(String etiqueta, Object obj) {
        this.etiqueta = etiqueta;
        this.obj = obj;
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the etiqueta
     */
    public String getEtiqueta() {
        return etiqueta;
    }

    /**
     * @param etiqueta the etiqueta to set
     */
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    /**
     * @return the obj
     */
    public Object getObj() {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj) {
        this.obj = obj;
    }

    /**
     * @return the anterior
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the arriba
     */
    public Nodo getArriba() {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(Nodo arriba) {
        this.arriba = arriba;
    }

    /**
     * @return the abajo
     */
    public Nodo getAbajo() {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(Nodo abajo) {
        this.abajo = abajo;
    }

    /**
     * Método que nos permite obtener la información del nodo, del siguiente y
     * del anterior.
     *
     * @return String con la información.
     */
    public String desp() {
        String desp = "Nodo: " + this.getEtiqueta() + "\n";
        if (this.getSiguiente() != null) {
            desp += "Siguiente : " + this.getSiguiente().getEtiqueta() + "\n";
        }
        if (this.getAnterior() != null) {
            desp += "Anterior : " + this.getAnterior().getEtiqueta() + "\n";
        }
        if (this.getArriba() != null) {
            desp += "Arriba : " + this.getArriba().getEtiqueta() + "\n";
        }
        if (this.getAbajo() != null) {
            desp += "Abajo : " + this.getAbajo().getEtiqueta() + "\n";
        }

        return desp;
    }
}
