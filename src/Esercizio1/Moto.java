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
public class Moto extends Veicolo {

   private final int tempi;

    public Moto(String marca, int anno, int cilindrata, int tempi) {
        super(marca, anno, cilindrata);
        this.tempi = tempi;
    }

    @Override
    public String toString() {

        String tx = super.toString() + "\nTempi: " + tempi;
        return tx;
    }
}
