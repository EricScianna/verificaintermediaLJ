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
public class Motozappe extends Apparecchi {

    private final int numRuote;

    public Motozappe(String marca, double costoRiparazione, int numRuote) {
        super(marca, costoRiparazione);
        this.numRuote = numRuote;
    }

    @Override
    public String toString() {
        String tx = super.toString() + "\nNumero ruote: " + numRuote;
        return tx;
    }
}
