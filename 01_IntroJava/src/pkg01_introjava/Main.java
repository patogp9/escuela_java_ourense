package pkg01_introjava;

import pkg01_funcionesbasicas.Operadores;
import pkg01_funcionesbasicas.Bucles;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Tipos de datos:\n");
        byte b = -128;
        int i = 9;
        long l = 10000000000000L;
        float f = 3.14f;
        double d = Math.random() + 1;
        boolean flag = true;
        char ch = 'A';
        String s = "Lorem Ipsum";
        String ex[] = {"Ludicolo", "Vileplume", "Exeggutor", "Banette", "Espeon", "Claydol"};

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
    }
}
