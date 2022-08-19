/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author edenj
 */
public class ListManager {

    public static ListaDoblementeLigadaCircular lista;

    /**
     * Método que nos permite agregar las etiquetas de una lista a un ComboBox.
     *
     * @param r Nodo desde el cual iniciamos.
     * @param combo JComboBox al cual agregaremos las etiquetas.
     */
    public static void agregarAComboBox(Nodo r, javax.swing.JComboBox combo) {
        if (r != null) {
            Nodo aux = r;
            do {
                combo.addItem(aux.getEtiqueta());
                aux = aux.getSiguiente();
            } while (aux != r);
        }
    }
}
