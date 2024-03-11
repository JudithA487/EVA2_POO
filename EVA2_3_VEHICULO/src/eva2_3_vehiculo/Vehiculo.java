/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_vehiculo;

/**
 *
 * @author
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int year;
    private String color;

    public Vehiculo() {
        this.marca = "Chevrolet";
        this.modelo = "Aveo";
        this.year = 2016;
        this.color = "Plateado";
    }

    public Vehiculo(String marca, String modelo, int year, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void imprimirDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
    
    
}



