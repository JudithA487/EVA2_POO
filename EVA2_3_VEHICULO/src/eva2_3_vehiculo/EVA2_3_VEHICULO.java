/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_vehiculo;

/**
 *
 * @author
 */
public class EVA2_3_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo vehi = new Vehiculo();
        vehi.imprimirDatos();
        
        Vehiculo vehi2 = new Vehiculo("Ford", "Mustang", 1969, "Rojo");
        vehi2.imprimirDatos();
        vehi2.setMarca("Chevrolet");
        vehi2.setModelo("Beat");
        vehi2.setYear(2023);
        vehi2.setColor("Azul");
        vehi2.imprimirDatos();
        
    }
    
}
