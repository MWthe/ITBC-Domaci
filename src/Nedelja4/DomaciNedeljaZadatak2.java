package Nedelja4;


import java.util.Objects;
public class DomaciNedeljaZadatak2 {


    public static void main(String[] args) {
        Boca b1 = new Boca(1.0);
        VinskaBoca vb1 = new VinskaBoca(10.0, "Zdrepceva krv");
        RonilackaBoca rb1 = new RonilackaBoca(10.0 ,15);


//        System.out.println(b1);
//        System.out.println(vb1);
//        System.out.println(rb1);


        System.out.println(vb1.compareBocas(rb1));
        System.out.println(b1.compareBocas(rb1));
        System.out.println(b1.compareBocas(vb1));


    }



}

