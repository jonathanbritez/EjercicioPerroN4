# EjercicioPerroN4
Ejercicio_4

public class clasePerro {
    
    public static void main(String arg[]){
        String Nombre = "";
        //creo el objeto animal 
        perro animal = new perro(Nombre);
        animal.ladrar();
    
    }
    
}



public class perro {
    String Nombre;
    String Color;
    String Tamaño;
//creo el metodo constructor
    public perro(String Nom){

        this.Nombre = Nom;

    }    

//Hago el metodo ladrar

    public void ladrar(){
        Nombre = "Roky";
        System.out.println("Guau " + Nombre);
        
    }    
    
}
