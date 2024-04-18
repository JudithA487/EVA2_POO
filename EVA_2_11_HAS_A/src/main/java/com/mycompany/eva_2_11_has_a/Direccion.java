
package com.mycompany.eva_2_11_has_a;

/**
 *
 * @author oviel
 */
public class Direccion {
    private String calle;
    private String numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;

    public Direccion() {
        this.calle = "Sin datos";
        this.numero = "Sin datos";
        this.colonia = "Sin datos";
        this.cp = "Sin datos";
        this.ciudad = "Sin datos";
        this.estado = "Sin datos";
    }

    public Direccion(String calle, String numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        String cade = "Calle: " + calle + "#" + numero + "\n" +
                "Colonia: " + colonia + "C.P. " + cp + "\n" +
                "Ciudad " + ciudad + "Estado: " + estado;
        return cade;
    }
    
    
}
