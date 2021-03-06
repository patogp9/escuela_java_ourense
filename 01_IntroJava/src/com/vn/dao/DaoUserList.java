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

import com.vn.vehiculos.Coche;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoUserList implements IDaoUser {

    private List<User> userList;

    public DaoUserList() {
        userList = new ArrayList<>();
    }

    @Override
    public User returnByIndex(int index) {
        return userList.get(index);
    }

    @Override
    public User returnByName(String nombre) {
        for (User usuario : userList) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }

    public void create(String nombre, int edad) {
        try {
            create(new User(nombre, edad));
        } catch (Exception ex) {
            Logger.getLogger(DaoUserList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public User create(User object) throws Exception {
        userList.add((User) object);
        return object;
    }

    @Override
    public User modify(User object, int index) {
        userList.set(index, object);
        return object;
    }

    public void modificar(String nombre, int edad, int index) {

        modify(new User(nombre, edad), index);

    }

    @Override
    public void remove(int index) {
        userList.remove(index);
    }

}