package entities;

public class Square extends Shape {
    private Point topLeft;
    private int width;

    public Square() {
    }

    public Square(Point topLeft, int width) {
        this.topLeft = topLeft;
        this.width = width;
    }

    @Override
    public void fromConsole() {

    }

    @Override
    public double calculateArea() {
        return this.width * this.width;
    }
}
