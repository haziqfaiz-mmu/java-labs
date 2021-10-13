import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
    private double width = 1, height = 1;
    public Rectangle() { }
    public Rectangle(double width, double height) {
        setWidth (width);
        setHeight (height);
    }

    public void setWidth (double width) {
        if (width<=0) throw new IllegalArgumentException();
        this.width = width;
    }

    public void setHeight (double height) {
        if (height<=0) throw new IllegalArgumentException();
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

