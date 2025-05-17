package modulos;

public class ParametrosEjemplo {
    public static void main (String args[]){
        String nombre;
        String apellido;
        nombre = "Jose";
        apellido = "Gonzales";
        SaludoPersonal(nombre,apellido);
        nombre = "Juan";
        apellido = "Gonzales";
        SaludoPersonal(nombre,apellido);
        nombre = "Pedro";
        apellido = "Dolores";         
    }
    public static void SaludoPersonal(String nombre,String apellido){
        System.out.println("Bienvenid@ "+ nombre);
    }
    
}
