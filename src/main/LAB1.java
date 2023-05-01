package main;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB1 {
    public static void main(String[] args) {
        try{

            FileWriter output = new FileWriter("data.txt");
            output.write("Hello World");
            output.write("Welcome to JAVA");
            output.close();
        }catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null,ex);
        }
        try{
            FileReader input = new FileReader("data.txt");
            int ch;
            while ((ch = input.read()) != -1)
                System.out.print((char)ch);
            input.close();
        } catch (IOException ex){
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null,ex);

        }
    }

}
