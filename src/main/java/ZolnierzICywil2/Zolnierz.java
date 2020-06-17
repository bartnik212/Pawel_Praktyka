package ZolnierzICywil2;

public class Zolnierz extends Osoba {

    public Zolnierz setRanga(Ranga ranga) {
        this.ranga = ranga;
        return this;
    }

    public Ranga getRanga() {
        return ranga;
    }

    private Ranga ranga;

    @Override
    public void przedstawSie() {
        Osoba osoba = new Zolnierz();
        System.out.println("Tu "
                + osoba.getImie() + " "
                + osoba.getNazwisko() + " " +
                ranga.wybranaRanga +
                " Polskich sił zbrojnych");
    }


}
