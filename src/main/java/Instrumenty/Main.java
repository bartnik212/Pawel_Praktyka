package Instrumenty;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Podaj refren");
        String refren = scaner.nextLine();

        Muzykant muzykant = new Muzykant();

        String komenda = "";


        do {
            System.out.println("Co chcesz zrobić?[sing/instrument]");
            komenda = scaner.nextLine();

            switch (komenda){
                case "sing":
                    muzykant.zagraj(refren);
                    break;

                case "GUITAR":
                    IInstrument gitara = new Gitara();
                    muzykant.setInstrument(gitara);
                    System.out.println("Zmieniam instrument na gitarę");
                    break;

                case "DRUM":
                    IInstrument beben = new Beben();
                    muzykant.setInstrument(beben);
                    System.out.println("Zmieniam instrument na bęben");

                    break;

                case "PLATES":
                    IInstrument talerze = new Talerze();
                    muzykant.setInstrument(talerze);
                    System.out.println("Zmieniam instrument na talerze");
                    break;

                case "VOICE":
                    IInstrument voice = new Glos();
                    muzykant.setInstrument(voice);
                    System.out.println("Teraz będę śpiewał");
                    break;

                case "FLUTE":
                    IInstrument flet = new Flet();
                    muzykant.setInstrument(flet);
                    System.out.println("Zmieniam instrument na flet");
                    break;

                case "TIBETAN BOWL":
                    IInstrument misaTybetanska = new MisaTybetanska();
                    muzykant.setInstrument(misaTybetanska);
                    System.out.println("Zmieniam instrument na misę tybetańską");
                    break;

                default:

                    if(komenda.equals("koniec")){
                        System.out.println("kończymy na dziś");
                    } else{
                        System.out.println("nie wpisałeś nic poprawnie");
                    }
            }
        } while (!komenda.equals("koniec"));
    }
}
