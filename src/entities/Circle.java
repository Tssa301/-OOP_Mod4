package entities;

public class Circle extends Figure  implements TwoDFigure, CircularFigure{

        /*
        Circle Area formula => (A = PI * r * r)
        Circle Perimeter formula => (P = 2 * PI * r)
     */

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    public void setRadius(Double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
