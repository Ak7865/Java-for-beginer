import java.time.format.DateTimeFormatter;
//import java.time.*;
import java.time.LocalDateTime;
//import java.time.Year;
public class DateTime {
    public static void main(String[] args) {
    
        
        DateTimeFormatter a= DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss");
        LocalDateTime now =LocalDateTime.now();
        System.out.println(a.format(now));
        
        }
    }

