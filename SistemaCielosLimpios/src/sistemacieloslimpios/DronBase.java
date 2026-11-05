/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacieloslimpios;

/**
 *
 * @author abiga
 */
public class DronBase {

    private String codigoSerie;
    private int nivelEnergia;
    private boolean conectadoRed;

    // Constructor
    public DronBase(String codigoSerie, int nivelEnergia, boolean conectadoRed) {
        this.codigoSerie = codigoSerie;
        this.nivelEnergia = nivelEnergia;
        this.conectadoRed = conectadoRed;

        calibrarGiroscopioInterno();
    }//Fin de constructor

    //Getter y Setter
    public String getCodigoSerie() {
        return codigoSerie;
    }//fin getCodigoSerie

    public void setCodigoSerie(String codigoSerie) {
        this.codigoSerie = codigoSerie;
    }//fin setCodigoSerie

    public int getNivelEnergia() {
        return nivelEnergia;
    }//Fin getNivelEnergia
    
    public void setNivelEnergia(int nivelEnergia) {
        if (nivelEnergia >= 0 && nivelEnergia <= 100) {
            this.nivelEnergia = nivelEnergia;

            System.out.println("Energia actualizada correctamente.");
            calibrarGiroscopioInterno();

        } else {
            System.out.println("Error: nivel de energia fuera del rango permitido (0-100).");
        }
    }// Fin de setNivelEnergia
    
    public boolean isConectadoRed() {
        return conectadoRed;
    }//Fin isConectadoRed

    public void setConectadoRed(boolean conectadoRed) {
        this.conectadoRed = conectadoRed;
        if (conectadoRed) {
            calibrarGiroscopioInterno();
        }
    }//fin setConectadoRed

    private void calibrarGiroscopioInterno() {
        System.out.println("Calibrando giroscopio del dron " + codigoSerie);
    }// fin calibrarGiroscopioInterno

    public void transmitirEstadoRed() {
        System.out.println("\n--- TELEMETRIA DEL DRON ---");
        System.out.println("Codigo de serie: " + codigoSerie);
        System.out.println("Nivel de energia: " + nivelEnergia + "%");

        if (conectadoRed) {
            System.out.println("Estado de red: En linea");
            System.out.println("Listo para recibir ordenes.");
        } else {
            System.out.println("Estado de red: Desconectado");
            System.out.println("No puede recibir ordenes.");
        }
    }//Fin transmitirEstadoRed
}//Fin class DronBase

