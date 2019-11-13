/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.dao;

/**
 *
 * @author PC
 */
public interface IGenericDao<T> {
    
    
    T create(T object) throws Exception;
    T returnByIndex(int index);
    T modify(T object, int index);
    void remove(int index);
    
    
}
