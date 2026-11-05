/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionflota;

/**
 *
 * @author abiga
 */
public class AutoElectrico extends VehiculoBase implements IConducible,IElectrico{

    //Atributos
    private int nivelBateria;
        
    //Constructor
    public AutoElectrico(String marca, double precio, int bateria){
        super(marca,precio);
        setNivelBateria(nivelBateria);
    }
    
    //GET Y SET
    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if(nivelBateria >=0 && nivelBateria<=100){
            this.nivelBateria = nivelBateria;
        }else{
            System.out.println("Valor no posible en bateria");
            this.nivelBateria = 0;
        }
    }//Fin Set Nivel Bateria
        
    //Metodos
    @Override
    public void cargarBateria(int horas){
        System.out.printf("Conectando %s a la red de la ENEE.\n",getMarca());
        System.out.printf("Tiempo estimado de carga: %d",horas);
    }
    
    @Override
    public void encenderMotor(String tipoLlave){
        System.out.println("Encendiendo el carro electrico.");
        System.out.println("La llave es: "+tipoLlave);
        this.enMovimiento = true;
    }
    
    @Override
    public void mostrarDatosVehiculo(){
        revisarSistemasInternos();
        System.out.printf("Precio: %.2f\n",getPrecio());
        System.out.printf("Marca: %s\n",getMarca());
        System.out.printf("Carga de Bateria: %d\n",getNivelBateria());
    }

}//Fin Class AutoElectrico