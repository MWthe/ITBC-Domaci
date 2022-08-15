package Nedelja3;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci1Nedelja3Zadatak1 {

    public static int stringCoutner() {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("Molimo vas unesite string koji zelite da dodate: ");
            String input = sc.next().toLowerCase();
            if (input.equals("stop")) {
                break;
            } else {
                stringList.add(input);
            }
            if (input.charAt(0) == input.charAt(input.length() - 1)) {
                counter += 1;
            }
        }
        return counter;
    }


    public static void main(String[] args) {

        System.out.println(stringCoutner());
    }
}
