package entities;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private Point center;
    private int radius;

    public Circle() {
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void fromConsole(){
    }

    @Override
    public double calculateArea() {
        return PI * this.radius * this.radius;
    }

}
