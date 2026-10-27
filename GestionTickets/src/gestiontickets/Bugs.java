/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontickets;

/**
 *
 * @author abiga
 */
public class Bugs extends TareaBase{
    private String entorno;
    
    
    public Bugs (String idTicketHIJO, String tituloHIJO, boolean resueltoHijo, String entorno){
        super(idTicketHIJO,tituloHIJO, resueltoHijo);
        this.entorno = entorno;
    }
    
    @Override
    public int calcularPrioridad (){
        if(this.entorno.equals("Produccion")){
        return 3;
    }
    else 
    {
    return 2;
    }
}

}//Fin class Bugs
