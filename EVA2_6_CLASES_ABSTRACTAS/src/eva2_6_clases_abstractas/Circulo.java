/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_clases_abstractas;

/**
 *
 * @author acost
 */
public class Circulo extends Figura {
    public double radio;

    public Circulo() {
        this.radio = 2;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * 2;
    }

    @Override
    public double calcularPeri() {
        return Math.PI * radio * 2 * Math.PI / 2;
    }
    
    
    
    
    
    
    
}
