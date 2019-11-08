/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.alvaro.testspoo;

import com.vn.vehiculos.Coche;
import com.vn.vehiculos.CocheRally;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ProbarColecciones {

    public ProbarColecciones() {
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
    @Test
    public void testArrayListNoGenericos_MAL() {
        ArrayList lista = new ArrayList();
        lista.add(new Object());
        lista.add(new Coche("Coche"));
        lista.add("IUDDITPLD");
        lista.add(420);
        
        
        for(int i=0;lista.size()>i;i++){
           // System.out.println("Elem: "+i+" ; "+lista.get(i).toString());
        }
    }
    @Test
    public void testArrayListGenerico(){
        ArrayList<CocheRally> mk8 = new ArrayList<CocheRally>();
        mk8.add(new CocheRally("coche de Yoshi"));
        mk8.add(new CocheRally("Rayo GTI"));
        mk8.add(new CocheRally("R.O.B.N.I"));
        mk8.add(new CocheRally("Kart Estándart"));
        
        mk8.get(2).arrancar("ENCENDER");
        mk8.get(2).mostrarEstado();
        
        for(CocheRally bolido : mk8){
            bolido.avanzar();
        }
        
    }
    
}
