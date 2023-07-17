package com.mycompany.five.controlstatements;

import java.util.Scanner;

public class IfElseIfElseWithUserInputNonStop {

    public static void main(String[] args) {
        do {
            // Decide the grade based marks
            System.out.println("Please enter total marks secured by you");
            Scanner scanner = new Scanner(System.in);
            double totalMarks = scanner.nextDouble();

            if (totalMarks <= 500 && totalMarks >= 400) {
                System.out.println("Your grade is A");
            } else if (totalMarks <= 399 && totalMarks >= 200) {
                System.out.println("Your grade is B");
            } else {
                System.out.println("Your grade is C");
            }
        }while(true);
    }
}
