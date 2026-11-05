/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacieloslimpios;

import java.util.Random;

/**
 *
 * @author abiga
 */

public class DronReconocimientoTactico extends DronBase {

    private int[] lecturasAmenazas;

    // Constructor
    public DronReconocimientoTactico(String codigoSerie, int nivelEnergia, boolean conectadoRed) {
        super(codigoSerie, nivelEnergia, conectadoRed);

        lecturasAmenazas = new int[7];
    }// Fin de constructor

    public void generarMapeoEstocastico() {
        Random aleatorio = new Random();
        System.out.println("\nGenerando mapeo del dron " + getCodigoSerie());

        for (int i = 0; i < lecturasAmenazas.length; i++) {
            lecturasAmenazas[i] = aleatorio.nextInt(51);

            System.out.println("Cuadrante " + (i + 1) + ": " + lecturasAmenazas[i]);
        }
    }//Fin de generarMapeoEstocastico

    public void analizarAmenazas() {
        System.out.println("\nAnalizando amenazas del dron " + getCodigoSerie());

        for (int i = 0; i < lecturasAmenazas.length; i++) {
            if (lecturasAmenazas[i] > 35) {
                System.out.println("Peligro detectado en el cuadrante " + (i + 1));
                emitirAlertaIncendio();

                return;
            } else {
                System.out.println("Cuadrante " + (i + 1) + ": Sin peligro critico.");
            }
        }
        System.out.println("No se detectaron amenazas criticas.");
    }// fin analizarAmenazas

    private void emitirAlertaIncendio() {
        System.out.println("\nALERTA ROJA! Posible incendio en el sector.");
    }
}//Fin class DronReconocimientoTactico

