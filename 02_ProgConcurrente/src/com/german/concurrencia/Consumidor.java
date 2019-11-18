package com.german.concurrencia;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread {

    private Contenedor contenedor;

    public Consumidor(Contenedor c) {
        contenedor = c;
    }

    @Override
    public void run() {
        for (int i = 65; i < 75; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            int value = 0;
            value = contenedor.get();
            System.out.println("Consumidor -> GET: " + (char)value);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("bucle consumidor finalizado;");
    }
}
