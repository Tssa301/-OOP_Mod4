package exercises;

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word or phrase you want to check:  ");
        String value = sc.nextLine();

        System.out.print("\nIs the word or phrase a palindrome? " + isPalindrome(value));

        sc.close();

    }

    public static boolean isPalindrome(String value) {
        value = value.toLowerCase().replaceAll("\\s", "");
        int firstLetter = 0, lastLetter = value.length() - 1;

        // Checking if the first letter is the same as the last letter.
        for (firstLetter = 0; firstLetter < value.length() / 2; firstLetter++) {

            if (value.charAt(firstLetter) != value.charAt(lastLetter - firstLetter)) {
                return false;
            }
        }
        return true;
    }
}
