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
public class Coche extends Vehiculo{

    private String marca;

    private int numRuedas;
    protected boolean arrancado;

    public Coche() {
        numRuedas = 4;
        marca = "sinMarca";
        tipo=TipoVehiculo.TURISMO;
    }
    public Coche(String marca){
        this.marca=marca;
        this.arrancado=false;
        this.numRuedas=4;
        tipo=TipoVehiculo.TURISMO;
    }

    public boolean arrancar() {
        arrancado = true;
        return arrancado;
    }

    public boolean arrancar(int posLlave) {//la 4 pos arranca
        posLlave=posLlave<0?0:posLlave;
        posLlave=posLlave>4?4:posLlave;
        arrancado = posLlave == 4;
        return arrancado;
    }

    public boolean arrancar(String orden) {
        arrancado = "ARRANCAR".equalsIgnoreCase(orden);
        return arrancado;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        if (marca == null || "".equals(marca)) {
            throw new IllegalArgumentException("Debes asignar una marca");
        } else {
            this.marca = marca;
        }
    }

    /**
     * @return the numRuedas
     */
    public int getNumRuedas() {
        return numRuedas;
    }

    public boolean getArrancado() {
        return arrancado;
    }
    @Override
    public void avanzar(){
        System.out.println("Vroom vroom");
    }
     @Override
    public String toString() {
        return ("Coche: " + marca + " " + (arrancado ? "arrancado" : "apagado")+" Tipo: "+tipo);
    }

    @Override
    public void mover(float metros) {
       avanzar();
    }

    /**
     * @param numRuedas the numRuedas to set
     */
}
