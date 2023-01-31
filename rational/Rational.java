package exercises.rational;

public class Rational {

    private int numerator;
    private int denominator;

    // Constructors
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        this.normalize();
        this.reduce();
    }

    // Getters and Setters
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // Operations that can be performed with a rational numbers
    public void add(Rational valeu) {
        this.numerator = (valeu.numerator * this.denominator) + (this.numerator * valeu.denominator);
        this.denominator = this.denominator * valeu.denominator;
        normalize();
        reduce();
    }

    public void subtract(Rational valeu) {
        this.numerator = (valeu.numerator * this.denominator) - (this.numerator * valeu.denominator);
        this.denominator = this.denominator * valeu.denominator;
        normalize();
        reduce();
    }

    public void multiply(Rational valeu) {
        this.numerator = this.numerator * valeu.numerator;
        this.denominator = this.denominator * valeu.denominator;
        normalize();
        reduce();
    }

    public void divide(Rational valeu) {
        this.numerator = this.numerator * valeu.denominator;
        this.denominator = this.denominator * valeu.numerator;
        normalize();
        reduce();
    }

    // Helper functions
    // Checks if both the numerator and denominator are negative; if so, make both
    // positive.
    private void reduce() {
        int a = numerator;
        int b = denominator;

        while (b != 0) {
            int reduce = a % b;
            a = b;
            b = reduce;
        }
        numerator = numerator / a;
        denominator = denominator / a;
    }

    // Normalize the greatest common factor between the numerator and denominator
    private void normalize() {
        if (denominator < 0) {
            numerator = numerator * -1;
            denominator = denominator * -1;
        }
    }

    public String toString() {
        return Integer.toString(this.numerator) + "/" + Integer.toString(this.denominator);
    }
}
