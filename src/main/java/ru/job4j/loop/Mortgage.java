package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        while (amount > 0) {
            amount = amount + amount * percent - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(year(200, 70, 50));
    }
}
