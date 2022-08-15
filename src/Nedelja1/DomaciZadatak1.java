package Nedelja1;

import java.util.Scanner;

public class DomaciZadatak1 {
    public static void main(String[] args) {

//        1. Корисник уноси два реална броја
//        1. Исписати да ли је производ ова два броја позитиван
//        2. Исписати да ли је збир ова два броја већи од 150
//        3. Исписати који је већи од ова два броја
//        Напомена: Водити рачуна да ли је . или ,
//                За исписе true/false користити boolean, а не String
//        Унесите два реална броја:
//        4.5 6.3
//
//        true
//        false
//        6.3

        Scanner sc = new Scanner(System.in);
        System.out.println("Upisite dva realna broja: ");
        double prviBroj = sc.nextDouble();
        double drugiBroj = sc.nextDouble();

        System.out.println(prviBroj * drugiBroj > 0);

        System.out.println(prviBroj + drugiBroj > 150);


        if (prviBroj > drugiBroj) {
            System.out.println(prviBroj);
        } else if (prviBroj == drugiBroj) {
            System.out.println("Brojevi su jednaki");
        } else {
            System.out.println(drugiBroj);
        }

    }
}
