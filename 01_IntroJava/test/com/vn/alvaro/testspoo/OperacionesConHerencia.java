/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.alvaro.testspoo;

import com.vn.alvaro.poo.Coche;
import com.vn.alvaro.poo.CocheRally;
import com.vn.alvaro.poo.TipoVehiculo;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class OperacionesConHerencia {

    static CocheRally cr;
    static Coche turismo;

    public OperacionesConHerencia() {
    }

    @BeforeClass
    public static void setUpClass() {
        cr = new CocheRally();
        cr.setMarca("Supra");
        cr.setRozamiento(7f);
        
    }

    @Before
    public void setUp() {

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testSobreescrituraMetodos() {
        assertTrue(cr.getRozamiento() == 7f);
        assertTrue(cr.arrancar("ARRANCAR"));
        assertTrue(cr.arrancar("encenDER"));
        assertFalse(cr.arrancar("prender"));
    }

    @Test
    public void testPolimorfismo() {
        turismo = new Coche("Turismo");
        CocheRally x = new CocheRally();
        x.setMarca("Rally2");
        x.setRozamiento(9f);
        turismo = x;
        turismo.mostrarEstado();
        turismo.mostrarEstado();
    }
    @Test
    public void testEnumerado(){
        cr.setTipo(TipoVehiculo.RALLY);
        System.out.println("Tipo: "+(long)cr.getTipo().ordinal());
    }
}
