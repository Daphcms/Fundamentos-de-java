package modulos;

public class inicio {
    
    public static void main (String args[]){
        Saludar();
        SaludoPersonal();
    }
   
    public static void Saludar(){
        System.out.println("Bienvenido estudiante");
    }
    
    public static void SaludoPersonal(){
        String nombre;
        nombre = "Juan";
        System.out.println("Bienvenido "+ nombre);
    }
}
