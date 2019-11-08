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
public class FabricaCoches {

    public static Coche crear(String marca) {
        Coche c = new Coche();
        c.setMarca(marca);
        return c;
    }

    public static CocheRally crearRally(String marca, float rozamiento) {
        CocheRally c = new CocheRally();
        c.setMarca(marca);
        c.setRozamiento(rozamiento);
        return c;
    }

    public static void main(String[] args) {
        Coche c = crear("Seat Panda");
        c.arrancar();
        c.mostrarEstado();
        CocheRally cr = crearRally("Ibiza", 6f);
        cr.arrancar("apagao");
        cr.mostrarEstado();
        cr.mostrarEstadoAntiguo();

    }

}
