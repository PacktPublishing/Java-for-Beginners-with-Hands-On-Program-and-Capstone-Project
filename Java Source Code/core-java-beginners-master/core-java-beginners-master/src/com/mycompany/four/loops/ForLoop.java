package com.mycompany.four.loops;

public class ForLoop {

    public static void main(String[] args) {
        // Print from 1 to 5
        /*System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);*/

        //print from 1 to 101
        for(int i = 1; i<=101; i++){
            System.out.println(i);
        }
        System.out.println("************************print from 101 to 1*******************");
        //print from 101 to 1
        for(int i = 101; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("********************print odd numbers from 101 to 1***********************");
        //print odd numbers from 101 to 1
        int oddNumSum = 0;
        for(int i = 101; i>=1; i--){
            if(i%2 != 0){// non zero reminder means odd number
                oddNumSum = oddNumSum + i;
                System.out.println(i);
                //break;
            }
        }
        System.out.println("Sum of Odd number is "+oddNumSum);
    }
}
