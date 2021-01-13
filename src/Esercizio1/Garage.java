/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio1;

/**
 *
 * @author scian
 */
public class Garage {

    static void immissioneAuto(String marca, int anno, int cilindrata, int porte, String alimentazione) {
        if (App.garageArr.size() < 15) {
            Auto auto = new Auto(marca, anno, cilindrata, porte, alimentazione);
            App.garageArr.add(auto);
        } else {
            System.out.println("Garage pieno");
        }
    }

    static void immissioneFurgone(String marca, int anno, int cilindrata, int capacita) {
        if (App.garageArr.size() < 15) {
            Furgone furgone = new Furgone(marca, anno, cilindrata, capacita);
            App.garageArr.add(furgone);
        } else {
            System.out.println("Garage pieno");
        }
    }

    static void immissioneMoto(String marca, int anno, int cilindrata, int tempi) {
        if (App.garageArr.size() < 15) {
            Moto moto = new Moto(marca, anno, cilindrata, tempi);
            App.garageArr.add(moto);
        } else {
            System.out.println("Garage pieno");
        }
    }

    static void estrazioneVeicolo(int i) {
        System.out.println("----ESTRAZIONE-----");
        System.out.println(App.garageArr.get(i).toString() + "\n");
        App.garageArr.remove(i);

    }

    static void stampa() {
        for (Veicolo v : App.garageArr) {
            System.out.println("----STAMPA-----");
            System.out.println(v.toString() + "\n");
        }

    }
}
