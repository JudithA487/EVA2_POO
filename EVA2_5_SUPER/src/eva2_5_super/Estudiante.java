/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_super;

/**
 *
 * @author acost
 */
//           Hija         de    Padre
//           Sublcase     de    Superclase
public class Estudiante extends Persona{
    private String noControl;
    private String carrera;
    
    public Estudiante(){
        super();//LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        noControl = "23550398";
        carrera = "Ingenieria en sistemas computacionales";
        
    }
    
    public Estudiante(String nombre, String apPaterno, String apMaterno, int edad, char genero, String noControl, String carrera){
        super(nombre, apPaterno, apMaterno, edad, genero);
        this.noControl = noControl;
        this.carrera = carrera;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de control: " + noControl);
        System.out.println("Carrera: " + carrera);
        
    }
}
