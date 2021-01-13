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
public class Decespugliatori extends Apparecchi {

    private final boolean accensioneElettronica;

    public Decespugliatori(String marca, double costoRiparazione, boolean accensioneElettronica) {
        super(marca, costoRiparazione);
      
        this.accensioneElettronica = accensioneElettronica;
    }

        
    @Override
    public String toString() {
        String tx = super.toString() + "\nAccensione elettrica: " + accensioneElettronica;
        return tx;
    }
}
