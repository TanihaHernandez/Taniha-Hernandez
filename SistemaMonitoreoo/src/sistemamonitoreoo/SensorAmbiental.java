/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemamonitoreoo;

/**
 *
 * @author abiga
 */
public class SensorAmbiental {
    
 //Atributos 
    private String CodigoMAC;
    private double temperaturaCelsius;
    private int humedadRelativa;
    private boolean estado;
    
    public SensorAmbiental (String codigo, double temCel, int humedadRel, boolean estado){
        this.CodigoMAC = codigo;
        this.temperaturaCelsius = temCel;
        this.humedadRelativa = humedadRel;
        this.estado = estado;
    }//Fin de constructor
    
    //Getter 
    public String getCodigoMAC(){
        return this.CodigoMAC;
    }
    public double getTemperaturaCelsius(){
        return this.temperaturaCelsius;
    }
    public int getHumedadRelativa(){
        return this.humedadRelativa;
    }
    public boolean getEstado(){
        return this.estado;
    }
    
    //Setter
    public void setTemperatura(double tempC){
        if(tempC >= -40 && tempC <=125){
            this.temperaturaCelsius = tempC;
            System.out.println("Temperatgura Actualizada");
        }
        else {
            System.out.println("Alerta de Seguridad");
            System.out.println("Lectura de Temperatura Descartada");
            System.out.println("Fuera de Rango");
        }
    }//Fin setter setTemperatura
    
    public void setHumedadRelativa (int hr){
        if(hr<0 || hr >100){
         System.out.println("Advertencia... LECTURA ERRONEA");
         this.humedadRelativa = 0;
        }
        else{
            this.humedadRelativa = hr;
            System.out.println("HR....actualizado");
        }
    }//Fin de setHumedadRelativa
    
    public void setCodigoMAC (String codigo){
        this.CodigoMAC = codigo;
    }//fin setCodigoMAC
     public void setEstado (boolean estado){
        this.estado = estado;
    }//fin setEstado
     
    public void reporteEstado(){
        System.out.printf("Temperarura: %.2f\n", this.temperaturaCelsius);
        System.out.printf("Humedad Relativa: %d\n", this.humedadRelativa);
        System.out.printf("Codigo: %s\n", this.CodigoMAC);
        System.out.printf("Estado: %b\n", this.estado);
    }
}//Fin 
