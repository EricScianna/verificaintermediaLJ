/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio3;

/**
 *
 * @author scian
 */
public class Officina {

    static void immissioneDecespugliatore(String marca, double costoRiparazione, boolean accensioneElettronica) {
        if (App.officinaArr.size() < 10) {
            Decespugliatori decespugliatore = new Decespugliatori(marca, costoRiparazione, accensioneElettronica);
            App.officinaArr.add(decespugliatore);
        } else {
            System.out.println("Officina pieno");
        }
    }

    static void immissioneMotozappa(String marca, double costoRiparazione, int numRuote) {
        if (App.officinaArr.size() < 10) {
            Motozappe Motozappa = new Motozappe(marca, costoRiparazione, numRuote);
            App.officinaArr.add(Motozappa);
        } else {
            System.out.println("Officina pieno");
        }
    }

    static void immissioneTosaerba(String marca, double costoRiparazione, int numRuote) {
        if (App.officinaArr.size() < 10) {
            Tosaerba Tosaerba = new Tosaerba(marca, costoRiparazione, numRuote);
            App.officinaArr.add(Tosaerba);
        } else {
            System.out.println("Garage pieno");
        }
    }

    static void stampa() {
        for (Apparecchi a : App.officinaArr) {
            System.out.println("----STAMPA-----");
            System.out.println(a.toString() + "\n");
        }

    }
}
