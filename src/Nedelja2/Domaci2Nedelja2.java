package Nedelja2;

public class Domaci2Nedelja2 {

    //Написати функцију која проверава да ли је троцифрен број Армстронгов или није
//Враћа true или false
//Број је Армстронгов ако је једнак збиру кубова његових цифара
//нпр. 370 = 3³ + 7³ + 0³ = 27 + 343 + 0 = 370
// isArmstrong(371) -> true
// isArmstrong(372) -> false

    private static boolean isArmstrong (int a) {
        int b = a / 100;
        int c = a % 100 / 10;
        int d = a % 10;
        if ((Math.pow(b,3) + Math.pow(c,3) + Math.pow(d,3)) == a) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        System.out.println(isArmstrong(372));

    }
}
