
package fundamentosdejava2;

import javax.swing.JOptionPane;

public class ParImpar {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        
        if (numero%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
    
}
