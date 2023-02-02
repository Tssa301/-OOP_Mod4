package exercises.rectangle;

public class ProgramRectangle {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(-4, 7);

        System.out.println("Is square? " + rectangle1.isSquare());
        System.out.println("Area = " + rectangle1.area());
        System.out.println("Perimeter = " + rectangle1.perimeter());

        System.out.println("\n");

        System.out.println("Is square? " + rectangle2.isSquare());
        System.out.println("Area = " + rectangle2.area());
        System.out.println("Perimeter = " + rectangle2.perimeter());
        System.out.println("Rectangle(" + rectangle2.getWidth() + "," + rectangle2.getHeight() + ")");
        rectangle2.rotate();
        System.out.println("Rotate rectangle(" + rectangle2.getWidth() + "," + rectangle2.getHeight() + ")");

    }
}
