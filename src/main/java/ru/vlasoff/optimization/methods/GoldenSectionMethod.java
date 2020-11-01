package ru.vlasoff.optimization.methods;

import static ru.vlasoff.optimization.methods.MethodUtils.*;

public class GoldenSectionMethod {

    private final double EPSILON = 0.1;
    private final double PHI = (1 + Math.sqrt(5)) / 2;



    private void findMin(double a, double b) {
        double x1, x2;
        int i = 0;
        while (Math.abs(b - a) > EPSILON) {
            x1 = b - (b - a) / PHI;
            x2 = a + (b - a) / PHI;
            if (func(x1) >= func(x2))
                a = x1;
            else
                b = x2;
            i++;
        }
        System.out.println("Итераций: " + i);
        System.out.printf("%.3f", (a + b) / 2);
        System.out.println();
        System.out.println("F(x): " + func((a + b) / 2));
    }

    public void run() {
        double a = -1;
        double b = 0;
        findMin(a, b);
    }
}
