/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.dao;

import com.vn.sistemasdesplaz.IGenericDao;
import com.vn.vehiculos.Coche;
import com.vn.vehiculos.FabricaCoches;

/**
 *
 * @author PC
 */
public interface IDaoCoche extends IGenericDao<Coche>{
    
    public abstract void crear (String marca);

    public abstract Coche obtenerPorMarca(String marca);
    
    
}
