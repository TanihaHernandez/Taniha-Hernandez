/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubfutbol;

/**
 *
 * @author abiga
 */
public class ClubFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //miembroEquipo Oscar = new miembroEquipo ("Liga Hondurena");
     JugadorCampo Daniel = new JugadorCampo ("Liga Espanola", 4);
     
        Daniel.setSalarioMensual(-5000);
        System.out.println("");
        
        Daniel.setSalarioMensual(15000);
        
        Daniel.setPosicionTactica("Delantero Estrella Centro!!");
        
        Daniel.disputarPartido();

    }//Fin de main
    
}//Fin class

