package shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Planar shape that has straight edges and angles. Can have any number of edges
 * and must have an equal number of angles. Angles must add up to 360 degrees.
 */
public abstract class Polygon extends Shape {

    protected List<Double> sides;
    protected List<Double> angles;

    /**
     * Construct a polygon object using the given sides and angles.
     */
    public Polygon(Double[] sides, Double[] angles) {
        this.sides = Arrays.asList(sides);
        this.angles = Arrays.asList(angles);
    }

    public Polygon(Double[] sides) {
        double angle = 360 / sides.length;
        angles = new ArrayList<Double>();
        for (int i = 0; i < sides.length; i++) {
            angles.add(angle);
        }
        this.sides = Arrays.asList(sides);
    }

    protected String listSides() {
        StringBuilder sb = new StringBuilder();
        for (double side : sides) {
            sb.append(String.format("%.1f,", side));
        }
        String sideList = sb.toString();
        return sideList.substring(0, sideList.length() - 1);
    }

    @Override
    public double computePerimeter() {
        double sum = 0;
        for (double side : sides) {
            sum += side;
        }
        return sum;
    }

}