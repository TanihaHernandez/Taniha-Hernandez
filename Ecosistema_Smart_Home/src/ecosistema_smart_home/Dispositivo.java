/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosistema_smart_home;

/**
 *
 * @author abiga
 */
public abstract class Dispositivo {
    //Atributos
    String marca;
    
    //Constructor 
    public Dispositivo (String marca){
        this.marca = marca;        
    }
    
    //Metodos
    abstract void encender();
    
public void MostrarMarca(){
    System.out.println("Marca: "+this.marca);
}    
   
}//Fin Abstract Class Dispositivo

