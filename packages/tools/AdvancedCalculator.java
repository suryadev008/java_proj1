package tools;

import java.lang.Math;

public class AdvancedCalculator {

    // Method for exponentiation (a raised to the power of b)
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Method for square root
    public double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot compute the square root of a negative number");
        }
        return Math.sqrt(a);
    }

    // Method for modulus (remainder of division)
    public int modulus(int a, int b) {
        return a % b;
    }

    // Method for trigonometric sine function (in radians)
    public double sine(double angle) {
        return Math.sin(angle);
    }

    // Method for trigonometric cosine function (in radians)
    public double cosine(double angle) {
        return Math.cos(angle);
    }

    // Method for trigonometric tangent function (in radians)
    public double tangent(double angle) {
        return Math.tan(angle);
    }

    // Method for logarithm (natural log)
    public double log(double a) {
        if (a <= 0) {
            throw new ArithmeticException("Logarithm undefined for zero or negative numbers");
        }
        return Math.log(a); // Natural log (base e)
    }

    // Method for factorial (only for non-negative integers)
    public long factorial(int a) {
        if (a < 0) {
            throw new ArithmeticException("Factorial is not defined for negative numbers");
        }
        long result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    // Method for converting degrees to radians
    public double degreesToRadians(double degrees) {
        return Math.toRadians(degrees);
    }

    // Method for converting radians to degrees
    public double radiansToDegrees(double radians) {
        return Math.toDegrees(radians);
    }
}
