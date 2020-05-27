package ZolnierzICywil;

public class Zolnierz extends Osoba {

    private Ranga ranga;

    Osoba osoba = new Zolnierz();
    @Override
    void przedstawSie() {
        System.out.println("Tu "
                + osoba.getImie() + " "
                + osoba.getNazwisko() + " "
                + Ranga.valueOf(ranga.getRanga()
                .toLowerCase()
                .replace(ranga.getRanga().substring(0,1), ranga.getRanga().substring(0,1)
                        .toUpperCase())
                + " Polskich sił zbrojnych!"));
    }



}
