import java.util.*;
public class add2 {
    public static void sum(int a, int b){
         int c=a+b;
         
         System.out.println("Sum of two number: " +c);
         //return c;
    }


    public static void main(String[] args) {
        //add2 obj=new add2();
        //obj.sum();
        System.out.println("Enter the 1st number: ");
        Scanner r=new Scanner(System.in);
        int a=r.nextInt();
        System.out.println("Enter 2nd number: ");
        int b=r.nextInt();
        sum(a,b);
        //System.out.println(c);
           
    }


}