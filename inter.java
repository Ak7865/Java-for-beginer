
//import java.lang.reflect.Method;
//import java.io.*;
interface inter1{
       public void Method1();
       public void Method2() ;        
       }
public class inter implements inter1{
      public void Method1(){
        System.out.println("hi");
       }
      public void Method2(){
        System.out.println("everyone");
       }

    public static void main(String[] args) {
      inter obj1=new inter();
      obj1.Method1();
      obj1.Method2();

    }
  }    
