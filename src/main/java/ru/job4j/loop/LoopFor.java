package ru.job4j.loop;

public class LoopFor {
    public static void main(String[] args) {
        int index = 10;

        System.out.println("Использование префиксной формы записи!");
        System.out.println("Результат вычисления: " + ++index);
        System.out.println("Значение переменной: " + index);
        System.out.println();
        System.out.println("Использование постфиксной формы записи!");
        System.out.println("Результат вычисления: " + index++);
        System.out.println("Значение переменной: " + index);
    }
}