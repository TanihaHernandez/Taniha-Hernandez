/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamonitoreoo;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class SistemaMonitoreoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   // TODO code application logic here
        
        SensorAmbiental prueba = new SensorAmbiental("AA:BB:CC:D",100,0,true);
        Scanner scan = new Scanner (System.in);
        boolean cicloActivo = true;
        char seleccionMenu = 'A';
        
        while (cicloActivo){
            System.out.println("MENU DE CONTROL");
            System.out.println("1. Ingresar nueva lectura termica");
            System.out.println("2. Actualizar lectura del Higrometro");
            System.out.println("3. Solicitud de Diagnostico completo");
            System.out.println("4. Inicio de secuencia de Apagado");
            System.out.print("Seleccion: ");
            seleccionMenu = scan.next().charAt(0);
            
            
        switch (seleccionMenu){

            case '1':
                System.out.print("Ingrese la temperatura: ");
                double temp = scan.nextDouble();
                prueba.setTemperatura(temp);
                break;
            case '2':
                System.out.print("Ingrese HR: ");
                int hr = scan.nextInt();
                prueba.setHumedadRelativa(hr);
                break;
            case '3':
                prueba.reporteEstado();
                break;
            case '4':
                cicloActivo = false;
                System.out.println("Cerrando");
                System.out.println("ya casi....");
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Es del 1 al 4");
                System.out.println("Esa opcion no es valida");
                break;    
        }
        
        }//Fin de while
        
    }//Fin mein 
    
}//fin class
