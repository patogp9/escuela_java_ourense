/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_funcionesbasicas;

/**
 *
 * @author PC
 */
public class Operadores {

    public static void probarOperadores() {
        System.out.println("-------------------\nOPERADORES\nUnarios:");

        System.out.println("Negación: " + !true);
        System.out.println("Negativo: " + -(12));
        int n = 0;
        System.out.println("Contador inicializado en 0 al imprimir n++: " + n++);
        System.out.println("Contador inicializado en 1 al imprimir ++n: " + ++n);

        System.out.println("Binarios:");
        int num = 4;
        System.out.println("Suma y multiplicacion (paréntesis): " + ((5 + 5) * num));
        System.out.println("División (con truncado(int)) (paréntesis): " + ((13) / num));
        System.out.println("División con casting(decimales): " + ((float) (13) / num));
        System.out.println("¿Es cierto?: " + (true || false));
        System.out.println("¿Es cierto?: " + (true && false));
        System.out.println("¿Es cierto?: " + (true != false));
        System.out.println("6 XOR 9 = " + (9 ^ 6));
    }
}
