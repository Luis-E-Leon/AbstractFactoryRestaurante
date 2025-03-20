/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package UD.RestauranteEjercicio;

/**
 *
 * @author Luis Siatama
 */
public class Restaurante {

    public static void main(String[] args) {
        System.out.println("Menú Vegetariano: ");
        Comensal Juan = new Comensal(new CocinaVegetariana());
        Juan.ordenar();
        
        System.out.println("Menú Gourmet: ");
        Comensal Luis = new Comensal(new CocinaGourmet());
        Luis.ordenar();
        
        System.out.println("Menú Saludable: ");
        Comensal Carlos = new Comensal(new CocinaSaludable());
        Carlos.ordenar();
    }
}
