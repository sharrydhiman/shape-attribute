# Shape Calculator

## Description
This Java program allows users to calculate the area, perimeter, and volume of various geometric shapes, including Circle, Rectangle, Square, Sphere, Cylinder, and Pyramid. It provides a menu-driven interface for users to choose a shape, input dimensions, and receive the calculated results.

## File Structure

- `Main.java`: Main program that handles user input and shape selection.
- `Shape.java`: Abstract class for common shape properties and abstract methods for area and perimeter calculations.
- `Volume.java`: Interface for shapes with volume calculation.
- `Circle.java`, `Rectangle.java`, `Square.java`, `Sphere.java`, `Cylinder.java`, `Pyramid.java`: Classes for each specific shape, including their calculations and user input.

## How to Run

1. Compile the program:
    ```bash
    javac Main.java
    ```

2. Run the compiled program:
    ```bash
    java Main
    ```

3. Follow the on-screen prompts to choose a shape and input dimensions.

## Example Usage
Choose a shape (Circle, Rectangle, Square, Sphere, Cylinder, Pyramid):
circle
Enter the radius of the circle:
5
Selected shape: Circle
Area of the circle: 78.53981633974483
Perimeter of the circle: 31.41592653589793
Do you want to calculate another shape? (yes/no):
no
