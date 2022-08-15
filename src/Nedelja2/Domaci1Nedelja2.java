package Nedelja2;

public class Domaci1Nedelja2 {

    private static boolean isLeap(int year) {
        if ((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isLeap(1902));

    }
}
