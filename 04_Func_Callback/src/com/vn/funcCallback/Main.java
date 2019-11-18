/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.funcCallback;

import com.vn.libOperaArrays.OperaArray;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void mostraRray(Object[] x) {
        for (int i = 0; x.length > i; i++) 
            System.out.println("->"+x[i]);
        
        System.out.println("__________________");
    }

    public static void main(String[] args) {
        Object[] arrx = {new Double(1),new Double(2),new Double(3),new Double(4),new Double(5)};
        Object[] arry = {new Double(1),new Double(2),new Double(3),new Double(4),new Double(5)};
        Object[] arrSXY = OperaArray.operarArrays(arrx, arry, Main::suma);
        Object[] arrRXY = OperaArray.operarArrays(arrx, arry, Main::resta);
        Object[] arrMXY = OperaArray.operarArrays(arrx, arry, Main::multi);
        Object[] arrDXY = OperaArray.operarArrays(arrx, arry, Main::divi);
        Object[] arrPTO = OperaArray.operarArrays(arrx, arry, Main::punto);
        mostraRray(arrSXY);
        mostraRray(arrRXY);
        mostraRray(arrMXY);
        mostraRray(arrDXY);
        mostraRray(arrPTO);
        
    }

    public static Object suma(Object x, Object y) {
        return (Double)x + (Double)y;
    }

    public static Object resta(Object x, Object y) {
        return (Double)x - (Double)y;
    }

    public static Object multi(Object x, Object y) {
        return (Double)x * (Double)y;
    }

    public static Object divi(Object x, Object y) {
        return (Double)x / (Double)y;
    }
    
    public static Object punto(Object x, Object y) {
        return "("+x+", "+y+")";
    }
}
