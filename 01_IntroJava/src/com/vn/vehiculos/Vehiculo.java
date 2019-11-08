/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.vehiculos;

import com.vn.sistemasdesplaz.interfaces.Desplazable;



/**
 *
 * @author PC
 */
public abstract class Vehiculo implements Desplazable{

    protected TipoVehiculo tipo;

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }
    public void mostrarEstado() {
        System.out.println(this.toString());
    }
    public abstract void avanzar();
     @Override
    public String toString() {
        return ("Tipo: " + tipo);
    }
    
}
