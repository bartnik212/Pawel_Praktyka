package Kwestionariusz;

public class LowRiskPatient extends RuntimeException {

    public LowRiskPatient(){
        super("Witaj, średnio cieszymy się, że jesteś naszym pacjentem :)");
    }

    public LowRiskPatient(String message){
        super(message);
    }


}
