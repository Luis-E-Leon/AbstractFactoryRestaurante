/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD.RestauranteEjercicio;

/**
 *
 * @author USUARIO
 */
public class CocinaSaludable extends CocinaAbstracta{

    @Override
    public Entrada cocinarEntrada() {
        return new EntradaSaludable();
    }

    @Override
    public PlatoPrincipal cocinarPlatoPrincipal() {
        return new PlatoPrincipalSaludable();
    }

    @Override
    public Bebida servirBebida() {
        return new BebidaSaludable();
    }

    @Override
    public Postre hacerPostre() {
        return new PostreSaludable();
    }
    
}
