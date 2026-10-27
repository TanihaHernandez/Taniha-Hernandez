/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontickets;

/**
 *
 * @author abiga
 */
public class BugSeguridad extends Bugs {
    private String CodigoCVE;
    private boolean datosExpuestos;
    
    public BugSeguridad (String idTicketNIETO, String idTituloNIETO,boolean resueltoNIETO, String entornoHijo, String codigoCVE, boolean datosEXP) {
    
    super(idTicketNIETO,idTituloNIETO, resueltoNIETO, entornoHijo);
    this.CodigoCVE = codigoCVE;
    this.datosExpuestos = datosEXP;
}
    
}//Fin de class BugSeguridad
