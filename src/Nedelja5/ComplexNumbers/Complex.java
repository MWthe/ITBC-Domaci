package Nedelja5.ComplexNumbers;

public class Complex {
    double real;
    double imag;



    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    static Complex add(Complex number1, Complex number2) {
        Complex complexAddition = new Complex(0, 0);
        complexAddition.real = number1.real + number2.real;
        complexAddition.imag = number1.imag + number2.imag;

        return complexAddition;
    }

    static Complex subtract(Complex number1, Complex number2) {
        Complex complexSubratction = new Complex(0, 0);
        complexSubratction.real = number1.real + number2.real;
        complexSubratction.imag = number1.imag - number2.imag;
        return complexSubratction;
    }

    static Complex multiply(Complex number1, Complex number2) {
        Complex complexMultiplication = new Complex(0, 0);
        complexMultiplication.real = number1.real * number2.real - number1.imag * number2.imag;
        complexMultiplication.imag = number1.real * number2.imag + number1.imag * number2.real;
        return complexMultiplication;
    }

    static Complex divide(Complex number1, Complex number2) {
        Complex complexDivision = new Complex(0, 0);

        complexDivision.real = (number1.real * number2.real + number1.imag * number2.imag) / (Math.pow(number2.real, 2) + Math.pow(number2.imag, 2));
        complexDivision.imag = (number1.imag * number2.real - number1.real * number2.imag) / (Math.pow(number2.real, 2) + Math.pow(number2.imag, 2));

        return complexDivision;
    }

    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }
}
