package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Collatz {

    /*
     * Given any integer, return an array with the series of Collatz
     * numbers (including the initial number in the first position),
     * and the remaining values of the array start with zero.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer number: ");
        int anyNumber = sc.nextInt();

        collatz(anyNumber);

        sc.close();

    }

    public static int[] collatz(int anyNumber) {
        int[] collatzList = new int[300];

        collatzList[0] = anyNumber;
        int result = 0;

        for (int i = 1; i < collatzList.length; i++) {

            if (anyNumber != 1) {

                if (anyNumber % 2 == 0) {
                    result = anyNumber / 2;
                } else {
                    result = anyNumber * 3 + 1;
                }
                anyNumber = result;
                collatzList[i] = result;
            }
        }

        System.out.print("\nCollatz list = ");
        System.out.println(Arrays.toString(collatzList));
        return null;
    }
}
