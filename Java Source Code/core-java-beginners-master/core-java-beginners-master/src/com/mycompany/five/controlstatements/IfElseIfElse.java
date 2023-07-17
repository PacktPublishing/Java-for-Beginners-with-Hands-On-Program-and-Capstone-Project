package com.mycompany.five.controlstatements;

public class IfElseIfElse {

    public static void main(String[] args) {
        // Decide the grade based marks
        double totalMarks = 434.5;

        if(totalMarks <= 500 && totalMarks >= 400){
            System.out.println("Your grade is A");
        }else if(totalMarks <= 399 && totalMarks >= 200){
            System.out.println("Your grade is B");
        }else{
            System.out.println("Your grade is C");
        }
    }
}
