/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.sistemasdesplaz;

import com.vn.sistemasdesplaz.interfaces.Desplazable;
import com.vn.sistemasdesplaz.interfaces.Electrico;

/**
 *
 * @author PC
 */
public class MonopatinElectrico extends Monopatin implements Electrico{
 private double bateria;
    @Override
    public void cargarBateria(double v) {
        this.setBateria(this.getBateria() + v);
        System.out.println("Cargados "+"voltios\n Bateria actual: "+this.getBateria()+" voltios");
    }

    public MonopatinElectrico(double bateria) {
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
    
    
}
