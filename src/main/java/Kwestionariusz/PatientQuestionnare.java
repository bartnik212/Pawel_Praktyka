package Kwestionariusz;

import java.util.Scanner;

public class PatientQuestionnare {


    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        System.out.println("Czy byłeś chory w ostatnim czasie? Y/N");
        String ostatnioChory = scaner.nextLine();
        System.out.println("Czy posiadasz maseczkę? Y/N");
        String maseczka = scaner.nextLine();
        System.out.println("Czy przebywałeś w krajach wysokiego ryzyka? Y/N");
        String krajeWysokiegoRyzyka = scaner.nextLine();
        System.out.println("Czy przebywałeś w otoczeniu osób na kwarantannie? Y/N");
        String osobyNaKwarantannie = scaner.nextLine();

        try {
            if (ostatnioChory.equals("Y") || maseczka.equals("N")) {
                throw new LowRiskPatient();
            }
        } catch (LowRiskPatient e) {
            System.out.println(e.getMessage());

        } try {
            if(krajeWysokiegoRyzyka.equals("Y") || osobyNaKwarantannie.equals("Y")){
                throw new HighRiskPatient();
            }
        } catch (HighRiskPatient e){
            HighRiskPatient highRiskPatient = new HighRiskPatient();
            highRiskPatient.dodatkowePytania();
        }
    }
}
