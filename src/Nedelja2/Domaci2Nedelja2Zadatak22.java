package Nedelja2;

import java.util.Arrays;

public class Domaci2Nedelja2Zadatak22 {
            public static int[] bubbleSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j + 1] < arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        }

        public static void main(String[] args) {
            int[] arr1 = {2, 4, 1, 7, 3, 6};
            System.out.println(Arrays.toString(bubbleSort(arr1)));
            System.out.println("Drugi najveci broj je: " + arr1[arr1.length-2]);
        }
}

