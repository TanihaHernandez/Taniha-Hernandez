/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaplantacontrolensambladora;

/**
 *
 * @author abiga
 */
public abstract class EquiposIndustriales {
    
    //Atributos
    public String NumeroSerie;
    public boolean estadoOperativo;
    protected int horasUso;
    protected double capacidadCarga;

    public EquiposIndustriales(String numSerie){
       this.NumeroSerie = numSerie;
    
    }

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    
    public void encender(){}
    
    public void apagar(){}
    
    public abstract void procesarMaterial();
    
    
}// fin EquiposIndustriales
