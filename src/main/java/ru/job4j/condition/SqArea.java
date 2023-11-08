package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double rsl1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real s = " + rsl1);
        double rsl2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2  real s = " + rsl2);
        double rsl3 = SqArea.square(10, 8.5);
        System.out.println(" p = 10, k = 8.5, s = 2.39  real s = " + rsl3);
    }
}
