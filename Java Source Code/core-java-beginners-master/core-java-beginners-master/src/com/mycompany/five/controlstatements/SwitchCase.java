package com.mycompany.five.controlstatements;

public class SwitchCase {

    public static void main(String[] args) {
        int day = 2;
        switch (day){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            default:
                System.out.println("Today is Unknown");
        }
    }
}
