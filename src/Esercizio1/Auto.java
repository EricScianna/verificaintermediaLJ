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
public class Auto extends Veicolo {

    public static enum Alimentazione {
        Diesel, Benzina
    }
    private final int porte;

    private Alimentazione alimentazione;

    public Auto(String marca, int anno, int cilindrata, int porte, Alimentazione alimentazione) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    @Override
    public String toString() {

        String tx = super.toString() + "\nPorte: " + porte + "\nAlimentazione: " + alimentazione;
        return tx;
    }

}
