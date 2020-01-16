package shape;
public class Rectangle extends FourSidedShape {

	public Rectangle(double width, double height) {
		this.side1 = width;
		this.side3 = width;
		this.side2 = height;
		this.side4 = height;
	}
	
	@Override
	public double computeArea() {
		return side1 * side2;
	}

}
