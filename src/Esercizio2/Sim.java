/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio2;

import java.util.ArrayList;

/**
 *
 * @author scian
 */
public class Sim {

    static String numeroTelefonico;
    static double credito;
    static ArrayList<Chiamate> listaChiamate = new ArrayList<Chiamate>();

    public Sim(String numeroTelefonico, double credito) {
        this.numeroTelefonico = numeroTelefonico;
        this.credito = credito;
    }

    static void telefonata(String numeroChiamato, int minutiConversazione) {
        Chiamate chiamata = new Chiamate(numeroChiamato, minutiConversazione);
        listaChiamate.add(chiamata);
    }

    static void calcoloMinuti() {
        int totaleMinuti = 0;
        for (Chiamate c : listaChiamate) {
            totaleMinuti += c.getMinutiConversazione();
        }
        System.err.println("\nTotale minuti in chiamata: " + totaleMinuti);
    }

    static void totaleChiamate(String numeroChiamato) {
        int totaleChiamate = 0;
        for (Chiamate c : listaChiamate) {
            if (c.getNumeroChiamato().equals(numeroChiamato)) {
                totaleChiamate++;
            }
        }
        System.err.println("\nTotaleChiamate effettuate: " + totaleChiamate);
    }

    static void stampa(int i) {
        String tx = "";
        tx += "Numero telefonico: " + numeroTelefonico + "\n-----------------\nELENCO CHIAMATE";
        for (Chiamate c : listaChiamate) {
            tx += "\nNumero chiamato: " + c.getNumeroChiamato() + " - Minuti conversazione: " + c.getMinutiConversazione();
        }
        System.out.println(tx);

    }

}
