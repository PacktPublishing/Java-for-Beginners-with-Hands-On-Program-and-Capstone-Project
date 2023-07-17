package com.mycompany.twentyone.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args)
    {
        FileWriter myWriter = null;
        try
        {
            //FileWriter myWriter = new FileWriter("D:/FileHandling/NewFilef1.txt");
            myWriter = new FileWriter("Demo.txt");
            //Writes this content into the specified file
            myWriter.write("Java is the prominent programming language of the millennium!");
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }finally {
            //Closing is necessary to retrieve the resources allocated
            try {
                myWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
