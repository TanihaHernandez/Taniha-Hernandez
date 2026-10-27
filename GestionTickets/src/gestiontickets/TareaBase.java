/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontickets;

/**
 *
 * @author abiga
 */
public class TareaBase {
    private String idTicket;
    private String titulo;
    protected boolean resuelto;
    
public TareaBase(String idTicket, String titulo, boolean resuelto){
    this.idTicket = idTicket;
    this.titulo = titulo;
    this.resuelto = resuelto;
    
}//Fin del constructor 

public void marcaResuelto(){
    this.resuelto = true;  
    System.out.printf("El ticket %s ha sido cerrado.\n", this.idTicket);
    System.out.printf("Nombre Ticket %s", this.titulo);
}// Fin de SetmarcaResuelto

public int calcularPrioridad(){
    return 1;
}
    
}//Fin de class TareaBase
