package com.mycompany.nineteen.exception;

public class Exception2Main {

    public static void main(String[] args)
    {
        String s1 = "Hi I am a valid String";
        String s2=null;
        //String upCase = s2.toLowerCase();
        displayLength(s1);
        displayLength(s2);
    }
    public static void displayLength(String s)
    {
        try {
            if(s != null) {
                System.out.println(s.length());
            }
        }
        catch (Exception e)
        {
            System.out.println("Null Pointer Exception");
        }
    }
}
