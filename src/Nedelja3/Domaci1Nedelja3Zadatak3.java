package Nedelja3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Domaci1Nedelja3Zadatak3 {

    public static void randomElement() {
        ArrayList <Integer> integerList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random nrand = new Random();
        while (true) {
            System.out.print("Unesite sledeci element ili stop za kraj programa: ");
            String input = sc.next();
            if (input.toLowerCase().equals("stop")) {
                break;
            }
            int el = Integer.parseInt(input);
            integerList.add(el);

        }
        int randomNumber = integerList.get(nrand.nextInt(integerList.size()));
        System.out.println("Random element je: " + randomNumber);

    }

    public static void main(String[] args) {

        randomElement();

    }
}
