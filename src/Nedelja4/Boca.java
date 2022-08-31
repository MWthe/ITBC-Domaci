package Nedelja4;
//    2. Napraviti 3 klase
//    i. klasu Boca
//    ii. klasu VinskaBoca nasleuje klasu Boca
//    iii. klasu RonilackaBoca nasleuje klasu Boca
//    a) Klasa Boca ima atribut zapremina
//    b) Klasa VinskaBoca ima atribut nazivVina
//    c) Klasa RonilackaBoca ima atribut masa
//    Sve tri klase imaju sopstvene konstruktore. U svim klasama napraviti metodu toString(), klasa
//    Boca ima svoju metodu toString do klase VinskaBoca i RonilackaBoca nasleuju klasu boca i njene
//    atribute i metode. Za svaku bocu se moºe proveriti da li je identi£na nekoj drugoj boci, boce su
//    identi£ne ako imaju iste zapremine (ne moraju biti iste vrste).

import java.util.Objects;

public class Boca {

    double zapremina;


    Boca() {

    }

    Boca(double zapremina) {
        this.zapremina = zapremina;
    }

    public double getZapremina() {
        return zapremina;
    }

    @Override
    public String toString() {
        return "Zapremina boce je: " + zapremina;
    }

    public boolean compareBocas(Boca boca) {
        return this.zapremina ==  boca.zapremina;
    }
}



