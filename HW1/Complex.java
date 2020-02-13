public class Complex implements Cloneable, Comparable<Complex> {

    private double a;
    private double b;

    /**
     * Create a complex number with the real and imaginary values set to 0
     */
    public Complex() {
        a = 0;
        b = 0;
    }

    /**
     * Create a complex number with <code>a</code> as the given value and
     * <code>b</code> as 0
     * 
     * @param a The real component of the number
     */
    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    /**
     * Create a complex number with the given a and b values
     * 
     * @param a The real component of the number
     * @param b The imaginary component of the number
     */
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Adds another complex number and returns the result.
     * 
     * @param other The other complex number to add to this one
     * @return The sum of the two complex numbers
     */
    public Complex add(Complex other) {
        return new Complex(a + other.a, b + other.b);
    }

    /**
     * Subtracts another complex number and returns the result.
     * 
     * @param other The other complex number to subtract from this one
     * @return The difference of the two complex numbers
     */
    public Complex subtract(Complex other) {
        return new Complex(a - other.a, b - other.b);
    }

    /**
     * Multiplies another complex number and returns the result.
     * 
     * @param other The other complex number to multiply to this one
     * @return The product of the two complex numbers
     */
    public Complex multiply(Complex other) {
        return new Complex(a * other.a - b * other.b, b * other.a + a * other.b);
    }

    /**
     * Divides another complex number and returns the result.
     * 
     * @param other The other complex number to multiply to this one
     * @return The product of the two complex numbers
     */
    public Complex divide(Complex other) {
        double denom = Math.pow(other.a, 2) + Math.pow(other.b, 2);
        return new Complex((a * other.a + b * other.b) / denom, (b * other.a - a * other.b) / denom);
    }

    /**
     * Gives the absolute value of the complex number.
     * 
     * @return Absolute value of the number
     */
    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    /**
     * Clones the object to give a deep copy of all the data stored.
     */
    public Object clone() {
        return new Complex(a, b);
    }

    /**
     * Gives the string representation of the complex number using the format
     * <code>a + bi</code>. If the imaginary portion of the number is 0, it will
     * simply be ignored and will simply be output as <code>a</code>.
     */
    public String toString() {
        if (b == 0) {
            return Double.toString(a);
        }
        return String.format("%6.2f + %6.2fi", a, b);
    }

    /**
     * Compares the magnitudes of the complex numbers and returns the sign of the
     * number based off which is larger.
     * 
     * @return <code>0</code> if this value is equal to <code>o</code>, A negative
     *         number if this value is smaller than <code>o</code> , and a positive
     *         number if this value is greater than <code>o</code>
     */
    @Override
    public int compareTo(Complex o) {
        return Double.compare(abs(), o.abs());
    }

    /**
     * Gives the real portion of the complex number.
     * 
     * @return the <code>a</code> portion of <code>a + bi</code>
     */
    public double getRealPart() {
        return a;
    }

    /**
     * Gives the imaginary portion of the complex number.
     * 
     * @return the <code>b</code> portion of <code>a + bi</code>
     */
    public double getImaginaryPart() {
        return b;
    }

}