package shape;

public class Rectangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private double side4;

    public Rectangle(double width, double height) {
        side1 = width;
        side2 = height;
        side3 = side1;
        side4 = side2;
    }

    public Rectangle(double width, double height, String color) {
        this(width, height);
        this.color = color;
    }

    @Override
    /**
     * Calculates the area of a rectangle
     */
    public double getArea() {
        return side1 * side2;
    }

    @Override
    /**
     * Calculates the perimeter of a rectangle
     */
    public double getPerimeter() {
        return side1 + side2 + side3 + side4;
    }

    /**
     * Grows the object by 10% on each side length
     */
    public void grow() {
        side1 *= 1.1;
        side2 *= 1.1;
    }

    /**
     * Gives a string representation of a rectangle object
     */
    public String toString() {
        return String.format("Rectangle(Color: %s, Sides: %.2f:%.2f:%.2f:%.2f, Area: %.2f, Perimeter: %.2f)", 
            color, side1, side2, side3, side4, getArea(), getPerimeter()
        );
    }
}