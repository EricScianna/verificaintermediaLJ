/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio1;

import java.util.ArrayList;

/**
 *
 * @author scian
 */
public class App {

    static ArrayList<Veicolo> garageArr = new ArrayList<Veicolo>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garage.immissioneAuto("fiat", 2000, 1600, 3, "Diesel");
        Garage.immissioneAuto("mercedes", 2016, 1700, 5, "Benzina");
        Garage.immissioneFurgone("iveco", 2020, 3000, 50000);
        Garage.immissioneFurgone("stralis", 2018, 4000, 80000);
        Garage.immissioneMoto("suzuki", 2017, 1000, 5);
        Garage.immissioneMoto("Ducati", 2019, 600, 4);
        Garage.estrazioneVeicolo(1);
        Garage.stampa();

    }

}
