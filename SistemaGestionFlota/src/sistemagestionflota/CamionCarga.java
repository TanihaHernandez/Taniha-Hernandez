/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionflota;

/**
 *
 * @author abiga
 */
public class CamionCarga extends VehiculoBase implements IConducible{
    
    //Atributos
    private double capacidadCarga;
    
    //Constructor
    public CamionCarga(String marca, double precio, double capacidad){
        super(marca,precio);
        this.capacidadCarga = capacidad;
    }//Fin Constructor
    
    //Get y Set
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        if(capacidadCarga<0){
           this.capacidadCarga = 0.0;
            System.out.println("Valor no permitido como capacidad carga");
        }else{
             this.capacidadCarga = capacidadCarga;
        }
    }//Fin setCapacidadCarga
    
    @Override
    public void encenderMotor(String tipoLlave){
        System.out.println("Calentadores Listos. Encender!");
        System.out.println("La llave es: "+tipoLlave);
        this.enMovimiento = true;
    }
    
    @Override
    public void mostrarDatosVehiculo(){
        revisarSistemasInternos();
        System.out.printf("Precio: %.2f\n",getPrecio());
        System.out.printf("Marca: %s\n",getMarca());
        System.out.printf("Capacidad Carga: %.2f\n",getCapacidadCarga());
    }
}//Fin Class CamionCarga