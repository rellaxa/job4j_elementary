package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String rsl;
        switch (day) {
            case 1 :
                rsl = "Monday";
                break;
            case 2 :
                rsl = "Tuesday";
                break;
            case 3 :
                rsl = "Wednesday";
                break;
            case 4 :
                rsl = "Thursday";
                break;
            case 5 :
                rsl = "Friday";
                break;
            case 6 :
                rsl = "Saturday";
                break;
            case 7 :
                rsl = "Sunday";
                break;
            default:
                rsl = "Error";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = nameOfDay(1);
        System.out.println(rsl);
        rsl = nameOfDay(2);
        System.out.println(rsl);
        rsl = nameOfDay(10);
        System.out.println(rsl);
    }
}
