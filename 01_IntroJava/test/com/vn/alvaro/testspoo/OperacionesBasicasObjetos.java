/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.alvaro.testspoo;

import com.vn.vehiculos.Coche;
import com.vn.vehiculos.CocheRally;
import com.vn.vehiculos.FabricaCoches;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class OperacionesBasicasObjetos {

    public Coche miCoche;
    public Coche miCocheFindes;

    @Test
    public void creandoObjetos() {
        miCoche = new Coche();
        miCocheFindes = new Coche();

        assertNotNull(miCoche);
        assertNotNull(miCocheFindes);

        assertNotEquals(miCoche, miCocheFindes);

        miCoche.setMarca("Kia");
        miCocheFindes.setMarca("Opel");
        System.out.println(miCoche.getMarca() + " " + miCocheFindes.getMarca());

        assertNotEquals(miCoche, miCocheFindes);

        miCocheFindes = miCoche;

        System.out.println("changed: " + miCocheFindes.getMarca());
        assertEquals(miCoche, miCocheFindes);

    }

    @Test
    public void probandoObjetos() {
        miCoche = new Coche("Seat Panda");
        assertEquals(miCoche.getNumRuedas(), 4);

        for (int i = 1; i <= 4; i++) {
            miCoche.arrancar(i);
            if (i == 4) {
                assertTrue(miCoche.getArrancado());
            } else {
                assertFalse(miCoche.getArrancado());
            }
        }
    }

    @Test
    public void gestionExceptionMAL() {
        boolean flag = false;
        try {
            Coche c = FabricaCoches.crear("");
            System.out.println("wop");
        } catch (IllegalArgumentException ex) {
            flag = true;
        }
        assertTrue(flag);
    }

}
