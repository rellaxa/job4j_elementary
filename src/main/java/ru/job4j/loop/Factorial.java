package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int fact = 1; fact <= n; fact++) {
            result = result * fact;
        }
        return result;
    }
}