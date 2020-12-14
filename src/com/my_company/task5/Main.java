package com.my_company.task5;

public class Main {
    public static void main(String[] args) {
        TaskAboutString taskAboutString = new TaskAboutString();

        System.out.println(taskAboutString.findMiddleInString("dasfdve"));
        System.out.println(taskAboutString.invertCase("dssAAA"));

        System.out.println(taskAboutString.swapString("abcd"));
        System.out.println(taskAboutString.swapString("abCde"));

        Liquid cocaCola = new Liquid(1040, "black", true);
        Liquid water = new Liquid(1000, "clear", false);
        Liquid grenadine = new Liquid(1225, "red", false);

        Bottle bottle1 = new Bottle(1.0, cocaCola);
        Bottle bottle2 = new Bottle(0.5, water);
        Bottle bottle3 = new Bottle(1.0, grenadine);

        System.out.println(bottle1.equals(bottle2));
        System.out.println(bottle1.equals(bottle3));
        System.out.println(bottle2.equals(bottle3));
    }
}
