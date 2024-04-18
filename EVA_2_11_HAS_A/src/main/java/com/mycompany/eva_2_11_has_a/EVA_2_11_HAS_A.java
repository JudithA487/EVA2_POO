

package com.mycompany.eva_2_11_has_a;

/**
 *
 * @author oviel
 */
public class EVA_2_11_HAS_A {

    public static void main(String[] args) {
        Direccion direc = new Direccion("46a", "525", "Zarco", "31020", "Chihuahua", "Chihuahua");
        Persona perso = new Persona("Oviel", "Velazquez", 22, direc);
        System.out.println(perso);
    }
}
