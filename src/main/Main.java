/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author edenj
 */
public class Main {
    
    /**
     * Método inicial.
     * @param args 
     */
    public static void main(String[] args) {
        tools.Screen.setLookDefault();
        jframes.JFrameMain windowMain = new jframes.JFrameMain();
        windowMain.setResizable(false);
        tools.Screen.addPanel(windowMain, new jpanels.JPanelMain(windowMain), "Log In", true, true);
    }
}
