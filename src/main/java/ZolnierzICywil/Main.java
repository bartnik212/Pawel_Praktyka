package ZolnierzICywil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Osoba osoba = new Zolnierz();
        Ranga ranga = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj, jak masz na imię?");

        String imie = scanner.nextLine();
        osoba.setImie(imie);
        System.out.println("Jak masz na nazwisko?");
        String nazwisko = scanner.nextLine();
        osoba.setNazwisko(nazwisko);
        System.out.println("Czy jesteś żołnierzem? (tak/nie)");
        String odpowiedz = scanner.nextLine();

        if ("tak".equals(odpowiedz)) {
            System.out.println("Jakiej rangi?");
            String rangaZolnierza = scanner.nextLine();
            ranga.setRanga(rangaZolnierza);
            Zolnierz zolnierz = new Zolnierz();
            zolnierz.przedstawSie();
        } else {
            Cywil cywil = new Cywil();
            cywil.przedstawSie();
        }
    }
}
