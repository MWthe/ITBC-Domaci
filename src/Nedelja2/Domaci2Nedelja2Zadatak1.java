package Nedelja2;

import java.util.Scanner;

public class Domaci2Nedelja2Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite rec: ");
        String str = sc.nextLine();
        String nstr = "";
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            nstr = x + nstr;

        }
        System.out.println("Rec unazad: " + nstr);
    }
}
