package main;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB2 {
    public static void main (String[]args) throws FileNotFoundException,IOException{

        try{
            FileWriter file = new FileWriter("lab2.txt");
            BufferedWriter output = new  BufferedWriter(file);
            output.write("Hello World");
            output.write("Welcome to JAVA");
            output.close();
        }catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null,ex);
        }
        try{
            String s;
            FileReader file = new FileReader("lab2.txt");
            BufferedReader input = new BufferedReader(file);
            int ch;
            while ((ch = input.read()) != -1)
                System.out.print((char)ch);
            input.close();
        } catch (FileNotFoundException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null,ex);

        }catch (IOException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
}
