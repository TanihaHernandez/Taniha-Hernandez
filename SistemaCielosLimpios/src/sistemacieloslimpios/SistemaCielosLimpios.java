/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemacieloslimpios;

import java.util.Random;

/**
 *
 * @author abiga
 */
public class SistemaCielosLimpios {
 // TODO code application logic here

    public static void main(String[] args) {
        Random aleatorio = new Random();

        DronReconocimientoTactico[] escuadronTactico = new DronReconocimientoTactico[3];
        escuadronTactico[0] = new DronReconocimientoTactico("REC-001", 100, true);
        escuadronTactico[1] = new DronReconocimientoTactico("REC-002", 95, true);
        escuadronTactico[2] = new DronReconocimientoTactico("REC-003", 90, true);

        DronCargaAmbiental[] escuadronPesado = new DronCargaAmbiental[2];

        escuadronPesado[0] = new DronCargaAmbiental("CAR-001", 100, true, 50);
        escuadronPesado[1] = new DronCargaAmbiental("CAR-002", 95, true, 50);

        System.out.println(" \n");
       System.out.println("       ESCUADRON TACTICO");

        for (int i = 0; i < escuadronTactico.length; i++) {
            System.out.println("\nDron numero " + (i + 1));

            escuadronTactico[i].generarMapeoEstocastico();
            escuadronTactico[i].analizarAmenazas();
        }

        System.out.println(" \n");
        System.out.println("       ESCUADRON PESADO");

        for (int i = 0; i < escuadronPesado.length; i++) {
            System.out.println("\nDron numero " + (i + 1));
            double peso = 10 + aleatorio.nextInt(41);

            escuadronPesado[i].engancharDesecho(peso);
            escuadronPesado[i].descargarContenedorBase();
        }

        System.out.println(" \n");
        System.out.println("     DESGASTE DE ENERGIA");
        for (int i = 0; i < escuadronTactico.length; i++) {

            System.out.println("\nDron: " + escuadronTactico[i].getCodigoSerie());
            int energiaNueva =  escuadronTactico[i].getNivelEnergia() - 20;

            escuadronTactico[i].setNivelEnergia(energiaNueva);
            escuadronTactico[i].setNivelEnergia(120);
        }

        for (int i = 0; i < escuadronPesado.length; i++) {
            System.out.println("\nDron: " + escuadronPesado[i].getCodigoSerie());

            int energiaNueva = escuadronPesado[i].getNivelEnergia() - 20;

            escuadronPesado[i].setNivelEnergia(energiaNueva);
            escuadronPesado[i].setNivelEnergia(-15);
        }

        System.out.println(" \n");
        System.out.println("       TELEMETRIA FINAL");
        
        for (int i = 0; i < escuadronTactico.length; i++) {
            escuadronTactico[i].transmitirEstadoRed();
        }

        for (int i = 0; i < escuadronPesado.length; i++) {
            escuadronPesado[i].transmitirEstadoRed();
        }
        System.out.println(" \n");
        System.out.println(" MISION CIELOS LIMPIOS FINALIZADA");


    }//Fin de main 
}//Fin de class
