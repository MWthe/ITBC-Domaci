package Nedelja5.ComplexNumbers;

public class Application {
    public static void main(String[] args) {
        Complex complex1;
        Complex complex2;
        Complex complex3;


        complex1 = new Complex(2.0, 3.0);
        complex2 = new Complex(4.0, -5.0);

        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);

        complex3 = Complex.add(complex1, complex2);
        System.out.println("Addition: " + complex3);

        complex3 = Complex.subtract(complex1, complex2);
        System.out.println("Subtraction: " + complex3);

        complex3 = Complex.multiply(complex1, complex2);
        System.out.println("Multiplication: " + complex3);

        complex3 = Complex.divide(complex1, complex2);
        System.out.println("Division: " + complex3);
    }

}

