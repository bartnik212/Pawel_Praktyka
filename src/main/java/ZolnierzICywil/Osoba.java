package ZolnierzICywil;

public abstract class Osoba {

    private String imie;
    private String nazwisko;

    public Osoba(){

    }
    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    abstract void przedstawSie();

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Osoba setImie(String imie) {
        this.imie = imie;
        return this;
    }

    public Osoba setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }
}
