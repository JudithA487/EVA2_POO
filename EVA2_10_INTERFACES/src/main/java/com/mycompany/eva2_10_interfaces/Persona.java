
package com.mycompany.eva2_10_interfaces;

/**
 *
 * @author oviel
 */
public class Persona {
    private  String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
        this.nombre = "Sin nombre";
        this.apellidos = "Sin apellidos";
        this.edad = 0;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   /* @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }

    @Override
    public String generarNombreCompleto() {
       return nombre + " " + apellidos;
    }
    
*/
    
}
