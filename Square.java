// Square.java

import java.util.Scanner;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public static void calculateAndDisplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        Square square = new Square(side);
        square.showShape("Square");
        square.calculateShape();
        square.calculatePerimeter();

        scanner.close();
    }
}
