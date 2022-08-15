package Nedelja1;

import java.util.Scanner;

public class DomaciZadatak4 {
    public static void main(String[] args) {

//Написати програм који исписује парне природне бројеве до унетог броја
//Природни бројеви су сви цели бројеви већи од 0 - {1,2,...}
//Пример1:
//Корисник уноси: 11
//Испис: 2,4,6,8,10
//
//Пример2:
//Корисник уноси: 8
//Испис: 2,4,6,8

        Scanner sc = new Scanner(System.in);
        System.out.print("Molim Vas unesite neki broj: ");

        int broj = sc.nextInt();

        for (int n = 1; n <= broj; n++) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}
