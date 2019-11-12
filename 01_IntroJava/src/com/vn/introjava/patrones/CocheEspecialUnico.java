/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.patrones;

import com.vn.vehiculos.Coche;

/**
 *
 * @author PC
 */
public class CocheEspecialUnico extends Coche {

    private static CocheEspecialUnico miCocheSp;

    private CocheEspecialUnico() {
        super();
    }

    public static CocheEspecialUnico getInstancia() throws Exception {
        if (CocheEspecialUnico.miCocheSp == null) {
            CocheEspecialUnico.miCocheSp = new CocheEspecialUnico();
            CocheEspecialUnico.miCocheSp.setMarca("UNICO COCHE");

        }
        return CocheEspecialUnico.miCocheSp;

    }

}
