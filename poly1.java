class A{
    public void display(){
        System.out.println("Hello");
    }
}
class poly1 extends A{
    public void display(){
        System.out.println("World");
    }
//}
//public class poly1 {
    public static void main(String[] args) {
        
        poly1 obj =new poly1();
        obj.display();
    }
}
