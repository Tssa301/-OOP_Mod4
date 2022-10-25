package exercises;

public class ConversionTable {

    public static void main(String args[]) {

        // Conversion from Inches to Meters
        int inch, row = 0;
        double meters;

        System.out.println("Metric Conversion:");
        for (inch = 1; inch <= 144; inch++) {
            meters = inch / 39.37; // convert to meters
            System.out.printf("\n%din Inch is - %.2fm meters.", inch, meters);
            row++;

            if (row == 12) { // every 12 line, prints a blank line.
                System.out.println();
                row = 0;
            }
        }
    }
}
