/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author edenj
 */
public class Interfaz {

    /**
     * Método que nos permite revisar si los elementos estan vacios o contienen
     * solo caracteres de espacio.
     *
     * @param arr Arreglo de los objectos a evaluar.
     * @return false, en caso de que cumpla con lo mencionado arriba, true
     * contrario.
     */
    public static boolean checkBlank(Object... arr) {
        for (Object obj : arr) {
            String text = null;
            if (obj instanceof javax.swing.JTextField jTextField) {
                text = jTextField.getText();
            } else if (obj instanceof javax.swing.JSpinner jSpinner) {
                text = jSpinner.getValue().toString();
            }
            if (text == null || text.isBlank() || text.isEmpty()) {
                return false;
            }
        }
        return true;
    }
    
    public static void setEnabled(boolean enabled, Object... arr) {
        for (Object obj : arr) {
            if (obj instanceof javax.swing.JTextField jTextField) {
                jTextField.setEnabled(enabled);
            } else if (obj instanceof javax.swing.JCheckBox jCheckBox) {
                jCheckBox.setEnabled(enabled);
            } else if (obj instanceof javax.swing.JSpinner jSpinner) {
                jSpinner.setEnabled(enabled);
            } else if (obj instanceof javax.swing.JButton jButton) {
                jButton.setEnabled(enabled);
            } else if (obj instanceof javax.swing.JLabel jLabel) {
                jLabel.setEnabled(enabled);
            } else if (obj instanceof javax.swing.JComboBox jComboBox) {
                jComboBox.setEnabled(enabled);
            }
        }
    }

    /**
     * Método que nos permite cambiar un panel el un JFrame.
     *
     * @param jFrame
     * @param jPanelOriginal
     * @param jPanelNuevo
     * @param border
     * @param title
     * @param jLabelTitle
     * @param x
     * @param y
     * @param width
     * @param heigth
     */
    public static void changePanel(javax.swing.JFrame jFrame, javax.swing.JPanel jPanelNuevo, javax.swing.border.Border border,
            String title, javax.swing.JLabel jLabelTitle, int x, int y, int width, int heigth) {
        if (jLabelTitle != null) {
            jLabelTitle.setText(title);
        }
        if (border != null) {
            jPanelNuevo.setBorder(border);
        }
        jFrame.setTitle(title);
        jFrame.add(jPanelNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, width, heigth));
        jFrame.repaint();
    }
}
