package exercises;

import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String message;
        int totalCharacters = 0;
        char referenceChar;

        System.out.print("Enter your message: ");
        message = sc.nextLine();

        for (int i = 0; i < message.length(); i++) {

            referenceChar = message.charAt(i);
            if (referenceChar == ' ') {
                totalCharacters++;
            }
        }

        System.out.println("Total space characters found: " + totalCharacters);

        sc.close();
    }
}
