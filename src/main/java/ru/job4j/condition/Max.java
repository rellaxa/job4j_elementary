package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right  ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int rsl = max(1, 2);
        System.out.println(rsl);
        rsl = max(10, 3);
        System.out.println(rsl);
        rsl = max(999, 999);
        System.out.println(rsl);
    }
}
