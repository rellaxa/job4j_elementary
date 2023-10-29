package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short heightMan) {
        return (heightMan - 100) * 1.15;
    }

    public static double womanWeight(short heightWoman) {
        return (heightWoman - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightMan = 169;
        short heightWoman = 155;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Man 169 is " + man);
        System.out.println("Woman 155 is " + woman);
    }

}