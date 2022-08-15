package Nedelja3;

public class Domaci1Nedelja3Zadatak2 {

    public static boolean sameElement(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j] == a[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] b = {9, 10, 11, 12, 13, 14, 15};

        System.out.println(sameElement(a, b));

    }
}
