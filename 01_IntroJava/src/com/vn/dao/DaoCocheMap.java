/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.dao;

import com.vn.vehiculos.Coche;
import com.vn.vehiculos.FabricaCoches;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author PC
 */
public class DaoCocheMap {

    private Map<String, Coche> mapaCoches;

    public DaoCocheMap() {
        mapaCoches = new HashMap<>();
    }

    public void crear(String marca) {
        mapaCoches.put(marca, FabricaCoches.crear(marca));
    }

    public Coche obtenerPorIndice(int index) {
        int contador = 0;
        for (Map.Entry<String, Coche> entry : mapaCoches.entrySet()) {
            if (contador == index) {
                return entry.getValue();
            }
            contador++;
        }

        return null;

    }

    public Coche obtenerPorMarca(String marca) {
        for (Map.Entry<String, Coche> entry : mapaCoches.entrySet()) {
            if (entry.getValue().getMarca().equals(marca)) {
                return entry.getValue();
            }
        }

        return null;
    }

}
