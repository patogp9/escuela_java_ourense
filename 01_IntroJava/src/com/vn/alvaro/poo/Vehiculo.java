/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.alvaro.poo;



/**
 *
 * @author PC
 */
public abstract class Vehiculo {

    protected TipoVehiculo tipo;

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }
    
    public abstract void avanzar();
    public abstract void mostrarEstado();
     @Override
    public String toString() {
        return ("Tipo: " + tipo);
    }
    
}
