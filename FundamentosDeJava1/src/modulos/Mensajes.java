package modulos;

import javax.swing.JOptionPane;

public class Mensajes {
    public static void main (String args[]){
        String nombre;
        nombre = JOptionPane.showInputDialog("ingrese nombre");
        saludar (nombre);
    }
    public static void saludar (String nombre){
        System.out.println("Bienvenid@ "+ nombre);
    }
    
}
