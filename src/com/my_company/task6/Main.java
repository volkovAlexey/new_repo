package com.my_company.task6;

public class Main {

    public static void main(String[] args) {
        String date = "31/02/2020 99:40";
        DateFormat dateFormat = new DateFormat();
        System.out.println(dateFormat.validate(date));

        EmailFormate emailFormate = new EmailFormate();
        String domain = emailFormate.findDomain("asdf21@gmail.com");
        System.out.println(domain);
    }
}
