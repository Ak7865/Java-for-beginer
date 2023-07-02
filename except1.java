//import java.lang.reflect.Method;
class except1{
public void method1(int age) {
    if(age<18){
        throw new ArithmeticException("You are not invited to the party");
    }
    else{
        System.out.println("You are  invited");
    }
}
//}
//public class except1 {
    public static void main(String[] args) {
        except1 obj =new except1();     
        obj.method1(21);
    }
}
