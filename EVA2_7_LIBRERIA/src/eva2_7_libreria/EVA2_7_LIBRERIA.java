/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_libreria;

/**
 *
 * @author acost
 */
public class EVA2_7_LIBRERIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libros libros = new Libros("Juan Rulfo", "El llano en llamas", 500, 10);
        libros.imprimirDatos();
        libros.venderCopias(5);
        libros.imprimirDatos();
        libros.ordenarCopias(100);
        libros.imprimirDatos();
        libros.venderCopias(200);
        libros.imprimirDatos();
    }
    
}
