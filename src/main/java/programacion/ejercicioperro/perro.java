/**
 * Crear la clase Perro, la misma debe tener 3 atributos y el método ladrar() que muestre “Guau” por consola. 
 * Crear un objeto de esta clase y comprobar el funcionamiento
 */
package programacion.ejercicioperro;

//Creo la clase perro
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
