package exercises.rational;

public class ProgramRational {

    public static void main(String[] args) {

        Rational r1 = new Rational(1, -2);
        Rational r2 = new Rational(-3, -1);
        Rational r3 = new Rational(1, 3);
        Rational r4 = new Rational(1, 10);
        Rational r5 = new Rational(1, 2);
        Rational r6 = new Rational(1, 2);
        Rational r7 = new Rational(7, 12);
        Rational r8 = new Rational(1, 3);
        Rational r9 = new Rational(7, 12);
        Rational r10 = new Rational(3, 7);
        Rational r11 = new Rational(7, 12);
        Rational r12 = new Rational(7, 6);
        Rational r13 = new Rational(7, 12);
        Rational r14 = new Rational(-7, 6);

        System.out.println("--------------r1-------------------");
        System.out.println("r1 = " + r1.toString());

        System.out.println("\n--------------r2-----------------");
        System.out.println("r2 = " + r2.toString());
        System.out.println("r2 = " + r2.getNumerator() + "/" + r2.getDenominator());

        System.out.println("\n--------------r3-----------------");
        System.out.println("r3 = " + r3.toString());
        System.out.print("r1 = (" + r3.toString() + ") + (" + r1.toString() + ") = ");

        System.out.println("\n\n-------------add-----------------");
        System.out.print("r1(" + r1.toString() + ") + r3(" + r3.toString() + ") = ");
        r1.add(r3);
        System.out.print(r1.toString());
        System.out.print("\nr1(" + r1.toString() + ") + r4(" + r4.toString() + ") = ");
        r1.add(r4);
        System.out.print(r1.toString());

        System.out.println("\n\n-------------sub-----------------");
        System.out.print("r5(" + r5.toString() + ") - r6(" + r6.toString() + ") = ");
        r5.subtract(r6);
        System.out.print(r5.toString());
        System.out.print("\nr7(" + r7.toString() + ") - r8(" + r8.toString() + ") = ");
        r7.subtract(r8);
        System.out.print(r7.toString());

        System.out.println("\n\n-------------multi-----------------");
        System.out.print("r9(" + r9.toString() + ") * r10(" + r10.toString() + ") = ");
        r9.multiply(r10);
        System.out.print(r9.toString());

        System.out.println("\n\n-------------div-----------------");
        System.out.print("r11(" + r9.toString() + ") / r12(" + r10.toString() + ") = ");
        r11.divide(r12);
        System.out.print(r11.toString());
        System.out.print("\nr13(" + r13.toString() + ") / r14(" + r14.toString() + ") = ");
        r13.divide(r14);
        System.out.print(r13.toString());

    }

}
