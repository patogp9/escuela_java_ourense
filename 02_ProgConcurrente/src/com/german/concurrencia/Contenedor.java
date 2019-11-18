package com.german.concurrencia;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Contenedor {

    // Normalmente será un array, lista, bb.dd., 
    // mapa, fichero, DAO, servicio web, cualquier recurso compartido...
    int dato;
    boolean flag = false;

    public synchronized int get() {
//        System.out.println("get antes del bucle: flag=" + flag);
        while (!flag) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        flag = false;
//        System.out.println("get fuera del bucle: flag=" + flag);
        this.notifyAll();
        return dato;
    }

    public synchronized void put(int valor) {
        dato = valor;
//        System.out.println("put antes del bucle: flag=" + flag);
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.notifyAll();
//        System.out.println("put fuera del bucle: flag=" + flag);
        flag = true;
    }
}
