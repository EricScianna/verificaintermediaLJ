/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio2;

/**
 *
 * @author scian
 */
public class App {

    public static void main(String[] args) {

        Sim nuovaSim = new Sim("3407064004", 100.00);
        Sim.telefonata("3407064005", 3);
        Sim.telefonata("3407064001", 7);
        Sim.telefonata("3407064005", 4);
        Sim.telefonata("3407064002", 9);
        System.err.println("\nTotale minuti in chiamata: " + Sim.calcoloMinuti());
        System.err.println("TotaleChiamate effettuate: " + Sim.totaleChiamate("3407064005"));
        Sim.stampa(0);

    }

}
