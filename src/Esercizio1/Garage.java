/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author scian
 */
public class Garage {

    private final List<Veicolo> garageArr;
    private final int posti;

    public Garage(int posti) {
        this.posti = posti;
        garageArr = new ArrayList<>(posti);
        inizializza(posti);
    }

    public void entra(Veicolo v) {
        if (postoLibero() == -1) {
            throw new IllegalStateException("Il garage è pieno");
        }
        garageArr.set(postoLibero(), v);
    }

    public Veicolo estrazioneVeicolo(int i) {
        if (i >= this.posti || garageArr.get(i) == null) {
            return null;
        }
        Veicolo v = garageArr.get(i);
        garageArr.set(i, null);
        return v;
    }

    void stampa() {
        for (int i = 0; i < garageArr.size(); i++) {
            System.out.println("----POSTO N°" + i + "-----");
            System.out.println(garageArr.get(i) + "\n");
        }

    }

    private void inizializza(int posti) {
        for (int i = 0; i < posti; i++) {
            garageArr.add(null);
        }
    }

    private int postoLibero() {
        return garageArr.indexOf(null);
    }
}
