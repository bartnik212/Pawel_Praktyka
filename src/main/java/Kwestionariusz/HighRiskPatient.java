package Kwestionariusz;

import javax.security.sasl.SaslClient;
import java.io.IOException;
import java.util.Scanner;

public class HighRiskPatient extends Exception {

    public void dodatkowePytania() {
        PatienAnswers patienAnswers = new PatienAnswers();
        Scanner scaner = new Scanner(System.in);

        System.out.println("Czy czujesz się chory? y/n");
        String czyJestChory = scaner.nextLine();
        System.out.println("Jaka jest temperatura Twojego ciała?");
        String temperaturaCiala = scaner.nextLine();


        if (czyJestChory.equals(patienAnswers.y) || !temperaturaCiala.equals("36.6")) {
            System.out.println("Wzywamy pogotowie");
        } else {
            System.out.println("(przez maseczkę) Cześć!");
        }

    }
}
