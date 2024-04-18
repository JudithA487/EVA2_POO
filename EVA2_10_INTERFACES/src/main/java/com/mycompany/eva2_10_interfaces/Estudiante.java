
package com.mycompany.eva2_10_interfaces;

/**
 *
 * @author oviel
 */
public class Estudiante extends Persona implements Datos, GenerarFecha{
    private String noControl;

    public Estudiante() {
        super();
         this.noControl = "Sin num de control";
        
    }

    public Estudiante(String noControl) {
        this.noControl = noControl;
    }

    public Estudiante(String noControl, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Año de nacimiento: " + calcularAnnioNac());
    }

    @Override
    public String generarNombreCompleto() {
        return getNombre() + " " + getApellidos();
    }

    @Override
    public int calcularAnnioNac() {
       return 2024 - getEdad();
    }

    
    
}
