package Nedelja1;

import java.util.Locale;
import java.util.Scanner;

public class Domaci1Nedelja1 {
    public static void main(String[] args) {

//         Корисник се шета помоћу тастера (w-горе, a- лево, s-доле, d-десно);
//         Програм памти колико је корисник пута ишао горе, лево, доле и десно;
//         Програм се зауставља ако корисник унесе било који карактер сем
//         (w,s,a,d);
//         На крају програм исписује број корисникових корака ка свим странама.

        Scanner sc = new Scanner(System.in);

        int brojacW = 0;
        int brojacS = 0;
        int brojacA = 0;
        int brojacD = 0;

        boolean isTrue = true;

        while (isTrue) {
            System.out.println("Molimo vas pritisnite za kretanje - (w-gore, a- levo, s-dole, d-desno: ");
            String stop = sc.nextLine().toLowerCase(Locale.ROOT);
            switch (stop) {
                case "w":
                    brojacW += 1; break;
                case "a":
                    brojacA += 1; break;
                case "s":
                    brojacS += 1; break;
                case "d":
                    brojacD += 1; break;
                default:
                    isTrue = false;
            }

        }
        System.out.println("Корисник је прошао " + brojacW + " корака на горе, " + brojacS + " корак на доле, " + brojacA + " корака лево и " + brojacD + " коракa десно");
    }
}
