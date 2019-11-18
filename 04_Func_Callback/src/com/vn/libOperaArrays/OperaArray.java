/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.libOperaArrays;

/**
 *
 * @author PC
 */
public class OperaArray {
@FunctionalInterface
public interface FunCallBackOpArr{
    Object operar(Object x, Object y);
}
    public static Object[] operarArrays(Object[] x, Object[] y, FunCallBackOpArr opCllBck) {
        Object res[] = null;
        if (x.length == y.length) 
            res = new Object[x.length];
        for(int i = 0; x.length>i;i++){
            res[i]= opCllBck.operar(x[i], y[i]);
        }
        return res;
    }

}
