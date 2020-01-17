package shape;

public class Rectangle extends FourSidedShape {

	public Rectangle(double width, double height) {
		super(width, height, width, height);
	}

	@Override
	public double computeArea() {
		return sides.get(0) * sides.get(1);
	}

}
