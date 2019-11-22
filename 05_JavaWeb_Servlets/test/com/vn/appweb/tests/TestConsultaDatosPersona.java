/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.tests;

import com.vn.appweb.servlets.ConsultaSQL;
import com.vn.appweb.servlets.DatosPersona;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class TestConsultaDatosPersona {
    
    public TestConsultaDatosPersona() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testSelectSQL() {
         ConsultaSQL sql = new ConsultaSQL();
         List<DatosPersona> res = sql.leerTabla("o");
         
         for(DatosPersona dp : res){
             System.out.println(dp.getNombre());
         }
//         assertEquals("Rodriguez", sql.leerTabla("Rodriguez").get(0).getNombre());
//         assertEquals(0,sql.leerTabla("este nombre no existe eh").size());
     }
}
