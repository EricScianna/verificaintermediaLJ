/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio1;

import java.util.ArrayList;

/**
 *
 * @author scian
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Garage garage = new Garage(15);
        garage.entra(new Auto("fiat", 2000, 1600, 3, Auto.Alimentazione.Benzina));
        garage.entra(new Auto("mercedes", 2016, 1700, 5, Auto.Alimentazione.Diesel));

        garage.entra(new Furgone("iveco", 2020, 3000, 50000));
        garage.entra(new Furgone("stralis", 2018, 4000, 80000));

        garage.entra(new Moto("suzuki", 2017, 1000, 2));
        garage.entra(new Moto("Ducati", 2019, 600, 4));

        System.out.println("ESCE \n"+garage.estrazioneVeicolo(7)+"\n");
        
        garage.stampa();

    }

}
