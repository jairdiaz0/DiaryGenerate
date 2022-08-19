/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;

/**
 *
 * @author edenj
 */
public class Diary implements Serializable {

    public static final long serialVersionUID = 1L;
    private int horaInicio;
    private int horaFinal;

    public Diary(int horaInicio, int horaFinal) {
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    /**
     * @return the horaInicio
     */
    public int getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFinal
     */
    public int getHoraFinal() {
        return horaFinal;
    }

    /**
     * @param horaFinal the horaFinal to set
     */
    public void setHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String desp() {
        String desp = "Hora de Inicio: " + this.getHoraInicio() + "\n";
        desp += "Hora Final: " + this.getHoraFinal() + "\n";
        return desp;
    }

    public String desp(String sep) {
        String desp = sep + "Hora de Inicio: " + this.getHoraInicio() + "\n";
        desp += sep + "Hora Final: " + this.getHoraFinal() + "\n";
        return desp;
    }
}
