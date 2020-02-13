import java.util.*;

public class ComplexTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Number 1 Real: ");
        double a = s.nextDouble();
        System.out.print("Number 1 Imaginary: ");
        double b = s.nextDouble();
        System.out.print("Number 2 Real: ");
        double c = s.nextDouble();
        System.out.print("Number 2 Imaginary: ");
        double d = s.nextDouble();
        s.close();

        // Create complex number objects
        Complex c1 = new Complex(a, b);
        Complex c2 = new Complex(c, d);

        // Pick the larger and smaller of the numbers
        Complex larger = c1.compareTo(c2) > 0 ? c1 : c2;
        Complex smaller = c1.compareTo(c2) >= 0 ? c2 : c1;

        // Perform operations
        System.out.println(larger.add(smaller));
        System.out.println(larger.subtract(smaller));
        System.out.println(larger.multiply(smaller));
        System.out.println(larger.divide(smaller));
        System.out.println(larger.abs());
    }
}