import java.io.*;
 public class wf {
    public static void main(String[] args) {
        try {
            FileWriter obj1=new FileWriter("ak.txt");
            obj1.write("Hi this file is created with java programming");
            obj1.close();
            System.out.println("Successfully written");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
