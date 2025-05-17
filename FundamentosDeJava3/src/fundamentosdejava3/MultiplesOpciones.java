/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosdejava3;

import javax.swing.JOptionPane;

/**
 *
 * @author daphne
 */
public class MultiplesOpciones {
    public static void main (String args[]){
        int opciones;
        opciones = Integer.parseInt(JOptionPane.showInputDialog("Seleccione: "));
        
        switch(opciones){
            case 1:
                System.out.println("seleccion el 1");
                break;
            case 2:
                System.out.println("seleccion el 2");
                break;
            case 3:
                System.out.println("seleccion el 3");
                break;
        }
    }
    
}
