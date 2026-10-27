/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiontickets;

/**
 *Un equipo de desarrollo de software necesita un sistema para organizar su trabajo.
 * Todo lo que se registra en el sistema es una Tarea Base (tiene un ID y un título). 
 * 
 * Un tipo específico de tarea es un Bug (Error de Código), el cual requiere saber en 
 * qué entorno ocurrió (ej. Producción, Pruebas). Finalmente, existen los Bugs de Seguridad, 
 * que son errores críticos que, además de lo anterior, deben registrar el código de vulnerabilidad (CVE) y si los datos de los usuarios están expuestos.
 * 
 */
public class GestionTickets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TareaBase tarea1 = new TareaBase ("TB-01", "PRUEBA 1", true);
        tarea1.marcaResuelto();
        System.out.println("\nPrioridad: "+tarea1.calcularPrioridad());
        
        System.out.println("\n");
        System.out.println("SIGUE EL HIJO DE TAREA BASE");
        System.out.println("");
        
        Bugs bugs1 = new Bugs ("B-01","PRUEBA 1B", true, "Produccion");
        bugs1.marcaResuelto();
        System.out.println("\nPrioridad: "+bugs1.calcularPrioridad());
        
        
        
        
    }//FIN MAIN
    
}//FIN CLASS
