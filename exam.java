import java.io.*;
import java.io.IOException;
public class exam{
public static void main(String[] args) {
    try {

        File obj1= new File("Ak.txt");
        FileWriter obj2= new FileWriter("Ak.txt");
        obj2.write("IM ak");
        obj2.close();
        System.out.println("Successfully written");
        if(obj1.createNewFile()){
            System.out.println("created" +obj1.getName());
        }
        else{
            System.out.println("Already exists");
        }
    } catch (IOException e) {
        System.out.println("An error occured");
        e.printStackTrace();
    }
}
}