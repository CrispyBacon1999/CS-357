package shape;

public abstract class FourSidedShape extends Shape {
	
	protected double side1, side2, side3, side4;
	
	@Override
	public double computePerimeter() {
		return side1 + side2 + side3 + side4;
	}
	
	
	public String toString() {
		return String.format("%s(%.2f, %.2f, %.2f, %.2f), Area: %.3f, Perimeter: %.3f", this.getClass().getSimpleName(),
				side1, side2, side3, side4,
				computeArea(), computePerimeter()
				);
	}
	
}
