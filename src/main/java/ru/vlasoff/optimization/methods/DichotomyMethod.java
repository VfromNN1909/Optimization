package ru.vlasoff.optimization.methods;

import static ru.vlasoff.optimization.methods.MethodUtils.func;
import static ru.vlasoff.optimization.methods.MethodUtils.e;

public class DichotomyMethod {

    private void bisection(double a, double b) {

        double c = a;
        while ((b - a) >= e) {
            c = (a + b) / 2;

            if (func(c) == 0.0)
                break;

            else if (func(c) * func(a) < 0)
                b = c;
            else
                a = c;
        }
        System.out.printf("x: %.4f", c);
        System.out.println();
        System.out.printf("F(x): %.4f\n", func(c));
    }

    public void run() {
        double a = -1;
        double b = 0;
        bisection(a, b);
    }
}
