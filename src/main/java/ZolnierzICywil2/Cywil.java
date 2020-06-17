package ZolnierzICywil2;

public class Cywil extends Osoba {
    @Override
    public void przedstawSie() {
        Osoba osoba = new Cywil();
        System.out.println("Nazywam się "
                + osoba.getImie() + " "
                + osoba.getNazwisko() +
                ", jestem obywatelem Polski!");
    }
}
