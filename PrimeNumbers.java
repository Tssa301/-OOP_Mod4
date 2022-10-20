package exercises;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        sieveEratosthenes(n);

        sc.close();
    }

    // Auxiliar function:
    public static void sieveEratosthenes(int n) {
        boolean[] numbers = new boolean[n + 1];

        for (int i = 2; i < numbers.length; i++) {
            if (!numbers[i]) {
                if (i != 2) {
                    System.out.print(", ");
                }
                System.out.print(i);
                for (int j = i * 2; j < numbers.length; j += i) {
                    numbers[j] = true;
                }
            }
        }
    }
}
