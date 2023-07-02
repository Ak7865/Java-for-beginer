interface f{
    public void method1(); 
        
    }
interface g{
    public void method2(); 
        
    }
class c implements f, g{
    public void method1() {
        System.out.println("ok");
    }
    public void method2() {
        System.out.println("Bye");
    }
}
public class inter2 {
    public static void main(String[] args) {
        c obj1=new c();
        c obj2=new c();
        obj1.method1();
        obj2.method2();
    }
    
}
