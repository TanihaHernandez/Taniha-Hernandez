/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaplantacontrolensambladora;

/**
 *
 * @author abiga
 */
public class SistemaPlantaControlEnsambladora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     BrazoRobotico brazo1 = new BrazoRobotico("BRZ-001","Electrica");
        
     brazo1.IniciarCalibracion();
     brazo1.terminarCalibracion();
     brazo1.procesarMaterial();

    }//Fin de main
    
}//Fin de class
