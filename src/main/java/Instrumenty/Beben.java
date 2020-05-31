package Instrumenty;

public class Beben implements IInstrument {


    @Override
    public void graj(String text){
        System.out.println("bum, bum, bum, bum " + text + " dyn, dyn");
    }
}
