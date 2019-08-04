package junit;

public class SimpleCalculator {

    public static double divideNumbers(double dividend, double divisor) {
        if (divisor != 0) {
            return dividend / divisor;
        }
        throw new ArithmeticException("Can not divide by zero!");
    }
}
