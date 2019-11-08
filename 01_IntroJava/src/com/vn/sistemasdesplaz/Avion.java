/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.sistemasdesplaz;

import com.vn.sistemasdesplaz.interfaces.Desplazable;

/**
 *
 * @author PC
 */
public class Avion implements Desplazable {

    @Override
    public void mover(float metros) {
        if (metros < 0) {
            System.out.println("el avión no se desplaza");
        }else{
            if(metros<10){
                rodar(metros);
            }else{
                volar(metros);
            }
        }
    }

    public void rodar(float metros) {
        System.out.println("el avión rueda " + metros + " metros");
    }

    public void volar(float metros) {
        System.out.println("el avión vuela " + metros + " metros");
    }

}
