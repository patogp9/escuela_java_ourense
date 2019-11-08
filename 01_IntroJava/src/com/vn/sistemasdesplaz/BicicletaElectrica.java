/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.sistemasdesplaz;

import com.vn.sistemasdesplaz.interfaces.Electrico;
import com.vn.vehiculos.Vehiculo;

/**
 *
 * @author PC
 */
public class BicicletaElectrica extends Vehiculo implements Electrico{
private double bateria;
    @Override
    public void cargarBateria(double v) {
        this.setBateria(this.getBateria() + v);
        System.out.println("Cargados "+"voltios\n Bateria actual: "+this.getBateria()+" voltios");
    }

    public BicicletaElectrica(double bateria) {
        setBateria(bateria);
    }

    /**
     * @return the bateria
     */
    public double getBateria() {
        return bateria;
    }

    /**
     * @param bateria the bateria to set
     */
    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    @Override
    public void avanzar() {
        System.out.println("Ring ring bishh");
    }

    @Override
    public void mover(float metros) {
    avanzar();
    }
    
    
    
}
