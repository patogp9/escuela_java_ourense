/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.alvaro.testspoo;

import com.vn.introjava.patrones.CocheEspecialUnico;
import static com.vn.introjava.patrones.CocheEspecialUnico.getInstancia;
import com.vn.introjava.patrones.TractorSingleton;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ProbandoUnicaInstancia {
    
    public ProbandoUnicaInstancia() {
    }

    
     @Test
     public void IntentarUnicaInstancia() throws Exception {
     CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
     //CocheEspecialUnico.miCocheSp=miUnicoCoche;
     //miUnicoCoche.setMarca("UNICO COCHE 1");
     miUnicoCoche.mostrarEstado();
     }
     @Test
     public void IntentarUnicaInstanciabis() throws Exception {
     CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
     //CocheEspecialUnico.miCocheSp=miUnicoCoche;
     //miUnicoCoche.setMarca("UNICO COCHE 2");
     miUnicoCoche.mostrarEstado();
     }
     @Test
     public void IntentarUnicaInstanciatris() throws Exception {
     CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
     //miUnicoCoche.setMarca("UNICO COCHE 3");
     miUnicoCoche.mostrarEstado();
     }
     @Test
     public void IntentarUnicaInstanciatractor1() throws Exception {
     TractorSingleton trAma1 = TractorSingleton.getInstance();
     System.out.println(trAma1.getSerie());
     trAma1.mostrarEstado();
     }
      @Test
     public void IntentarUnicaInstanciatractor2() throws Exception {
     TractorSingleton trAma2 = TractorSingleton.getInstance();
     System.out.println(trAma2.getSerie());
     trAma2.mostrarEstado();
     } @Test
     public void IntentarUnicaInstanciatractor3() throws Exception {
     TractorSingleton trAma3 = TractorSingleton.getInstance();
     System.out.println(trAma3.getSerie());
     trAma3.mostrarEstado();
     }
     
     
}
