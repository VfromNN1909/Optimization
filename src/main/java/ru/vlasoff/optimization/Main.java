package ru.vlasoff.optimization;

import ru.vlasoff.optimization.methods.DichotomyMethod;
import ru.vlasoff.optimization.methods.GoldenSectionMethod;

public class Main {
    public static void main(String[] args) {
        DichotomyMethod dichotomyMethod = new DichotomyMethod();
        System.out.println("Метод дихотомии: ");
        dichotomyMethod.run();
        GoldenSectionMethod goldenSectionMethod = new GoldenSectionMethod();
        System.out.println("Метод золотого сечения: ");
        goldenSectionMethod.run();

    }
}
