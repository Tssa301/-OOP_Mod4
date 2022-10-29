package exercises;

import java.util.Scanner;

public class UpperLowercase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String message;
        int totalCharChanged = 0;
        char ch;

        System.out.print("Enter your message in Uppercase/Lowercase: ");
        message = sc.nextLine();

        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);

            if (ch > 64 && ch < 91) { // for lowercase
                ch += 32;
                totalCharChanged++;
                System.out.print(ch);
            } else if (ch > 96 && ch < 123) { // for uppercase
                ch -= 32;
                totalCharChanged++;
                System.out.print(ch);
            } else if (ch == 32) { // Don't count the space character.
                System.out.print(" ");
            }

            if (ch == '.') { // The program ends when it encounters the '.' character.
                System.out.print(ch);
                break;
            } else {
                continue;
            }
        }

        System.out.println("\nTotal changes made: " + totalCharChanged);

        sc.close();
    }
}