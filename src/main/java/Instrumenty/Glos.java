package Instrumenty;

public class Glos implements IInstrument {

    @Override
    public void graj(String tekst){
        System.out.println(tekst + " " + tekst);
    }
}
