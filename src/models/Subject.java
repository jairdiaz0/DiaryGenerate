/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;

/**
 * Modelo de las Asignaturas.
 *
 * @author edenj
 */
public class Subject implements Serializable {

    public static final long serialVersionUID = 1L;
    private int semestre;
    private String clave;
    private String Asignatura;

    public Subject(int semestre, String clave, String Asignatura) {
        this.semestre = semestre;
        this.clave = clave;
        this.Asignatura = Asignatura;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the Asignatura
     */
    public String getAsignatura() {
        return Asignatura;
    }

    /**
     * @param Asignatura the Asignatura to set
     */
    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

}
