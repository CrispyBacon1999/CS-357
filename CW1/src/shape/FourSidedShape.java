package shape;

public abstract class FourSidedShape extends Polygon {

	public FourSidedShape(double side1, double side2, double side3, double side4) {
		super(new Double[] { side1, side2, side3, side4 });
	}

	public String toString() {
		return String.format("%s(%s), Area: %.3f, Perimeter: %.3f", this.getClass().getSimpleName(), listSides(),
				computeArea(), computePerimeter());
	}

}
