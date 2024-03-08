// Rectangle.java

import java.util.Scanner;

public class Rectangle extends Shape implements Volume {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateShape() {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    @Override
    public void calculateVolume() {
        // Not applicable for a 2D shape
        System.out.println("Volume calculation not applicable for a 2D shape.");
    }

    public static void calculateAndDisplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        rectangle.showShape("Rectangle");
        rectangle.calculateShape();
        rectangle.calculatePerimeter();

        scanner.close();
    }
}
