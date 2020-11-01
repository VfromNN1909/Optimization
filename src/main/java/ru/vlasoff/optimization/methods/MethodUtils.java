package ru.vlasoff.optimization.methods;

public class MethodUtils {

    public static final double e = 0.1;
    public static final double a = -1.5;
    public static final double b = 0;

    public static double func(double x) {
        return Math.sqrt(x + 2) + x * x + 1;
    }
}
