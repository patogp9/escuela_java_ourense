/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.sistemasdesplaz;

import com.vn.sistemasdesplaz.interfaces.Desplazable;
import com.vn.sistemasdesplaz.interfaces.Electrico;

/**
 *
 * @author PC
 */
public class Monopatin implements Desplazable {

    @Override
    public void mover(float metros) {
    if (metros < 0) {
            System.out.println("el monopatín no se desplaza");
        }else{
            rodar(metros);
        }
    }
    public void rodar(float metros) {
        System.out.println("el monopatín rueda " + metros + " metros");
    }


}
