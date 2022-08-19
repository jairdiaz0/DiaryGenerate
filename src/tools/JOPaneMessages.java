/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author edenj
 */
public class JOPaneMessages {
    public static void error(Object obj, String s) {
        if (obj instanceof Component component) {
            JOptionPane.showMessageDialog(component, s, "Mensaje de Error", 0);
        } else {
            JOptionPane.showMessageDialog(null, s, "Mensaje de Error", 0);
        }
    }
    public static void error(Object obj, String s, String title) {
        if (obj instanceof Component component) {
            JOptionPane.showMessageDialog(component, s, title, 0);
        } else {
            JOptionPane.showMessageDialog(null, s, title, 0);
        }
    }

    public static void exito(Object obj, String s) {
        if (obj instanceof Component component) {
            JOptionPane.showMessageDialog(component, s, "Mensaje de Éxito", 1);
        } else {
            JOptionPane.showMessageDialog(null, s, "Mensaje de Éxito", 1);
        }
    }
    
    public static void exito(Object obj, String s, String title) {
        if (obj instanceof Component component) {
            JOptionPane.showMessageDialog(component, s, title, 1);
        } else {
            JOptionPane.showMessageDialog(null, s, title, 1);
        }
    }
}
