package Nedelja4;

public class Televizor {
    int jacinaTona = 0;
    int trenutniProgram = 1;
    boolean ukljucen = false;

    void ukljuci() {
        ukljucen = true;
    }

    void iskljuci() {
        ukljucen = false;
    }

    void pojacajTon() {
        jacinaTona = jacinaTona + 1;
    }

    void smanjiTon() {
        jacinaTona = jacinaTona - 1;
    }

    void iskljuciTon() {
        jacinaTona = 0;
    }

    public void promeniProgramNavise() {
        this.trenutniProgram = trenutniProgram + 1;
    }

    public void promeniProgramNanize() {
        this.trenutniProgram = trenutniProgram - 1;
    }

    public int vratiTrenutniProgram() {
        return trenutniProgram;
    }

    public int vratiJacinuTona() {
        return jacinaTona;
    }

    boolean daLiJeUkljucen() {
        return ukljucen;
    }

    public String ispisiParametre() {
        if (!ukljucen) {
            return "Televizor je ugasen";
        } else {
            return "Televizor je upaljen i njegova trenutni program je: " + trenutniProgram +
                    "\nJacina tona je : " + jacinaTona;

        }
    }
}

