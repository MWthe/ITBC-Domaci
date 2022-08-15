package Nedelja2;

import java.util.Arrays;
class Domaci2Nedelja2Zadatak4 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Ova funkcija menja mesta clanovima niza (bubble sort)
    public static void selectionSort(int[] arr) {
// Petlja ide od prvog indeksa (0) do duzine niza (duzinu niza smanjujemo za 1 jer se duzina niza meri od 1 do n, a broj clanova niza ili indeks se meri od 0 do n)
        for (int i = 0; i < arr.length - 1; i++) {
// U ovom delu pretpostavljamo da je prvi clan niza najmanji da bi ga uporedjivali sa drugima
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
// Dajemo uslov ukoliko je prvi clan "j" niza, manji od prvog clana "i" niza.
                if (arr[j] < arr[i]) {
                    min = j; // Menjamo da je najmanji broj sad clan "j" niza.
                }
            }
// i onda menjamo mesta tj "swapujemo" mesta indeksu [i] i broja koji je za sada najmanji, a to je u ovom slucaju sada "min" u nizu arr
            swap(arr, min, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 4, 1, 9, -2};
        selectionSort(arr);
// Ispisuje se sortirani niz
        System.out.println(Arrays.toString(arr));
    }
}
