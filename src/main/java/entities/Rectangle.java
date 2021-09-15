package entities;

public class Rectangle extends Shape {
    private Point topLeft;
    private int width, height;

    public Rectangle() {
    }

    public Rectangle(Point topLeft, int width, int height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public void fromConsole() {

    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}
