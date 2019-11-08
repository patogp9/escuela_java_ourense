/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.vehiculos;

/**
 *
 * @author PC
 */
public class Tractor extends Vehiculo {

    public Tractor() {
        super();
        tipo = TipoVehiculo.TRACTOR;
    }

    @Override
    public void avanzar() {
        System.out.println("NYOOOOOOOOOMMMMMM");
    }

    @Override
    public String toString() {
        return ("Tipo: " + tipo);
    }

    @Override
    public void mover(float metros) {
        avanzar();
    }

}
