package ru.vlasoff.optimization.methods;

public class MethodUtils {

    // точность
    public static final double e = 0.1;
    // левая граница
    public static final double a = -1.5;
    // правая граница
    public static final double b = 0;

    // функция
    public static double func(double x) {
        return Math.sqrt(x + 2) + x * x + 1;
    }
}
