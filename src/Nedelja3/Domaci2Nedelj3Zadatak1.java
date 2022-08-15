package Nedelja3;

import java.util.Arrays;
import java.util.Scanner;

public class Domaci2Nedelj3Zadatak1 {

    public static int sum(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        return suma;
    }
    public static int[] largestRow(int[][] matrica) {
        int max = 0;
        int[] maxRow = new int[matrica.length];
        for (int i = 0; i < matrica.length; i++) {
            if (sum(matrica[i]) > max) {
                max = sum(matrica[i]);
                maxRow = matrica[i];
            }
        }
        return maxRow;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Unesite broj redova: ");
//        int redovi = sc.nextInt();
//        System.out.print("Unesite broj kolona: ");
//        int kolone = sc.nextInt();
//        int[][] matrix = new int[redovi][kolone];
//
//        System.out.println("Unesite elemente matrice: ");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print("Unesite element [" + i + "]" + "[" + j + "]:");
//                matrix[i][j] = sc.nextInt();
//            }
//        }
        int[][] matrix = {{3, 2, 1, 7},
                {9, 22, 15, 4},
                {3, 0, 18, 17},
                {7, 21, 15, 15}};

        System.out.println("Suma prvog reda je :" + sum(matrix[0]));
        System.out.println("Suma drugog reda je :" + sum(matrix[1]));
        System.out.println("Suma treceg reda je :" + sum(matrix[2]));
        System.out.println("Suma cetvrtog reda je :" + sum(matrix[3]));

        System.out.println(Arrays.toString(largestRow(matrix)));
    }
}



