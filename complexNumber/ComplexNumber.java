package exercises.complexNumber;

public class ComplexNumber {

    private double realNumber;
    private double imaginaryNumber;

    public ComplexNumber() {
    }

    public ComplexNumber(double realNumber, double imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public double getRealNumber() {
        return realNumber;
    }

    public void setRealNumber(double realNumber) {
        this.realNumber = realNumber;
    }

    public double getImaginaryNumber() {
        return imaginaryNumber;
    }

    public void setImaginaryNumber(double imaginaryNumber) {
        this.imaginaryNumber = imaginaryNumber;
    }

    // methods sum and subtraction
    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        double newReal = c1.realNumber + c2.realNumber;
        double newImaginary = c1.imaginaryNumber + c2.imaginaryNumber;

        return new ComplexNumber(newReal, newImaginary);
    }

    public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {
        double newReal = c1.realNumber - c2.realNumber;
        double newImaginary = c1.imaginaryNumber - c2.imaginaryNumber;

        return new ComplexNumber(newReal, newImaginary);
    }
}
