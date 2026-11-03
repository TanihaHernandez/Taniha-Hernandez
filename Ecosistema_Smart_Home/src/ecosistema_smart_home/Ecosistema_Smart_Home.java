/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecosistema_smart_home;

/**
 *Una startup tecnológica está desarrollando un nuevo controlador central para 
 *hogares inteligentes. 
 * El equipo de ingeniería de software necesita diseñar una arquitectura modular 
 * en Java que permita integrar diferentes tipos de hardware (focos, cerraduras,sensores) 
 * de múltiples marcas. 
 * 
 * El sistema debe ser escalable: 
 * agregar un nuevo tipo de dispositivo en el futuro no debe requerir reescribir
 * la lógica central del controlador.
 * 
 */
public class Ecosistema_Smart_Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Dispositivo miCasa[] = {
                                 new FocoInteligente("Philips"),
                                 new CerraduraInteligente("Yale")
                               };
        
  
        miCasa[0].encender();
        miCasa[0].MostrarMarca();
        ((Conexiones)miCasa[0]).conectarRed();
        
        System.out.println("---------------------");
        miCasa[1].encender();
        miCasa[1].MostrarMarca();
        ((Conexiones)miCasa[1]).conectarRed();
    }//FIN MAIN
 
}//FIN CLASS
