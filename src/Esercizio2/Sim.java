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

    private String numeroTelefonico;
    private double credito;
    private ArrayList<Chiamate> listaChiamate = new ArrayList<Chiamate>();

    public Sim(String numero, double credito) {
        this.numeroTelefonico = numeroTelefonico;
        this.credito = credito;
    }

    public void telefonata(String numeroChiamato, int minutiConversazione) {
        Chiamate chiamata = new Chiamate(numeroChiamato, minutiConversazione);
        listaChiamate.add(chiamata);
    }

    public int calcoloMinuti() {
        int totaleMinuti = 0;
        for (Chiamate c : listaChiamate) {
            totaleMinuti += c.getMinutiConversazione();
        }
        return totaleMinuti;
    }

    public int totaleChiamate(String numeroChiamato) {
        int totaleChiamate = 0;
        for (Chiamate c : listaChiamate) {
            if (c.getNumeroChiamato().equals(numeroChiamato)) {
                totaleChiamate++;
            }
        }
        return totaleChiamate;
    }

}
