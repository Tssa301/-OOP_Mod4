package exercises;

import java.util.Scanner;

public class Candy {

    public static void candyCalculator(int credits) {
        int gumPrice = 3;
        int chocolateBarPrice = 5;
        int chocolates = credits / chocolateBarPrice;
        int change = credits % chocolateBarPrice;
        int gums = 0;

        // Check and print how many chocolates and how many gums have been purchased.
        if (change >= gumPrice) {
            gums = change / gumPrice;
            change = change % gumPrice;
            System.out.println(chocolates + " Chocolate(s) " + gums + " Gum(s) " + change + " Change");
        } else {
            System.out.println(chocolates + " Chocolate(s) " + change + " Change");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many credits do you have? ");
        int credits = sc.nextInt();

        candyCalculator(credits);

        sc.close();

    }
}
