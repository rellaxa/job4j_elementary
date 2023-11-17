package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int fact = 2; fact <= n; fact++) {
            result *= fact;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
    }
}