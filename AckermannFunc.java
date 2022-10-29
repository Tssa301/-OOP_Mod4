package exercises;

import java.util.Scanner;

public class AckermannFunc {

    /*
     * Ackermann function
     * y + 1 -------------------> if x == 0;
     * A(x,y) = A(x - 1, 1) -------------> if x > 0 and y == 0;
     * A(x - 1, A(x, y - 1)) ---> if x > 0 and y > 0;
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.printf("Enter the value of x: ");
        x = sc.nextInt();

        System.out.printf("Enter the value of y: ");
        y = sc.nextInt();

        System.out.printf("The values of A(x,y) is = %d", ack(x, y));

        sc.close();
    }

    private static int ack(int x, int y) {
        if (x == 0) {
            return y + 1;
        } else if (x > 0 && y == 0) {
            return ack(x - 1, 1);
        } else if (x > 0 && y > 0) {
            return ack(x - 1, ack(x, y - 1));
        }
        return 0;
    }
}
