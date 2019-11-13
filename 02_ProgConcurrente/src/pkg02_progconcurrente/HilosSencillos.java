/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_progconcurrente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import static pkg02_progconcurrente.Main.mostrarTiempo;

/**
 *
 * @author PC
 */
public class HilosSencillos {

    static int sharedCount = 0;
    private ArrayList<HiloA> hiloA;
    private ArrayList<HiloB> hiloB;

    public HilosSencillos(int nha, int nhb) {
        hiloA = new ArrayList<>();
        for(int i = 0;i<nha;i++){
            hiloA.add(i, new HiloA());
            System.out.println("hilo a añadido");
        }
        hiloB = new ArrayList<>();
        for(int j =0;j<nhb;j++){
            hiloB.add(j, new HiloB());
            System.out.println("hilo b añadido");
        }
    }

    class HiloA implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.print("♠");
            }
            System.out.println("-");
        }
    }

    class HiloB implements Runnable {

        @Override
        public void run() {
            for (int j = 0; j < 100; j++) {
                 System.out.print("♥");
            }
            System.out.println("-");
        }
    }

    public void iniciarHilosAB() {
        long tempo = System.currentTimeMillis();
        ArrayList<Thread> threadsA, threadsB;
        threadsA = new ArrayList<>();
        threadsB = new ArrayList<>();

        System.out.println("Iniciar Hilos");
        for (int a = 0; hiloA.size() > a; a++) {
            
            threadsA.add(a, new Thread(hiloA.get(a)));
            threadsA.get(a).start();
            
            System.out.println("hilo a empieza");
        }
        for (int b = 0; hiloB.size() > b; b++) {
        
            threadsA.add(b,  new Thread(hiloB.get(b)));
            threadsA.get(b).start();
            
            System.out.println("hilo b empieza");
        }
        boolean flag;
        do {
            flag = false;

            for (int gong = 0; threadsA.size() > gong; gong++) {
                if (threadsA.get(gong).isAlive()) {
                    flag = true;
                }
            }
            for (int ding = 0; threadsB.size() > ding; ding++) {
                if (threadsA.get(ding).isAlive()) {
                    flag = true;
                }
            }
        } while (flag);
        System.out.println("Fin Hilos");
        mostrarTiempo(tempo);
    }

    public void ejecutarHilosAB() {
        long tempo = System.currentTimeMillis();
        ArrayList<Thread> threadsA, threadsB;
        threadsA = new ArrayList<>();
        threadsB = new ArrayList<>();

        System.out.println("Iniciar Hilos");
        for (int a = 0; hiloA.size() > a; a++) {
            
            threadsA.add(a,new Thread(hiloA.get(a)));
            threadsA.get(a).run();
            
            System.out.println("hilo a ejecuta");
        }
        for (int b = 0; hiloB.size() > b; b++) {
            
            threadsB.add(b,new Thread(hiloB.get(b)));
            threadsB.get(b).run();
            
            System.out.println("hilo b ejecuta");
        }
        boolean flag;
        do {
            flag = false;

            for (int gong = 0; threadsA.size() > gong; gong++) {
                if (threadsA.get(gong).isAlive()) {
                    flag = true;
                }
            }
            for (int ding = 0; threadsB.size() > ding; ding++) {
                if (threadsA.get(ding).isAlive()) {
                    flag = true;
                }
            }
        } while (flag);
        System.out.println("Fin Hilos");
        mostrarTiempo(tempo);
    }
}
