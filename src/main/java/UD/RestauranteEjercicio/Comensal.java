/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD.RestauranteEjercicio;

/**
 *
 * @author Luis Siatama
 */
public class Comensal {
    private CocinaAbstracta cocina;

    public Comensal(CocinaAbstracta cocina) {
        this.cocina = cocina;
    }
    
    public void ordenar(){
        Entrada entrada = cocina.cocinarEntrada();
        PlatoPrincipal platoPrincipal = cocina.cocinarPlatoPrincipal();
        Bebida bebida = cocina.servirBebida();
        Postre postre = cocina.hacerPostre();
        
        entrada.Cocinar();
        platoPrincipal.preparar();
        bebida.Servir();
        postre.realizar();
    }
}
