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

    private int porte;
    private String alimentazione;

    public Auto(String marca, int anno, int cilindrata, int porte, String alimentazione) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    public String toStringA() {
        String tx = toString();
        tx = "Porte: " + porte + "\nAlimentazione: " + alimentazione;
        return tx;
    }

}
