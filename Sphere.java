// Sphere.java

import java.util.Scanner;

public class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateShape() {
        // Surface area of a sphere
        double area = 4 * Math.PI * radius * radius;
        System.out.println("Surface area of the sphere: " + area);
    }

    @Override
    public void calculatePerimeter() {
        // Not applicable for a 3D shape
        System.out.println("Perimeter calculation not applicable for a 3D shape.");
    }

    @Override
    public void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere: " + volume);
    }

    public static void calculateAndDisplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        Sphere sphere = new Sphere(radius);
        sphere.showShape("Sphere");
        sphere.calculateShape();
        sphere.calculateVolume();

        scanner.close();
    }
}
