package Instrumenty;

public class Muzykant  {

    public Muzykant(String imie){
    }

    private IInstrument instrument = null;

    public Muzykant setInstrument (IInstrument instrument){
        this.instrument = instrument;
        return this;
    }

    public void zagraj (String text){

        if(instrument == null) {
            System.out.println("nie mam instrumentu do grania");
        } else {
        instrument.graj(text);
        }
    }


}
