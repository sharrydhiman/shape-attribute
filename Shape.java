// Shape.java

public abstract class Shape {
    public void showShape(String shape) {
        System.out.println("Selected shape: " + shape);
    }

    public abstract void calculateShape();

    public abstract void calculatePerimeter();
}
