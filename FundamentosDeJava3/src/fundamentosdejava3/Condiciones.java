
package fundamentosdejava3;

import javax.swing.JOptionPane;

public class Condiciones {
    public static void main(String[] args) {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero: "));
        if (valor ==1){
            System.out.println("El valor es 1");
        }else{
           System.out.println("Se ingreso un numero diferente"); 
        }
        
    }
    
}
