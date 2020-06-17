package Kwestionariusz;

import java.util.Scanner;

public class PatientQuestionnare {


    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        PatienAnswers patientAnswers = new PatienAnswers();

        System.out.println("Czy byłeś chory w ostatnim czasie? y/n");
        String ostatnioChory = scaner.nextLine();
        System.out.println("Czy posiadasz maseczkę? y/n");
        String maseczka = scaner.nextLine();
        System.out.println("Czy przebywałeś w krajach wysokiego ryzyka? y/n");
        String krajeWysokiegoRyzyka = scaner.nextLine();
        System.out.println("Czy przebywałeś w otoczeniu osób na kwarantannie? y/n");
        String osobyNaKwarantannie = scaner.nextLine();

        try {
            if (ostatnioChory.equals(patientAnswers.y) || maseczka.equals(patientAnswers.n)) {
                throw new LowRiskPatient();
            }
        } catch (LowRiskPatient e) {
            System.out.println(e.getMessage());

        } try {
            if(krajeWysokiegoRyzyka.equals(patientAnswers.y) || osobyNaKwarantannie.equals(patientAnswers.y)){
                throw new HighRiskPatient();
            }
        } catch (HighRiskPatient e){
            HighRiskPatient highRiskPatient = new HighRiskPatient();
            highRiskPatient.dodatkowePytania();
        }
    }
}
