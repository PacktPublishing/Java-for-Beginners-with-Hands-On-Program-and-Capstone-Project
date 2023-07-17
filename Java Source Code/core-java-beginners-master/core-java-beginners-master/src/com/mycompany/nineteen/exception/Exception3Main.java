package com.mycompany.nineteen.exception;

public class Exception3Main {

    public static void main(String[] args)
    {
        int[] a = new int[]{1,2,3,4,5};
        display(a);
    }
    public static void display(int[] a)
    {
        try{
            for(int i=0;i<=a.length;i++)
                System.out.println(a[i]);
        }
        catch (Exception e)
        {
            System.out.println("Array Index Out Of Bounds");
        }
        System.out.println("Continuing...");
    }
}
