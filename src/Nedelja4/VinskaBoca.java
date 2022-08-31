package Nedelja4;
//    b) Klasa VinskaBoca ima atribut nazivVina
//    c) Klasa RonilackaBoca ima atribut masa
//    Sve tri klase imaju sopstvene konstruktore. U svim klasama napraviti metodu toString(), klasa
//    Boca ima svoju metodu toString do klase VinskaBoca i RonilackaBoca nasleuju klasu boca i njene
//    atribute i metode. Za svaku bocu se moºe proveriti da li je identi£na nekoj drugoj boci, boce su
//    identi£ne ako imaju iste zapremine (ne moraju biti iste vrste).

public class VinskaBoca extends Boca {

    String nazivVina;

    VinskaBoca(double zapremina, String nazivVina) {
        super(zapremina);
        this.nazivVina = nazivVina;
    }
    public double getZapremina() {
        return super.getZapremina();
    }

    public String getNazivVina() {
        return nazivVina;
    }

    @Override
    public String toString(){
        return "Vino " + nazivVina + " ima zapreminu: " + zapremina;
    }
}
