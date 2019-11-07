/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.java.testordenamiento;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg01_funcionesbasicas.Bucles;

/**
 *
 * @author PC
 */
public class TestOrdenamiento {

    public TestOrdenamiento() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    private void probarOrdenamientoSH(int[] array, int[] arrayOK) {
        boolean flag = false;
        if(flag) assertArrayEquals(Bucles.insercionOrdenar(array), arrayOK);
        else assertArrayEquals(Bucles.burbujaOrdenar(array), arrayOK);
    }

    @Test
    public void probarOrdenamientoOrden() {
        int[] array = {1, 2, 3, 4, 5};
        int[] passArray = {1, 2, 3, 4, 5};
        probarOrdenamientoSH(array, passArray);
    }

    @Test
    public void probarOrdenamientoInverso() {
        int[] array = {5, 4, 3, 2, 1};
        int[] passArray = {1, 2, 3, 4, 5};
        probarOrdenamientoSH(array, passArray);
    }

    @Test
    public void probarOrdenamientoDobleValor() {
        int[] array = {0, 0, 0, 0};
        int[] passArray = {0, 0, 0, 0};
        probarOrdenamientoSH(array, passArray);
    }

    @Test
    public void probarOrdenamientoVacio() {
        int[] array = {};
        int[] passArray = {};
        probarOrdenamientoSH(array, passArray);
    }

    @Test
    public void probarOrdenamientoLimite() {
        int[] array = {0, Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] passArray = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
        probarOrdenamientoSH(array, passArray);
    }

    @Test
    public void probarOrdenamientoNull() {
        int[] array = null;
        int[] passArray = null;
        probarOrdenamientoSH(array, passArray);
    }
}
