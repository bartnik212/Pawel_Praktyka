package ZolnierzICywil2;

public abstract class Osoba {

    public abstract void przedstawSie();

    public String getImie() {
        return imie;
    }

    public Osoba setImie(String imie) {
        this.imie = imie;
        return this;
    }

    public Osoba setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    protected String imie;
    protected String nazwisko;


}
