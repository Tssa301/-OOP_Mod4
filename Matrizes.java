package exercises;

import java.util.Arrays;

public class Matrizes {

    public static void main(String[] args) {

        double[] dNums = { 8.0, 4.0, 10.0, 14.0 };
        System.out.print("Matrix values: " + Arrays.toString(dNums));

        double avg = mediaArray(dNums);
        System.out.printf("Average = %.2f%n", avg);

        System.out.println("\n--------------------------------------------------------");

        int[] iNums = { 8, 4, 10, 14, };
        System.out.print("\nMatrix values: " + Arrays.toString(iNums));

        int[] minMaxArray = minMax(iNums);
        for (int obj : minMaxArray) {
            System.out.print("\nValue: " + obj);
        }
    }

    public static double mediaArray(double[] dNums) {

        double sum = 0.0;
        for (int i = 0; i < dNums.length; i++) {
            sum += dNums[i];
        }

        double avg = sum / dNums.length;

        System.out.printf("\nSum = %.2f%n", sum);

        return avg;
    }

    public static int[] minMax(int[] iNums) {

        int[] minMaxArray = new int[2];

        int minimum = iNums[0];
        int maximum = iNums[0];

        for (int i = 1; i < iNums.length; i++) {

            if (iNums[i] < minimum) {
                minimum = iNums[i];
                minMaxArray[0] = minimum;
            } else if (iNums[i] > maximum) {
                maximum = iNums[i];
                minMaxArray[1] = maximum;
            }
        }

        return minMaxArray;
    }
}
