/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.german.concurrencia;

import com.german.concurrencia.Consumidor;
import com.german.concurrencia.Productor;

/**
 *
 * @author pc
 */
public class Test_ProducTorConsumidor {

    public static void main(String[] args) {
        Contenedor c = new Contenedor();
        Productor produce = new Productor(c);
        Consumidor consume = new Consumidor(c);
        produce.start();
        consume.start();
    }
}
