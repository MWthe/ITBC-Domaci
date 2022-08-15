package Nedelja2;

public class Domaci4Nedelja2 {

//    Написати функцију која ИСПИСУЈЕ да ли је број мањи, једнак или већи од другог броја
//    compareNums(5,4) -> Број је већи од другог броја
//    compareNums(5,5) -> Број је исти као и други број
//    compareNums(5,88) -> Број је мањи од другог броја

    private static String comepareNums (int a, int b) {
        if (a == b) {
            System.out.println("Broj je isti kao drugi broj");
        } else {
            if (a > b) {
                System.out.println("Broj je veci od drugog broja");
            } else {
                System.out.println("Broj je manji od drugog broja");
            }
        }
        return "";
    }

    public static void main(String[] args) {

        comepareNums(5, 88);

    }
}
