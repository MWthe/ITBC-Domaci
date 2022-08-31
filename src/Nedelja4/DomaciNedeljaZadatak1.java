package Nedelja4;

public class DomaciNedeljaZadatak1 {
    public static void main(String[] args) {
        Televizor t1 = new Televizor();

        t1.ukljuci();
        System.out.println(t1.ispisiParametre());
        System.out.println();
        t1.promeniProgramNavise();
        t1.pojacajTon();
        System.out.println(t1.ispisiParametre());
        System.out.println();
        t1.promeniProgramNavise();
        t1.pojacajTon();
        System.out.println(t1.ispisiParametre());
        System.out.println();
        t1.smanjiTon();
        t1.vratiTrenutniProgram();
        System.out.println(t1.ispisiParametre());
        System.out.println();
        t1.promeniProgramNanize();
        System.out.println(t1.vratiJacinuTona());
        System.out.println(t1.ispisiParametre());
        System.out.println(t1.daLiJeUkljucen());
        System.out.println();
        t1.iskljuci();
        System.out.println(t1.ispisiParametre());
    }
}
