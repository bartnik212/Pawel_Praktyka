import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        char[] charArray = text.toCharArray();

        int coma = 0;
        int dot = 0;

        for(char element : charArray){

            if(element == '.'){
                dot++;
            } else if(element == ','){
                coma++;
            }
        }

        System.out.println("Ilość kropek: " + dot);
        System.out.println("Ilość przecinków: " + coma);
    }
}
