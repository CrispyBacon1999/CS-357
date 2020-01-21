package shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this(radius);
        this.color = color;
    }

    @Override
    /**
     * Calculates the area of a circle
     */
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    /**
     * Calcules the perimeter of a circle
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Grows the object by 10% on each side length
     */
    public void grow() {
        radius *= 1.1;
    }

    /**
     * Gives the string representation of the given circle object 
     */
    public String toString() {
        return String.format("Circle(Color: %s, Radius: %.2f, Area: %.2f, Perimeter: %.2f)", 
            color, radius, getArea(), getPerimeter()
        );
    }
}