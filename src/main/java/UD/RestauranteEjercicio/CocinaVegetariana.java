/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD.RestauranteEjercicio;

/**
 *
 * @author USUARIO
 */
public class CocinaVegetariana extends CocinaAbstracta{

    @Override
    public Entrada cocinarEntrada() {
        return new EntradaVegetariano();
    }

    @Override
    public PlatoPrincipal cocinarPlatoPrincipal() {
        return new PlatoPrincipalVegetariano();
    }

    @Override
    public Bebida servirBebida() {
        return new BebidaVegetariana();
    }

    @Override
    public Postre hacerPostre() {
        return new PostreVegetariano();
    }
    
}
