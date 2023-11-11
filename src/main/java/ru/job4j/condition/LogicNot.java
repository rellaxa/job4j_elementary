package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean rsl = isEven(10);
        System.out.println("10 is even : " + rsl);
        rsl = isPositive(3);
        System.out.println("3 is positive : " + rsl);
        rsl = notEven(10);
        System.out.println("10 not even : " + rsl);
        rsl = notPositive(3);
        System.out.println("3 not positive : " + rsl);
        rsl = notEvenAndPositive(7);
        System.out.println("7 not even and positive : " + rsl);
        rsl = evenOrNotPositive(10);
        System.out.println("10 even or not positive : " + rsl);
    }
}
