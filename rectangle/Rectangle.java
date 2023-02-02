package exercises.rectangle;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle() {
        this(2, 1);
    }

    public Rectangle(int width, int height) {
        this.width = Math.abs(width);
        this.height = Math.abs(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Methods
    public boolean isSquare() {
        return width == height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void rotate() {
        int valueWidth = width;
        width = height;
        height = valueWidth;
    }
}
