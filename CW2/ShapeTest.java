import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(10));
        shapes.add(new Circle(1));
        shapes.add(new Triangle(3, 5, 7));
        shapes.add(new Rectangle(3, 5));
        for(Shape s : shapes) {
            System.out.println(s);
        }
        for(Shape s : shapes) {
            s.grow();
        }
        for(Shape s : shapes) {
            System.out.println(s);
        }
    }
}

class Circle extends Shape {
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

class Rectangle extends Shape {
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

class Triangle extends Shape {
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

class Shape {
    protected String color;
    public Shape() {
        color = "Black";
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public void grow() {

    }
}