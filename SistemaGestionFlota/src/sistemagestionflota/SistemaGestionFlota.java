/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestionflota;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class SistemaGestionFlota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      VehiculoBase[] flota = new VehiculoBase[5];
      int seleccion = 0;
      
      String marca ="";
      double precio = 0;
      int bateria = 0;
      int capacidad =0;
      int contador = 0;
      
        do {
            System.out.println("Menu Interactivo");
            System.out.println("1. Registrar AutoElectrico");
            System.out.println("2. Registrar Camion Carga");
            System.out.println("3. Mostrar Flota");
            System.out.println("4. Salir");
            seleccion = sc.nextInt();
            sc.nextLine();
            switch (seleccion) {
                case 1:
                    System.out.println("Registro de Auto Electrico");
                    System.out.print("Ingrese la Marca: ");
                    marca = sc.nextLine().toUpperCase();
                    System.out.print("Ingrese el precio: ");
                    precio = sc.nextDouble();
                    System.out.print("Ingrese nivel de Bateria: ");
                    bateria = sc.nextInt();
                    sc.nextLine();
                    flota[contador] = new AutoElectrico(marca, precio, bateria);
                    contador++;
                    System.out.println("Auto Electrico Registrado!!!");
                    break;
                case 2:
                    System.out.println("Registro de Camion de Carga");
                    System.out.print("Ingrese la Marca: ");
                    marca = sc.nextLine().toUpperCase();
                    System.out.print("Ingrese el precio: ");
                    precio = sc.nextDouble();
                    System.out.print("Ingrese Capacidad de Carga: ");
                    capacidad = sc.nextInt();
                    sc.nextLine();
                    flota[contador] = new CamionCarga(marca, precio, capacidad);
                    contador++;
                    System.out.println("Camion de Carga Registrado!!!");
                    break;
                case 3:
                    for (int i = 0; i < contador; i++) {
                        flota[i].mostrarDatosVehiculo();
                        
                        if(flota[i] instanceof IConducible){
                            ((IConducible)flota[i]).encenderMotor("Llave Maestra");
                        }//Casting
                        
                        if(flota[i] instanceof IElectrico){
                            ((IElectrico)flota[i]).cargarBateria(100);
                        }
                        
                    }
                    break;
                case 4:
                    break;
                default:
                    
            }//Fin de Switch
        } while (true);
    }//Fin Main
}//Fin Class