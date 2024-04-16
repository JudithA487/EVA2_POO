/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_polimorfismo_2;

/**
 *
 * @author acost
 */
public class EVA2_13_POLIMORFISMO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Persona perso1 = new Persona("Judith", "Acosta");
        Persona perso2 = new Persona("Ximena", "Cabrera");
        Persona perso3 = new Persona("Dafne", "Tinajero");
        
        Estudiante estu1 = new Estudiante("23550398", "Judith", "Acosta");
        Estudiante estu2 = new Estudiante("23550873", "Ximena", "Cabrera");
        Estudiante estu3 = new Estudiante("23550254", "Dafne", "Tinajero");
        
        imprimirDatos(perso1);
        imprimirDatos(perso2);
        imprimirDatos(perso3);
        imprimirDatos(estu1);
        imprimirDatos(estu2);
        imprimirDatos(estu3);*/
        
        //poblacion de estudiantes del Tec 2
        Estudiante estudiantes [] = new Estudiante[3000];
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante("000", "ESTUDIANTE", "SIN DATOS");
        }
        for (int i = 0; i < estudiantes.length; i++) {
            imprimirDatos(estudiantes[i]);
        }
            
        }
    }
    
    public static void imprimirDatos(MostrarDatos datos){
        datos.imprimirDatos();
        //CASTING
        Estudiante estu;
        Persona perso;
        if(datos instanceof Estudiante){ //DETERMINA LA CLASE DEL OBJETO 
            estu = (Estudiante)datos;
        }else{ 
            perso = (Persona)datos;
    }
}
