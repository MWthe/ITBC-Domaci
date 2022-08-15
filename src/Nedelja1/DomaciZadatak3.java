package Nedelja1;

import java.util.Scanner;

public class DomaciZadatak3 {
    public static void main(String[] args) {
        //Корисник уноси троцифрен број: (претпоставити добар унос)
        //1. Извући цифре броја и исписати их кориснику
        //2. Проверити и исписати да ли је број Армстронгов
        //Број је Армстронгов ако је једнак збиру кубова његових цифара
        //нпр. 370 = 3³ + 7³ + 0³ = 27 + 343 + 0 = 370
        //Унесите троцифрен број:
        //370
        //Цифра стотине је: 3
        //Цифра десетице је: 7
        //Цифра јединице је: 0
        //Број јесте Армстронгов

        Scanner sc = new Scanner(System.in);
        System.out.print("Molimo vas unesite trocifreni broj: ");
        int number = sc.nextInt();

        int cifraStotice = number / 100;
        int cifraDesetice = number % 100 / 10;
        int cifraJedinice = number % 10;

        System.out.println("Cifra stotice je: " + cifraStotice);
        System.out.println("Cifra desetice je: " + cifraDesetice);
        System.out.println("Cifra jedinice je: " + cifraJedinice);

        if (Math.pow(cifraStotice,3)+Math.pow(cifraDesetice,3)+ Math.pow(cifraJedinice,3) == number) {
            System.out.println("Broj jeste Armstrongov");
        } else {
            System.out.println("Broj nije Armstrongov");
        }
    }
}
