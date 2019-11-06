/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava;

/**
 *
 * @author PC
 */
public class Bucles {

    public static void mostrarBucles(String ex[]) {
        for (int x = 0; ex.length > x; x++) {
            System.out.println(ex[x]);
        }

        System.out.println("--------------------");

        int ia = 0;
        while (ex.length > ia) {
            System.out.println(ex[((int) ex.length) - (ia + 1)]); //Array Al Revés
            ia++;
        }
    }

    public static int[] burbujaOrdenar(int array[]) {
        
        int menor, pos, tmp;
        try{
        for (int i = 0; array.length > i; i++) {
            menor = array[i];
            pos = i;
            for (int j = i + 1; array.length > j; j++) {//comprobar si hay otro menor en lo que queda de array inicio i+1
                if (array[j] < menor) {
                    menor = array[j];//menor
                    pos = j;//pos menor
                }
            }
            if (pos != i) {//si posicion se modifica(se entra en el if)
                tmp = array[i];//temporal es pos actual
                array[i] = array[pos];//pos actual es menor
                array[pos] = tmp;//menor es temporal (pos actual)
            }
        }
        }catch(NullPointerException ex){
            return null;
        }
        return array;
        
    }

    public static int[] insercionOrdenar(int[] a) {
        int aux = 0, index = 0;
        boolean flag;
       
        try{
            do {
            flag = true;
            for (int i = 1; a.length > i; i++) {
                if (a[i - 1] > a[i]) {
                    aux = a[i - 1];//aux es pos actual
                    a[i - 1] = a[i];//pos actual es pos +1
                    a[i] = aux;//pos +1 es aux
                    flag = false;
                }
            }
        } while (!flag);
        }catch(NullPointerException ex){
            return null;
        }
        return a;
    }

    public static boolean comprobarOrden(int a[]) {
        boolean flag = true;
        for (int i = 1; a.length > i; i++) {
            if (a[i - 1] > a[i]) {
                flag = false;
            }
        }
        return flag;
    }
}
