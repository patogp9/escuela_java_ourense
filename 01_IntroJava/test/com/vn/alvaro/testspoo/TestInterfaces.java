/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.alvaro.testspoo;

import com.vn.sistemasdesplaz.Avion;
import com.vn.sistemasdesplaz.BicicletaElectrica;
import com.vn.sistemasdesplaz.CocheElectrico;
import com.vn.sistemasdesplaz.Monopatin;
import com.vn.sistemasdesplaz.MonopatinElectrico;
import com.vn.sistemasdesplaz.interfaces.Desplazable;
import com.vn.vehiculos.CocheRally;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class TestInterfaces {

    public TestInterfaces() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void creandoDesplazables() {
        Desplazable hoeing = new Avion();
        hoeing.mover(400f);
        hoeing.mover(7f);
        hoeing.mover(-7f);
        Desplazable tony = new Monopatin();
        tony.mover(-1f);
        tony.mover(200f);
        
        CocheRally r = new CocheRally("Hacendado", 1.2f);
        r.avanzar();
        r.mover(4f);
        Desplazable rx= new CocheRally("Mercadona", 3.2f);
        rx.mover(4f);
        assertTrue(rx instanceof CocheRally);
        
        CocheElectrico avispa = new CocheElectrico(0);
        avispa.cargarBateria(300.50);
        avispa.cargarBateria(20);
        MonopatinElectrico electroni = new MonopatinElectrico(0);
        electroni.cargarBateria(-300.50);
        electroni.cargarBateria(420);
        BicicletaElectrica rude = new BicicletaElectrica(0);
        rude.cargarBateria(-30);
        rude.cargarBateria(180);
        rude.avanzar();
    }
}
