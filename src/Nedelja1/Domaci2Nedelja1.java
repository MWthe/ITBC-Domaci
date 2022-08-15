package Nedelja1;

import java.util.Scanner;

public class Domaci2Nedelja1 {
    public static void main(String[] args) {

//        Корисник може унети n бројева са тастатуре, програм се зауставља када
//        користин напише команду “stop”:
//        Програм проверава сваки унос корисника (сваки број који корисник унесе);
//        Ако је број који је корисник унео дељив са 2, програм исписује “Broj je
//        deljiv sa 2”;
//        Ако број није дељив са 2, програм исписује “Broj nije deljiv sa 2”.
        functest();

    }

    private static void functest() {
        while (true) {

            Scanner sc = new Scanner(System.in);
            String inputString;
            System.out.println("Unesite broj ili STOP za kraj programa");
            inputString = sc.next();

            if (inputString.toUpperCase().equals("STOP")) {
                System.out.println("Kraj programa");
                break;
            } else {
                int inputInt = Integer.parseInt(inputString);
                if (inputInt % 2 == 0) {
                    System.out.println("Deljiv sa 2");
                } else {
                    System.out.println("Nije deljiv sa 2");
                }
            }
        }
    }
}
