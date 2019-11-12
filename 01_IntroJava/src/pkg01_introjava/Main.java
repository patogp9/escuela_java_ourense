package pkg01_introjava;

import com.sun.istack.internal.logging.Logger;
import com.vn.excepciones.UsoNormalExcepciones;
import pkg01_funcionesbasicas.Operadores;
import pkg01_funcionesbasicas.Bucles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {
        /* System.out.println("Tipos de datos:\n");
        byte b = -128;
        int i = 9;
        long l = 10000000000000L;
        float f = 3.14f;
        double d = Math.random() + 1;
        boolean flag = true;
        char ch = 'A';
        String s = "Lorem Ipsum";
        String ex[] = {"Ludicolo", "Amoongus", "Exeggutor", "Banette", "Espeon", "Claydol"};

        if (flag == true) {
            System.out.println("Byte: " + b + ";\nInt: " + i + ";\nLong: "
                    + l + ";\nFloat: " + f + ";\nDouble: " + d + ";\nBoolean: "
                    + flag + ";\nChar: " + ch + ";\nString: " + s + ";\n");
        }

        Bucles.mostrarBucles(ex);
        Operadores.probarOperadores();

        int[] rrays = new int[1000];
        for (int z = 0; rrays.length > z; z++) {
            rrays[z] = (int) Math.floor(Math.random() * (0 - 100) + 101);
        }
        rrays = Bucles.insercionOrdenar(rrays);
        for (int w = 0; rrays.length > w; w++) {
            System.out.println(rrays[w]);
        }
         */
//        System.out.println("EY");
//        UsoNormalExcepciones unObj = new UsoNormalExcepciones();
//        try {
//            unObj.metodoPeligroso();
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Excepcion: " + ex);
//            System.out.println("______________________\nPila de llamada: " + Arrays.toString(ex.getStackTrace()));
//        }
//
//        try {
//            Object obNull = null;
//            System.out.println("Fallará" + obNull.toString());
//        } catch (NullPointerException ex) {
//            System.out.println("NullPointerException");
//        }
        mainTryCatchSeparado(args);
    }

    public static void mainTryCatchSeparado(String[] args) {
       try{
        UsoNormalExcepciones unObj = new UsoNormalExcepciones();
        Object obNull = null;
        System.out.println("Fallará" + obNull.toString());
       }
       catch(Exception ex){
           System.out.println("Excepcion encontrada");
           //Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
       }
    }
}
