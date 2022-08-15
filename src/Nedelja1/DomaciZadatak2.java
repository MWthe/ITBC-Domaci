package Nedelja1;

import java.util.Scanner;

public class DomaciZadatak2 {
    public static void main(String[] args) {
//        Година је преступна ако испуњава следеће:
//        Година је дељива са 4
//        Година је дељива са 400 или година није дељива са 100
//        Унесите годину коју желите да проверите:
//        1900
//
//        Година није преступна
//        Унесите годину коју желите да проверите:
//        1992
//
//        Година јесте преступн

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu koju zelite da proverite: ");
        int godina = sc.nextInt();

        if ((godina % 4 == 0) && (godina % 400 == 0 || godina % 100 != 0)) {
            System.out.println("Godina jeste prestupna");
        } else {
            System.out.println("Godina nije prestupna");
        }
    }
}