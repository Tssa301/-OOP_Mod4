package exercises.complexNumber;

public class ProgramCompNumber {

    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber c2 = new ComplexNumber(-4.0, 5.0);

        System.out.println("Complex Number: (" + c1.getRealNumber()
                + " + " + c1.getImaginaryNumber()
                + "i)" + " + "
                + "(" + c2.getRealNumber()
                + " + " + c2.getImaginaryNumber() + "i)");
        ComplexNumber sum = ComplexNumber.sum(c1, c2);
        System.out.println("Sum: (" + sum.getRealNumber() + " " + sum.getImaginaryNumber() + "i)");

        System.out.println("Complex Number: (" + c1.getRealNumber()
                + " + " + c1.getImaginaryNumber()
                + "i)" + " - "
                + "(" + c2.getRealNumber()
                + " + " + c2.getImaginaryNumber() + "i)");
        ComplexNumber sub = ComplexNumber.subtract(c1, c2);
        System.out.println("New complex number: (" + sub.getRealNumber() + " " + sub.getImaginaryNumber() + "i)");

    }
}
