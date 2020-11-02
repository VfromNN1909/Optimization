package ru.vlasoff.optimization.methods;

import static ru.vlasoff.optimization.methods.MethodUtils.e;
import static ru.vlasoff.optimization.methods.MethodUtils.func;

public class GoldenSectionMethod {

    private final double PHI = (1 + Math.sqrt(5)) / 2;

    private void findMin(double a, double b) {
        double x1, x2;
        while (Math.abs(b - a) > e) {
            x1 = b - (b - a) / PHI;
            x2 = a + (b - a) / PHI;
            if (func(x1) >= func(x2))
                a = x1;
            else
                b = x2;
        }
        System.out.printf("x: %.4f", (a + b) / 2);
        System.out.println();
        System.out.printf("F(x): %.4f", func((a + b) / 2));
    }

    public void run() {
        double a = -1;
        double b = 0;
        findMin(a, b);
    }
}
