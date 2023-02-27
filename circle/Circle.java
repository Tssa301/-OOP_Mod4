package exercises.circle;

public class Circle extends TwoDShape{

    public static final double PI = 3.14159;
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double base, double height, double radius) {
        super(base, height);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return PI * radius * radius;
    }

    public double perimeter(){
        return 2.0 * PI * radius;
    }
}
