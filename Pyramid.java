// Pyramid.java

import java.util.Scanner;

public class Pyramid extends Shape implements Volume {
    private double baseLength;
    private double baseWidth;
    private double height;

    public Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public void calculateShape() {
        // Surface area of a pyramid
        double area = baseLength * baseWidth + baseLength * Math.sqrt(Math.pow(baseWidth / 2, 2) + Math.pow(height, 2))
                + baseWidth * Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(height, 2));
        System.out.println("Surface area of the pyramid: " + area);
    }

    @Override
    public void calculatePerimeter() {
        // Not applicable for a 3D shape
        System.out.println("Perimeter calculation not applicable for a 3D shape.");
    }

    @Override
    public void calculateVolume() {
        double volume = (1.0 / 3.0) * baseLength * baseWidth * height;
        System.out.println("Volume of the pyramid: " + volume);
    }

    public static void calculateAndDisplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base length of the pyramid: ");
        double baseLength = scanner.nextDouble();
        System.out.println("Enter the base width of the pyramid: ");
        double baseWidth = scanner.nextDouble();
        System.out.println("Enter the height of the pyramid: ");
        double height = scanner.nextDouble();

        Pyramid pyramid = new Pyramid(baseLength, baseWidth, height);
        pyramid.showShape("Pyramid");
        pyramid.calculateShape();
        pyramid.calculateVolume();

        scanner.close();
    }
}
