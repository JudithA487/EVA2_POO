/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_herencia;

/**
 *
 * @author acost
 */
public class EVA2_4_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        System.out.println(perso.toString());
        //el metodo tostring viene por herencia, no fueimplementado por
        //nosotros.
        //TODAS LAS CLASES EN JAVA DESCIENDEN DE LA CLASE object
        Estudiante estu = new Estudiante();
        System.out.println("Nombre: " + estu.getNombre());
        System.out.println("Apellidos: " + estu.getApellido());
        System.out.println("Edad: " + estu.getEdad());
        
    }
    
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "SIN NOMBRE";
        this.apellido = "SIN APELLIDOS";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

}

class Estudiante extends Persona{
    private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    
}

