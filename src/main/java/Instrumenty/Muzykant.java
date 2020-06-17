package Instrumenty;

public class Muzykant  {


    private IInstrument instrument = null;

    public void setInstrument (IInstrument instrument){
        this.instrument = instrument;
    }

    public void zagraj (String text){

        if(instrument == null) {
            System.out.println("nie mam instrumentu do grania");
        } else {
        instrument.graj(text);
        }
    }


}
