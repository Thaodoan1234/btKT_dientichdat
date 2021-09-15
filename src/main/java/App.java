import entities.*;
import entities.Rectangle;
import entities.Shape;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        int n = 10;
        entities.Shape[] list = new entities.Shape[n];
        for (int i=0; i<n; i++) {
            int type = random(0, 4);
            list[i] = createShape(type);
            list[i].fromConsole();
        }

        double total = 0;
        for (int i=0;i<n;i++) {
            total += list[i].calculateArea();
        }
        
        int princePerunit = 1000;
        System.out.format("total = %d\n", total * princePerunit);

    }

    private static int random(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min) +min);
    }

    private static Shape createShape(int type) {
        switch (type) {
            case 1:
                return new Square();
            case 2:
                return new Rectangle();
            case 3:
                return new Circle();
            case 4:
                return new Triange();
            default:
                return null;
        }
    }
}
