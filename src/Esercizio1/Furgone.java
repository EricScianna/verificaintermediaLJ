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
public class Furgone extends Veicolo {

    private final int capacita;

    public Furgone(String marca, int anno, int cilindrata, int capacita) {
        super(marca, anno, cilindrata);
        this.capacita = capacita;
    }

    @Override
    public String toString() {

        String tx = super.toString() + "\nCapacita: " + capacita;
        return tx;
    }
}
