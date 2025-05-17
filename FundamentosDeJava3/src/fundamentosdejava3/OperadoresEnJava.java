
package fundamentosdejava3;

import javax.swing.JOptionPane;

public class OperadoresEnJava {
     public static void main(String[] args) {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        if (valor >18 && valor <29){
            System.out.println("Cumple con la edad necesaria");
        }else{
           System.out.println("No cumple con la edad necesaria"); 
        }
        
    }
    
}
