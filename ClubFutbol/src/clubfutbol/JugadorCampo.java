/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubfutbol;

/**
 *
 * @author abiga
 */
public class JugadorCampo extends miembroEquipo{
    private String posicionTactica;
    private int golesMarcados;
    
    public JugadorCampo (String ligaOrigen, int goles){
        super (ligaOrigen);
        this.golesMarcados = goles;
    }
    
    public String getPosicionTactica(){
        return posicionTactica;
    }
    public void setPosicionTactica(String posicionTactica){
        if (posicionTactica.isBlank()){
            this.posicionTactica = "sin posicion";
        }
        else{
            this.posicionTactica = posicionTactica;
        }
    }//Fin setPosicionTactica
    
    public int getGolesMarcados(){
        return golesMarcados;
    }
    
    public void setGolesMarcados (int golesMarcados){
        if (golesMarcados < 0){
            this.golesMarcados = 0;
            System.out.println("No pueden haber goles negativos");
        }else{
            this.golesMarcados = golesMarcados;
        }
    }//fin setGolesMarcados
    
    public void disputarPartido(){
       int goles = 0;
        System.out.println("Seleccion oficial");
        System.out.println("-------------------");
        
        iniciarPretemporada();
        System.out.printf("Jugador proveniente de: %s, sale a la cancha", this.ligaOrigen);
   
        while (goles < this.golesMarcados){
            if(goles %2 == 0){
                System.out.printf("Gol #%d par anotado de pierna izquierda. \n", goles+1);
            }
            else {
                System.out.printf("Gol #%d Impar anotado de pierna derecha.\n", goles+1);
            }
            goles++;
            
        }//Fin ciclo while
        
        System.out.println("FIN DEL PARTIDO....");
        
        setSumarMinutos(90);
    }//Fin metodo disputarPartido
}// fin de class
