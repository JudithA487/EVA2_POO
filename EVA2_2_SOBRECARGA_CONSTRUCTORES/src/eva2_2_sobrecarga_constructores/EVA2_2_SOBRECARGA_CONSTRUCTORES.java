/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_sobrecarga_constructores;

/**
 *
 * @author 
 */
public class EVA2_2_SOBRECARGA_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        perso1.imprimirDatos();
        
        Persona perso2 = new Persona("Pedro", "Paramo", 70);
        perso2.imprimirDatos();
        //al usar los set, se borran los datos previos y son reemplazados
        //con los asignados por los métodos set
        perso2.setNombre("Juan");
        perso2.setApellidos("Ramirez");
        perso2.setEdad(55);
        perso2.imprimirDatos();
    }
    
}
