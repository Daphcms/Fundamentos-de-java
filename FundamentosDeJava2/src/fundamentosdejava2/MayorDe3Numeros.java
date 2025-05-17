
package fundamentosdejava2;

import javax.swing.JOptionPane;

public class MayorDe3Numeros {
    public static void main (String args[]){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer numero"));
       
        int mayor = Math.max(Math.max(num1, num2), num3);
        
        JOptionPane.showMessageDialog(null,"El numero mayor es: "+ mayor);
    }
    
}
