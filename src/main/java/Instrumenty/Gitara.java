package Instrumenty;

public class Gitara implements IInstrument {

    @Override
    public void graj(String tekst){
        System.out.println("tyryryn, tyryryryrn " + tekst);
    }
}
