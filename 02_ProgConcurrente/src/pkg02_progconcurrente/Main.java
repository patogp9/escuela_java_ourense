/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg02_progconcurrente;
/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HilosSencillos hs = new HilosSencillos(6,6);
        
        hs.iniciarHilosAB(); //Los ejecuta intercalados(paralelo)
        
        hs.ejecutarHilosAB(); //Los ejecuta uno tras otro(serie)
       
    }
    static double mostrarTiempo (long timeIni){
        double tiempototal=(double)(System.currentTimeMillis() - timeIni)/1000;
        System.out.println("Tiempo total: "+tiempototal);
        return tiempototal;
    }
}
