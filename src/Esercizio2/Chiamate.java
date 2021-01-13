/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio2;

/**
 *
 * @author scian
 */
public class Chiamate {

    private String numeroChiamato;
    private int minutiConversazione;

    public Chiamate(String numeroChiamato, int minutiConversazione) {
        this.minutiConversazione = minutiConversazione;
        this.numeroChiamato = numeroChiamato;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public void setNumeroChiamato(String numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }

    public int getMinutiConversazione() {
        return minutiConversazione;
    }

    public void setMinutiConversazione(int minutiConversazione) {
        this.minutiConversazione = minutiConversazione;
    }

}
