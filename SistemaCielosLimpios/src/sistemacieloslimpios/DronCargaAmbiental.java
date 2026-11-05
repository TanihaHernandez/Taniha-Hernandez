/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacieloslimpios;

/**
 *
 * @author abiga
 */
public class DronCargaAmbiental extends DronBase {

    private double cargaMaxima;
    private double cargaActual;

    // Constructor
    public DronCargaAmbiental(String codigoSerie, int nivelEnergia, boolean conectadoRed,double cargaMaxima) {
        super(codigoSerie, nivelEnergia, conectadoRed);
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = 0;
    }//fin constrctor 

    // Getter y Setter
    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public boolean evaluarPesoObjeto(double pesoNuevo) {
        if (pesoNuevo <= 0) {
            return true;
        }
        return (cargaActual + pesoNuevo) > cargaMaxima;
    }//fin evaluarPesoObjeto

    public void engancharDesecho(double pesoNuevo) {
       System.out.println("\nIntentando recoger un objeto de " + pesoNuevo + " kg.");
        if (!evaluarPesoObjeto(pesoNuevo)) { 
            cargaActual = cargaActual + pesoNuevo;

            System.out.println("Recoleccion exitosa.");
            System.out.println("Carga actual: "+ cargaActual + " kg.");

        } else {
            System.out.println("Maniobra cancelada.");
            System.out.println("El objeto es demasiado pesado " + "o tiene un peso invalido.");
            System.out.println("Notificando a la base.");
        }
    }//fin de engancharDesecho

    public void descargarContenedorBase() {
        System.out.println("\nRegresando a la base...");
        System.out.println("Descargando contenedor...");
        cargaActual = 0;

        System.out.println("Contenedor vacio correctamente.");
        System.out.println("Carga actual: " + cargaActual + " kg.");
    }//fin descargarContenedorBase
}//Fin class DronCargaAmbiental
   
    
    
    
