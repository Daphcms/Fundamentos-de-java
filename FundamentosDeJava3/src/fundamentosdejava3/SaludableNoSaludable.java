
package fundamentosdejava3;

import javax.swing.JOptionPane;

public class SaludableNoSaludable {
    public static void main(String[] args) {
        String alimento = JOptionPane.showInputDialog("Ingrese el nombre de un alimento");
        alimento = alimento.toLowerCase();
        String[] frutasYVerduras = {"manzana","platano","naranja","lechuga","tomate","pepino","fresa","kiwi","espinaca","brocoli"};
        
        boolean esSaludable = false;
        for (String fv : frutasYVerduras){
            if (alimento.equals(fv)){
                esSaludable = true;
                break;
                
            }
        }
      if (esSaludable){
          JOptionPane.showMessageDialog(null,"Siga con una vida saludable");
      }else {
          JOptionPane.showMessageDialog(null,"Debe cuidar su alimentacion");
      } 
    }
    
}
