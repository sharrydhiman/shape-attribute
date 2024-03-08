// Circle.java

import java.util.Scanner;

public class Circle extends Shape implements Volume {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateShape() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of the circle: " + perimeter);
    }

    @Override
    public void calculateVolume() {
        // Not applicable for a 2D shape
        System.out.println("Volume calculation not applicable for a 2D shape.");
    }

    public static void calculateAndDisplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        circle.showShape("Circle");
        circle.calculateShape();
        circle.calculatePerimeter();

        scanner.close();
    }
}
