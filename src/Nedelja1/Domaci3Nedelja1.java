package Nedelja1;

import java.util.Scanner;

public class Domaci3Nedelja1 {
    public static void main(String[] args) {

//        Програм креира скривени број од 0 до 100, користик има на располагању
//        максимално 10 корака да пронађе скривени број, програм, након сваког унетог
//        покушаја исписује да ли је скривени број “мањи” или “већи” од унетог броја,
//                ако је број исти исписује “Браво! Пронашли сте број!” и програм се завршава.
//        Програм креира насумичан (random) број од 0 до 100,помоћ - (int)
//                (Math.random() * 100); користимо класу Math са методом random() која
//        нам даје број између 0 и 1 (нпр. 0,20 ; 0,72 …) множимо са 100 да би
//        направили број од 0 до 100;
//        Ако је број који је корисник унео једнак броју креираном од стране
//        рачунара исписати “Браво! Пронашли сте број!” и програм се прекида;
//        Након 10 покушаја програм се зауставља.

        int goal = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Oprobaj se!");

        for(int i = 1; i <= 10; i++) {
            int guess = sc.nextInt();

            if (guess == goal) {
                System.out.println("Bravo pronasli ste broj!");
                return;
            } else {
                if (guess < goal) {
                    System.out.println("Veci");
                } else {
                    System.out.println("Manji");
                }
            }
        }

        System.out.println("Nemate vise pokusaja");
    }
}

