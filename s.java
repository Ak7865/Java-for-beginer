class d{
    public void method1() {
        System.out.println("My name is Ak");
    }
}
class e extends d{
    public void method1() {
        super.method1();
        System.out.println("Syed Akhter Hussain");
        
    }
}
public class s {
    public static void main(String[] args) {
        e obj =new e();
        obj.method1();
    }
}
