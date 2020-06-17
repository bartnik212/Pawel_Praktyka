package ZolnierzICywil2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Jestes zolnierzem? tak/nie");
        String odpowiedz = scaner.nextLine();
        System.out.println("Podaj imię");
        String imie = scaner.nextLine();
        System.out.println("I nazwisko");
        String nazwisko = scaner.nextLine();
        
        if(odpowiedz.equals("nie")){
            Cywil cywil = new Cywil();
            cywil.setImie(imie);
            cywil.setNazwisko(nazwisko);
            cywil.przedstawSie();

        } else if(odpowiedz.equals("tak")){
            Zolnierz zolnierz = new Zolnierz();
            System.out.println("jaka masz range?");
            String ranga = scaner.nextLine();
            Ranga.valueOf(ranga);
            zolnierz.setImie(imie);
            zolnierz.setNazwisko(nazwisko);
            zolnierz.przedstawSie();

        }
    }
}
