/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.sistemasdesplaz;

import com.vn.vehiculos.Coche;
import java.util.HashMap;

/**
 *
 * @author PC
 */
public class Mapas {

    public static void main(String args[]) {
        HashMap<String, Object> mapas = new HashMap<String, Object>();
        mapas.put("vo", new Coche("Volvo"));
        mapas.put("op", new Coche("Opel"));
        mapas.put("to", new Coche("Toyota"));
        mapas.put("se", new Coche("Seat"));
        System.out.println("");
    }
}
