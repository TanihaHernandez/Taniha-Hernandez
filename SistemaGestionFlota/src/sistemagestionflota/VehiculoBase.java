/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionflota;

/**
 *
 * @author abiga
 */
public abstract class VehiculoBase {

    //Atributos
    private String marca;
    private double precio;
    protected boolean enMovimiento;
    
    //Constructor
    public VehiculoBase(String marca, double precio){
        setMarca(marca);
        setPrecio(precio);
        this.enMovimiento = false;
    }//Fin Constructor
    
    //GET Y SET
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca == null || marca.trim().isEmpty()){
            System.out.println("Marca Invalida..no se reconoce");
            this. marca ="Sin Marca";
        }else{
            this.marca = marca;
        }
    }//Fin Set Marca

    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        
        if(precio<1000){
            System.out.println("Advertencia...precio no valido");
            System.out.println("Se asigna 1000");
            this.precio = 1000;
        }else{
            this.precio = precio;
        }
    }//Fin setPrecio
    
    //Metodos
    protected void revisarSistemasInternos(){
        System.out.println("Revisando sistemas del vehiculo");
    }
    
    public abstract void mostrarDatosVehiculo();
}//Fin Class VehiculoBase