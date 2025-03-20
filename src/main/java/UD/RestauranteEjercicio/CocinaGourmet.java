/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD.RestauranteEjercicio;

/**
 *
 * @author USUARIO
 */
public class CocinaGourmet extends CocinaAbstracta{

    @Override
    public Entrada cocinarEntrada() {
        return new EntradaGourmet();
    }

    @Override
    public PlatoPrincipal cocinarPlatoPrincipal() {
        return new PlatoPrincipalGourmet();
    }

    @Override
    public Bebida servirBebida() {
        return new BebidaGourmet();
    }

    @Override
    public Postre hacerPostre() {
        return new PostreGourmet();
    }
    
}
