package Nedelja4;
//    c) Klasa RonilackaBoca ima atribut masa
//    Sve tri klase imaju sopstvene konstruktore. U svim klasama napraviti metodu toString(), klasa
//    Boca ima svoju metodu toString do klase VinskaBoca i RonilackaBoca nasleuju klasu boca i njene
//    atribute i metode. Za svaku bocu se moºe proveriti da li je identi£na nekoj drugoj boci, boce su
//    identi£ne ako imaju iste zapremine (ne moraju biti iste vrste).

public class RonilackaBoca extends Boca {

    double masa;

    RonilackaBoca(double zapremina, double masa) {
        super(zapremina);
        this.masa = masa;
    }
    public double getZapremina() {
        return super.getZapremina();
    }

    public double getMasa() {
        return masa;
    }

    public String toString(){
        return super.toString() + " ,a njena masa je: " + masa;
    }
}
