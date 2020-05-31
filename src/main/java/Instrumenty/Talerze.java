package Instrumenty;

public class Talerze implements IInstrument {

    @Override
    public void graj(String tekst){
        System.out.println("tss, tss, tss " + tekst);
    }
}
