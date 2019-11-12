/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.dao;

import com.vn.sistemasdesplaz.IGenericDao;
import com.vn.vehiculos.Coche;

/**
 *
 * @author PC
 */
public interface IDaoUser extends IGenericDao<User>{
    
    public abstract void create (String nombre, int edad);
    public abstract User returnByIndex(int index);
    public abstract User returnByName(String nombre);
    
}
