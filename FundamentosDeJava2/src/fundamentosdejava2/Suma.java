
package fundamentosdejava2;

import javax.swing.JOptionPane;

public class Suma {
    public static void main (String[] args){
        int numero1;
        int numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa segundo numero"));
        int suma = numero1 + numero2;
      JOptionPane.showMessageDialog(null,"La suma es de: "+ suma);
    }
    
}
