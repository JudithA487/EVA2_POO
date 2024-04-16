/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_final;

/**
 *
 * @author acost
 */
public final class Computo extends Electronica{
    private int ram;
    private String hd;
    private String procesador;

    public Computo() {
        super();
        this.ram = 00;
        this.hd = "---";
        this.procesador = "----";
    }


    public Computo(int ram, String hd, String procesador, String marca, boolean garantia, String nombre, double precio) {
        super(marca, garantia, nombre, precio);
        this.ram = ram;
        this.hd = hd;
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
    @Override
     public String toString(){
        String cade = super.toString();
        cade += "Ram: " + ram +
                "Disco duro: " + hd + 
                "Procesador: " + procesador;
        return cade ;
    }
    
    
    
    
    
}
