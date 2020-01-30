public class Math {
    public static void main(String[] args) {
        System.out.println(finallyTest());
        int num1 = 5, num2 = 0;
        System.out.println(add(num1, num2));
        System.out.println(sub(num1, num2));
        System.out.println(mul(num1, num2));
        System.out.println(div(num1, num2));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static double div(int x, int y) {
        if(y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    public static int finallyTest() {
        try {
            return 1;
        } catch (Exception e) {
            return 0;
        }
        finally {
            System.out.println("This calls, even with the returns coming before it");
        }
    }
}