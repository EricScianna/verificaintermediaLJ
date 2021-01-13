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
public class Apparecchi {

    private static int numeroOrdine;
    private final String marca;
    private final double totaleRiparazione;

    public Apparecchi(String marca, double totaleRiparazione) {
        this.marca = marca;
        this.totaleRiparazione = totaleRiparazione;
        numeroOrdine++;
    }

    public static int getNumeroOrdine() {
        return numeroOrdine;
    }

    @Override
    public String toString() {
        String tx = "Marca: " + marca + "\nCosto riparazione: " + totaleRiparazione+"\nNumero ordine: "+numeroOrdine;
        return tx;
    }
}
