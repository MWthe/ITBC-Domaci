package Nedelja3;

import java.util.Arrays;
import java.util.Collections;

public class Domaci2Nedelja3Zadatak2 {

    public static void main(String[] args) {
        //Написати програм који највећу (по збиру) колону, ставља на прво место
//        int[][] matrix = {{3, 2, 1, 7},
//                          {9, 11, 5, 4},
//                          {6, 0, 13, 17},
//                          {7, 21, 14, 15}};

        int[][] matrix = { {3, 2, 7, 1},
                            {9, 11, 4, 5},
                            {6, 0, 17, 13},
                            {7, 21, 15, 14}};

//        int[][] matrix = {{3, 7, 2, 1},
//                {9, 4, 11, 5},
//                {6, 17, 0, 13},
//                {7, 15, 21, 14}};

//                int[][] matrix = { {7, 3, 2, 1},
//                                   {4, 9, 11, 5},
//                                   {17, 6, 0, 13},
//                                   {15, 7, 21, 14}};
        int sum = 0;
        int max = 0;
        int index = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            System.out.println("Suma kolone " + i + " je: " + sum);
            if (sum > max) {
                max = sum;
                index = i;

            }
            sum = 0;
        }
        System.out.println(index);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        System.out.println();

        for (int j = 0; j < matrix.length; j++) {
                int temp = matrix[j][0];
                matrix[j][0] = matrix[j][index];
                matrix[j][index] = temp;


        }

        for (int i = 0; i < matrix.length; i++) {
        System.out.println();
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
    }

    }
}