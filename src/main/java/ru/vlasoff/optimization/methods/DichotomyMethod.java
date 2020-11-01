package ru.vlasoff.optimization.methods;

import static ru.vlasoff.optimization.methods.MethodUtils.*;

public class DichotomyMethod {

    private final double EPSILON = 0.1;

    private void bisection(double a, double b) {

        int i = 0;
        double c = a;
        while ((b - a) >= EPSILON) {
            c = (a + b) / 2;

            if (func(c) == 0.0)
                break;

            else if (func(c) * func(a) < 0)
                b = c;
            else
                a = c;
            i++;
        }
        System.out.println("Итераций: " + i);
        System.out.printf("%.4f", c);
        System.out.println();
        System.out.println("F(x): " + func(c));
    }

    public void run() {
        double a = -1;
        double b = 0;
        bisection(a, b);
    }
}
