/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio3;

import java.util.ArrayList;

/**
 *
 * @author scian
 */
public class App {

    static ArrayList<Apparecchi> officinaArr = new ArrayList<Apparecchi>();
    static ArrayList<Riparazioni> riparazioniArr = new ArrayList<Riparazioni>();

    public static void main(String[] args) {

        Officina.immissioneDecespugliatore("bosc", 100, true);
        
        Officina.stampa();

        Riparazioni riparazione = new Riparazioni("Cambiata catena", 30);
        riparazioniArr.add(riparazione);
        riparazione = new Riparazioni("Ingrassata catena", 10);
        riparazioniArr.add(riparazione);
        riparazione = new Riparazioni("Messa a punto", 40);
        riparazioniArr.add(riparazione);

    }
}
