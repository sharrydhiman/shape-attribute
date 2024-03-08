// Cylinder.java

import java.util.Scanner;

public class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void calculateShape() {
        // Surface area of a cylinder
        double area = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface area of the cylinder: " + area);
    }

    @Override
    public void calculatePerimeter() {
        // Not applicable for a 3D shape
        System.out.println("Perimeter calculation not applicable for a 3D shape.");
    }

    @Override
    public void calculateVolume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cylinder: " + volume);
    }

    public static void calculateAndDisplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);
        cylinder.showShape("Cylinder");
        cylinder.calculateShape();
        cylinder.calculateVolume();

        scanner.close();
    }
}
