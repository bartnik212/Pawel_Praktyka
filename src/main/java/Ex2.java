import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        String text = "";
        int noComas = 0;
        int oneComa = 0;
        int twoComas = 0;
        int moreComas = 0;

        while (!text.contains("koniec")) {
            int comas = 0;
            System.out.println("Wpisz zdanie");
            text = scaner.nextLine();
            char[] charArray = text.toCharArray();
            for (char el : charArray){
                if(el == ','){
                   comas++;
                }
            }
            if (comas == 0){
                noComas++;
            } else if(comas == 1){
                oneComa++;
            } else if(comas == 2){
                twoComas++;
            } else {
                moreComas++;
            }
        }


        System.out.println("Ilość zdań bez przecinka: " + noComas );
        System.out.println("Ilość zdań z jednym przecinkiem: " + oneComa);
        System.out.println("Ilość zdań z dwoma przecinkami: " + twoComas);
        System.out.println("Ilość zdań z więcej niż dwoma przecinkami: " + moreComas);



    }
}
