public class MathUtil {

    private MathUtil() {
        throw new UnsupportedOperationException("Cannot call constructor directly");
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException("Cannot divide by zero(0)");
        else
            return dividend / divisor;
    }

    public static int add(int a, int b) {
        return a + b;
    }
}