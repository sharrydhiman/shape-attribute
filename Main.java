import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shapeChoice;

        do {
            System.out.println("Choose a shape (Circle, Rectangle, Square, Sphere, Cylinder, Pyramid): ");
            shapeChoice = scanner.nextLine().toLowerCase();

            switch (shapeChoice) {
                case "circle":
                    Circle.calculateAndDisplay();
                    break;
                case "rectangle":
                    Rectangle.calculateAndDisplay();
                    break;
                case "square":
                    Square.calculateAndDisplay();
                    break;
                case "sphere":
                    Sphere.calculateAndDisplay();
                    break;
                case "cylinder":
                    Cylinder.calculateAndDisplay();
                    break;
                case "pyramid":
                    Pyramid.calculateAndDisplay();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println("Do you want to calculate another shape? (yes/no): ");
            scanner.nextLine();  // consume the newline character

        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        scanner.close();
    }
}
