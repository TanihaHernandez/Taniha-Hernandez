/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaplantacontrolensambladora;

/**
 *
 * @author abiga
 */
public class BrazoRobotico extends EquiposIndustriales implements ICalibracion{
     private String tipoSoldadura;
     
     public BrazoRobotico( String numSerie, String tipoSoldadura){
         super(numSerie);
         this.tipoSoldadura = tipoSoldadura;
  
     }
     
     public String getSoldadura(){
         return this.tipoSoldadura;
     }
     
     @Override
     public void procesarMaterial (){
         System.out.println("Esta maquina opera con la soldadura:");
         System.out.println(""+getSoldadura());   
     }
     
     @Override
     public void IniciarCalibracion(){
         System.out.println("Inicio de calibracion Brazo");
         System.out.println("Numero de serie: "+this.NumeroSerie);
     };
     
     @Override
     public void terminarCalibracion(){
         System.out.println("Calibracion con exito");
     }
     
     @Override
    public boolean obtenerEstadoCalibracion(){
        return this.estadoOperativo;
    };
}
