package exercises.circle;

import java.util.Scanner;

public class ProgramCircle {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);

        double area = circle.area();
        System.out.printf("Circle area = %.2f", area);

        double peri = circle.perimeter();
        System.out.printf("\nCircle perimeter = %.2f", peri);

        sc.close();
    }
}
