
package fundamentosdejava2;


import javax.swing.JOptionPane;


public class Ciclos2 {
   
    public static void main (String args[]){
        int nrepite;
        nrepite = Integer.parseInt(JOptionPane.showInputDialog("Cuantas ?"));
        for(int i=0; i<5; i++){
            System.out.println("Se imprime: " + i);
        }
    }
}
