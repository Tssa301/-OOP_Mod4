package entities;

public class Sphere extends Figure implements ThreeDFigure, CircularFigure{

    /*
        Sphere Area formula => (Ae = 4 * PI * r * r)
        Sphere volume formula => (V = 4 * PI * r * r * r / 3)
     */

    private Double radius;

    public Sphere(Double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return 4 * Math.PI * radius * radius * radius / 3;
    }
}
