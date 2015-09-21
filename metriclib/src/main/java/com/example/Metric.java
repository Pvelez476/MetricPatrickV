package com.example;

public class Metric {
    public static void main(String[] args)
    {
        int intValue1 = 28;
        int intValue2 = 168;
        int intValue3 = 47;
        int intValue4 = 27;
        int intValue5 = 92;
        int intValue6 = 200;
        double intValue7 = 39.3701;
        double intValue8 = 39370.1;
        double intValue9 = 0.393701;
        double intValue10 = 39370.1;
        double intValue11 = 0.264172;
        double intValue12 = 2.20462;



     double result1 = intValue1 * intValue7;
        System.out.println("28 Meters to Inch: " + result1);

        double result2 = intValue2 * intValue8;
        System.out.println("168 Kilometers to Inches: " + result2);

        double result3 = intValue3 * intValue9;
        System.out.println("47 Centimeters to Inches: " + result3);

        double result4 = intValue4 * intValue10;
        System.out.println("27 Kilometers to Inches: " + result4);

        double result5 = intValue5 * intValue11;
        System.out.println("Liters to Gallons: " + result5);

        double result6 = intValue6 * intValue12;
        System.out.println("Kilograms to Pounds: " + result6);


    }
}
