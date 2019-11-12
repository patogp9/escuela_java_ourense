/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.sistemasdesplaz;

/**
 *
 * @author PC
 */
public interface IGenericDao<T> {
    
    
    void create(T object) throws Exception;
    T returnByIndex(int index);
    void modify(T object, int index);
    
    
}
