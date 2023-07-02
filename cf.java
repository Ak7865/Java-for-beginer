import java.io.File;
import java.io.IOException;
public class cf {
    public static void main(String[] args) {
        try {
            File obj1 = new File("Ak1.txt");
            if (obj1.createNewFile()) {
                System.out.println("File created :" +obj1.getName());
            }
            else{
                System.out.println("File already exists:");
            }
        } catch (IOException e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }
    }
    
}
