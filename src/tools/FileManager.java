/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author edenj
 */
public class FileManager {

    /**
     * Método que guarda un Object.
     *
     * @param dir es un String con la dirección de donde se guardara el archivo.
     * @param arr es un Object que contiene todo lo que se desea guardar.
     */
    public static void guardar(String dir, Object arr)
    {
        try
        {
            FileOutputStream x = new FileOutputStream(dir);
            ObjectOutputStream archivo = new ObjectOutputStream(x);
            archivo.writeObject(arr);
            archivo.close();
        } catch (Exception ex)
        {
            System.out.println("Error... " + ex.getMessage());
        }
    }

    /**
     * Método que carga un Object.
     *
     * @param dir es un String con la dirección del archivo a cargar.
     * @return un Object con todo lo que contenga el archivo que esta en una
     * dirección en especifico.
     */
    public static Object carga(String dir) {
        Object o = null;
        try {
            FileInputStream x = new FileInputStream(dir);
            ObjectInputStream archivo = new ObjectInputStream(x);
            o = archivo.readObject();
            archivo.close();
        } catch (Exception ex) {
            System.out.println("Error..." + ex.getMessage());
        }
        return o;
    }
}
