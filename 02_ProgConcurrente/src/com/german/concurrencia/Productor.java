/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.german.concurrencia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Productor extends Thread {

    private Contenedor contenedor;

    public Productor(Contenedor c) {
        contenedor = c;
    }

    @Override
    public void run() {
        for (int i = 65; i < 75; i++) {
            int valor = i;
            contenedor.put(valor);
            System.out.println("Productor  -> PUT: " + (char)valor);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("bucle productor finalizado;");
    }
}
