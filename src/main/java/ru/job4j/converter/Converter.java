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
        float dollar = Converter.rubleToDollar(1500);
        System.out.println("1500 rubles = " + dollar + " dollars");
        euro = Converter.dollarToEuro(300);
        System.out.println("300 dollars = " + euro + " euro");
        dollar = Converter.euroToDollar(300);
        System.out.println("300 euro = " + dollar + " dollars");

        float inRubToEur = 1500;
        float expEuro = 15;
        float outRubToEur = Converter.rubleToEuro(inRubToEur);
        boolean passEuro = expEuro == outRubToEur;
        System.out.println("1500 rubles are 15 euro. Test result : " + passEuro);

        float inRubToDol = 1500;
        float expDol = 15.957447f;
        float outRubToDol = Converter.rubleToDollar(inRubToDol);
        boolean passDol = expDol == outRubToDol;
        System.out.println("1500 rubles are 15.957447f dollars. Test result : " + passDol);

        float inDolToEuro = 300;
        expEuro = 282;
        float outDolToEuro = Converter.dollarToEuro(inDolToEuro);
        passDol = expEuro == outDolToEuro;
        System.out.println("300 dollars are 282 euro. Test result : " + passDol);

        float inEuroToDol = 300;
        expDol = 317.99997f;
        float outEuroToDol = Converter.euroToDollar(inEuroToDol);
        passEuro = expDol == outEuroToDol;
        System.out.println("300 euro are 317.99997 dollars. Test result : " + passEuro);
    }
}
