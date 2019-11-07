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
public class CocheRally extends Coche {

    private float rozamiento;

    /**
     * @return the rozamiento
     */
//    public CocheRally()
    public float getRozamiento() {
        return rozamiento;
    }

    /**
     * @param rozamiento the rozamiento to set
     */
    public void setRozamiento(float rozamiento) {
        this.rozamiento = rozamiento;
    }

    @Override
    public boolean arrancar(String orden) {
        if (super.arrancar(orden)) {
            arrancado=super.arrancar(orden);
        } else {
            if ("ENCENDER".equalsIgnoreCase(orden)) {
                arrancado = true;

            } else {
                arrancado = false;
            }

        }
        return arrancado;
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Coche Rally: " + super.getMarca() + " Rozamiento: " + rozamiento + " " + (arrancado ? "arrancado" : "apagado"));
    }

    public void mostrarEstadoAntiguo() {
        super.mostrarEstado();
        System.out.println("Rozamiento: " + rozamiento);
    }
}
