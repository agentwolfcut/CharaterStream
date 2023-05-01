package main;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB4 {
    public static void main(String[] args) {
        try{
            PrintWriter output = new PrintWriter("lab4.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println("67.5");
            output.println("173");
            output.close();
        } catch (FileNotFoundException ex){
            Logger.getLogger(LAB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try {
            FileReader file = new FileReader("lab4.txt");
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            System.out.println(name); // Harry Potter
            int age = input.nextInt();
            System.out.println(age); // 19
            double weight = input.nextDouble();
            System.out.println(weight); // 67.5
            double height = input.nextDouble();
            System.out.println(height); // 173.0
        } catch (FileNotFoundException ex){
            Logger.getLogger(LAB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
