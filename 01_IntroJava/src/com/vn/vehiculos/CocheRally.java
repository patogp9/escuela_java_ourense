/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.vehiculos;

/**
 *
 * @author PC
 */
public class CocheRally extends Coche {

    private float rozamiento;

    /**
     * @return the rozamiento
     */
    public CocheRally(String marca, float rozamiento) {
        super(marca);
        this.rozamiento = rozamiento;
        tipo = TipoVehiculo.RALLY;
    }

    public CocheRally(String marca) {
        super(marca);
        this.rozamiento = 5f;
        tipo = TipoVehiculo.RALLY;
    }

    public CocheRally() {
        super();
        this.rozamiento = 5f;
        tipo = TipoVehiculo.RALLY;
    }

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
            arrancado = super.arrancar(orden);
        } else {
            if ("ENCENDER".equalsIgnoreCase(orden)) {
                arrancado = true;

            } else {
                arrancado = false;
            }

        }
        return arrancado;
    }
//DEPRECATED
    public void mostrarEstadoAntiguo() {
        super.mostrarEstado();
        System.out.println("Rozamiento: " + rozamiento + "Tipo: " + tipo);
    }

    public String toString() {
        return("Coche Rally: " + super.getMarca() + " Rozamiento: " + rozamiento + " " + (arrancado ? "arrancado" : "apagado") + "Tipo: " + tipo);
    }
}
