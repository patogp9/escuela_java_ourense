/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.dao;

import com.vn.vehiculos.Coche;
import com.vn.vehiculos.FabricaCoches;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class DaoCocheList {
    private List<Coche> listaCoches;
    
    public DaoCocheList(){
        listaCoches = new ArrayList<>();
    }
    public void crear (String marca){
        listaCoches.add(FabricaCoches.crear(marca));
    }
    public Coche obtenerPorIndice(int index){
        return listaCoches.get(index);
    }
    public Coche obtenerPorMarca(String marca){
        for(Coche coche : listaCoches){
            if(coche.getMarca().equals(marca)){
                return coche;
            }
        }
        return null;
    }
    
}
