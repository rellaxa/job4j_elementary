package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 94;
    }

    public static float dollarToEuro(float value) {
        return value * 0.94f;
    }

    public static float euroToDollar(float value) {
        return  value * 1.06f;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(1500);
        System.out.println("1500 rubles = " + euro + " euro");
        euro = Converter.dollarToEuro(300);
        System.out.println("300 dollars = " + euro + " euro");
        float dollar = Converter.rubleToDollar(1500);
        System.out.println("1500 rubles = " + dollar + " dollars");
        dollar = Converter.euroToDollar(450);
        System.out.println("450 euro = " + dollar + " dollars");
    }
}
