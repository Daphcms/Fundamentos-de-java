
package fundamentosdejava2;

import javax.swing.JOptionPane;

public class CadenaMasLarga {
    public static void main (String args[]){
        String cadena1 = JOptionPane.showInputDialog("Ingrese la primer cadena de texto");
        String cadena2 = JOptionPane.showInputDialog("Ingrese la segunda cadena de texto");
        
        if (cadena1.length()> cadena2.length()){
            JOptionPane.showMessageDialog(null,"La cadena mas larga es: "+ cadena1);
        }else if (cadena2.length()> cadena1.length()){
            JOptionPane.showMessageDialog(null,"La cadena mas larga es: "+ cadena2);   
        }else {
           JOptionPane.showMessageDialog(null,"Ambas cadenas tienen la mism longitud"+ cadena2);  
        }
    }
    
}
