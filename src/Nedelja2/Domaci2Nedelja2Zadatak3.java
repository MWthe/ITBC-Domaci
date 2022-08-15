package Nedelja2;

import java.util.Scanner;

public class Domaci2Nedelja2Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite prvi indeks: ");
        int index1 = sc.nextInt();
        System.out.print("Unesite drugi indeks: ");
        int index2 = sc.nextInt();
        int counter = 0;
        int[] arr = {1, 2, 3, -6, -3, -2, 5, 8, -6, -2, -6};
        for (int i = index1; i <= index2 ; i++) {
            if (arr[i] < 0) {
                counter += 1;
            }
        }
        System.out.println("Od indeksa " + index1 + " do indeksa " + index2 + " nalaze se " + counter + " negativna broja ");
    }
}