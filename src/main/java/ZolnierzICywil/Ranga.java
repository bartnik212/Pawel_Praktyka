package ZolnierzICywil;

public enum Ranga {

    POLKOWNIK,
    MAJOR,
    KAPITAN,
    PORUCZNIK,
    CHORAZY,
    SIERZANT,
    KAPRAL;

    private String ranga;

    public String getRanga() {
        return ranga;
    }

    public Ranga setRanga(String ranga) {
        this.ranga = ranga;
        return this;
    }
}
