/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.patrones;

import com.vn.vehiculos.Tractor;

/**
 *
 * @author PC
 */
public class TractorSingleton extends Tractor {

    private static TractorSingleton instance;
    private double serie;

    private TractorSingleton() {
        super();
    }

    public static TractorSingleton getInstance() throws Exception {
        if (TractorSingleton.instance == null) {
            TractorSingleton.instance = new TractorSingleton();
            TractorSingleton.instance.setSerie(Math.random());
        }
        return TractorSingleton.instance;

    }

    /**
     * @return the serie
     */
    public double getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(double serie) {
        this.serie = serie;
    }

}
