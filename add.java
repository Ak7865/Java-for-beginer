import java.util.*;
public class add {
    static int a;
    static int b;
    public void sum() {
        System.out.println("Enter the 1st number");
        Scanner r=new Scanner(System.in);
        int a= r.nextInt();
        System.out.println("Enter the 2nd number");
        int b=r.nextInt();
        int ad=a+b;
     System.out.println(ad);
}
  public static void main(String[] args) {
    add obj=new add();
    obj.sum();
    
  }  
}
