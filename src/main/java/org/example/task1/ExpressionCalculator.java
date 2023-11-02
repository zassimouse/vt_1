package org.example.task1;

public class ExpressionCalculator {

    public static double calculateExpression(float x, float y) {

        double divisor = 1 + Math.pow(Math.sin(x + y), 2);
        double divider = 2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2) ) ) ;
        return  divisor / divider + x;
    }
}
