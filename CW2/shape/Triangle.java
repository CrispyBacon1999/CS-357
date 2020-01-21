package shape;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color) {
        this(side1, side2, side3);
        this.color = color;
    }

    @Override
    /**
     * Calculates the area of a triangle
     */
    public double getArea() {
        double s = .5 * (side1 + side2 + side3);
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    /**
     * Calculates the perimeter of a triangle
     */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * Grows the object by 10% on each side length
     */
    public void grow() {
        side1 *= 1.1;
        side2 *= 1.1;
        side3 *= 1.1;
    }

    /**
     * Gives a string representation of a triangle object
     */
    public String toString() {
        return String.format("Triangle(Color: %s, Sides: %.2f:%.2f:%.2f, Area: %.2f, Perimeter: %.2f)", 
            color, side1, side2, side3, getArea(), getPerimeter()
        );
    }
}