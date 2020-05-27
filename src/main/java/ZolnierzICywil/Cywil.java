package ZolnierzICywil;

public class Cywil extends Osoba {


    Osoba osoba = new Cywil();

    @Override
    void przedstawSie() {

        System.out.println("Nazywam się "
                + osoba.getImie() + " "
                + osoba.getNazwisko()
                + ", jestem obywatelem Polski!");
    }
}
