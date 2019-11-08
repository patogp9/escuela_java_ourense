/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.alvaro.testspoo;

import com.vn.alvaro.testspoo.PobarClaseInterfazGenericaAnidada.ClasePequePos;
import com.vn.vehiculos.Coche;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ProbarGenericos {

    public ProbarGenericos() {
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
    public void probarGenericos() {
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        int tres = 3, cinco = 5;
        insertarDuplicado(listInt, tres);
        insertarDuplicado(listInt, cinco);
        System.out.println("Tres ssigue siendo " + tres);
        for (Integer integer : listInt) {
            System.out.println(" - " + integer);
        }

        ArrayList<String> listString = new ArrayList<String>();
        String str1 = "Trixie", str2 = "Katya";
        insertarDuplicado(listString, str1);
        insertarDuplicado(listString, str2);
        System.out.println("Trixie sigue siendo " + str1);
        for (String chain : listString) {
            System.out.println(" - " + chain);
        }
        ArrayList<Coche> listCoche = new ArrayList<Coche>();
        Coche car1 = new Coche("Volkswagen Passat"), car2 = new Coche("Troncomovil");
        insertarDuplicado(listCoche, car1);
        insertarDuplicado(listCoche, car2);
        System.out.println("Passat sigue siendo " + car1);
        System.out.println("ULTIMO COCHE: "+ ArrayMuestraLast(listCoche));
    }

    //Entre < y > ponemos el nombre del tipo generico
    //Esto convierte el metodo en un metodo generico
    static <Tipo> void insertarDuplicado(ArrayList<Tipo> eros, Tipo arrow) {
        eros.add(arrow);
        eros.add(arrow);
        System.out.println(arrow + " Insertado 2 veces");

    }
     static <T> T ArrayMuestraLast(ArrayList<T> eros) {
        for (T chainx : eros) {
            System.out.println(" - " + chainx);
        }
        return eros.get(eros.size()-1);
    }
     @Test
    public void probarClaseAnidada() {
       ClasePequePos<String> classs = new ClasePequePos<String>("x", "y");
        System.out.println("&&&&&&&&&&&&&&&&&&&\nPunto: "+classs.toString());
    }
}
/*metodos no genericos
    static void insertarIntegerDuplicado(ArrayList<Integer> listaInt, int i) {
        listaInt.add(i);
        listaInt.add(i);
        System.out.println(i + " añadido 2 veces");
        i = i + 10;
    }
    static void insertarStringDuplicado(ArrayList<String> listaString, String str) {
        listaString.add(str);
        listaString.add(str);
        System.out.println(str + " añadida 2 veces");
        str="Rupaul";
    }
}*/
