package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("whats ur name");
        String employeeName = input.next();

        System.out.println("how many hrs u done?");
        double hrsWorked = input.nextDouble();

        int hrlyWage = input.nextInt();

        if (hrlyWage > 45){
            double ovrTime =(hrsWorked - 45);
            hrsWorked = 45;
        }

    }
}
