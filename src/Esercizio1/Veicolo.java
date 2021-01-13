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
public class Veicolo {

    String marca;
    int anno;
    int cilindrata;

    public Veicolo(String marca, int anno, int cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }

    public String toString() {
        String tx = "";
        tx = "Marca: " + marca + "\nAnno: " + anno + "\ncilindrata: " + cilindrata;
        return tx;
    }

}
