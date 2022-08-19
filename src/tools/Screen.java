/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author edenj
 */
public class Screen {
    /**
     * Método que pone un JPanel en un JFrame;
     *
     * @param ventana JFrame donde se pondra el JPanel;
     * @param titulo String que le da titulo a la ventana;
     * @param panel JPanel que se desea agregar;
     * @param centro boolean true si se quiere poner la ventana al centro, en
     * caso contrario false;
     */
    public static void addPanel(JFrame ventana, JPanel panel, String titulo, boolean centro, boolean visible) {
        ventana.setTitle(titulo);
        //ventana.getContentPane().removeAll();
        //ventana.getContentPane().add(panel);
        ventana.setContentPane(panel);
        if (centro) {
            ventana.setLocationRelativeTo(null);
        }
        if (visible) {
            ventana.setVisible(true);
        }
    }

    /**
     * Método que nos permite obtener y poner el Look del sistema en donde se
     * esta corriendo.
     */
    public static void setLookDefault() {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
