package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right  ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        return max(first,
                max(second, third));
    }

    public static int max(int first, int second, int third, int forth) {
        return max(first,
                max(second, third, forth));
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max(2, 4, 8));
        System.out.println(max(3, 6, 12, 24));
    }
}
