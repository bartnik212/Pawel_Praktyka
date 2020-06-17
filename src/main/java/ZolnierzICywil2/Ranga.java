package ZolnierzICywil2;

import java.util.Arrays;
import java.util.Scanner;

public enum Ranga {

    POLKOWNIK,
    MAJOR,
    KAPITAN,
    PORUCZNIK,
    CHORAZY,
    SIERZANT,
    KAPRAL;

    Scanner scanner = new Scanner(System.in);
    String wybranaRanga = Ranga.valueOf(scanner.nextLine()).toString().toLowerCase();


}
