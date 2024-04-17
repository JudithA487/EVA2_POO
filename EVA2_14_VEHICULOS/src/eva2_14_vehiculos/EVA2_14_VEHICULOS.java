/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_vehiculos;

/**
 *
 * @author acost
 */
public class EVA2_14_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo flota[] = new Vehiculo[10];
        flota[0] = new Automovil(4,0);
        flota[1] = new Automovil(2,0);
        flota[2] = new Automovil(6,0);
        flota[3] = new Automovil(4,0);
        flota[4] = new Automovil(4,0);
        flota[5] = new Motocicleta(125,0);
        flota[6] = new Motocicleta(150,0);
        flota[7] = new Motocicleta(1000,0);
        flota[8] = new Motocicleta(200,0);
        flota[9] = new Motocicleta(1000,0);
        //-----------------------------------------------
        Automovil auto = (Automovil) flota[0];
        System.out.println("Numero de puertas: " + auto.getNoPuertas());
        Motocicleta moto = (Motocicleta) flota[5];
        System.out.println("Capacidad (CC): " + moto.getCapacidad());
        
        //si no sabemos que tipo de objeto está almacenado, usamos
        //instanceof
        if(flota[1] instanceof Automovil){
            auto = (Automovil) flota[0];
            System.out.println("Numero  de puertas: " + auto.getNoPuertas());        
        }
        //VAMOS A MODIFICAR LA VELOCIDAD DE LO VEHICULOS:
        acelerar(auto, 50);
        acelerar(auto, 50);
        System.out.println("Velocidad: " + auto.getVelocidad());
        acelerar(auto, 100);
        System.out.println("Velocidad: " + auto.getVelocidad());
        acelerar(auto, -30);
        System.out.println("Velocidad: " + auto.getVelocidad());
        acelerar(flota[2], 70);
        System.out.println("Velocidad: " + auto.getVelocidad());
    }
    
    public static void acelerar(Vehiculo vehiculo, int ajustes){
        
    }
    
}

