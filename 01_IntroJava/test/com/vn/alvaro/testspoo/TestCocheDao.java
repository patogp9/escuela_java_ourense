/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.alvaro.testspoo;

import com.vn.dao.DaoCocheList;
import com.vn.dao.DaoCocheMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class TestCocheDao {

    public TestCocheDao() {
    }

    @Test
    public void testDaoCocheList() {
        DaoCocheList daoL = new DaoCocheList();

        daoL.crear("Mazzerati");
        daoL.crear("Rayo Mqueen");
        daoL.crear("ROdriguez");

        //System.out.println(daoL.obtenerPorIndice(0).toString());
        assertEquals(daoL.obtenerPorIndice(0), daoL.obtenerPorMarca("Mazzerati"));
        assertEquals(daoL.obtenerPorIndice(1), daoL.obtenerPorMarca("Rayo Mqueen"));
        assertEquals(daoL.obtenerPorIndice(2), daoL.obtenerPorMarca("ROdriguez"));

        DaoCocheMap daoMap = new DaoCocheMap();

        daoMap.crear("Poltergust 4000");
        daoMap.crear("Royale");
        daoMap.crear("Dragonfly");
        daoMap.crear("Hurricane");
        daoMap.crear("Gold Mantis");

//        System.out.println(daoMap.obtenerPorMarca("Hurricane").toString());
//        System.out.println(daoMap.obtenerPorIndice(1).toString());
        assertEquals("Royale", daoMap.obtenerPorMarca("Royale").getMarca());
        assertEquals("Royale", daoMap.obtenerPorIndice(1).getMarca()); //no funa rude :(
    }
}
