/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.alvaro.testspoo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class PobarClaseInterfazGenericaAnidada {

    public PobarClaseInterfazGenericaAnidada() {
   }     

    public static class ClasePequePos <T>{

        T x, y;

        public ClasePequePos(T x, T y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(x = " + x + ", y = " + y + ")";
        }
    }

}
