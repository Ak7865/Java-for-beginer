public class static1 {
    int rollno= 8;
    String name="Akhter";
    static int a=10;
    static int b=12;
    static void method1(int x){
        x=1;
        System.out.println("x" +x);
        System.out.println("a" +a);
        System.out.println("b" +b);
    }
    public void method2() {
        System.out.println("Rollno " +rollno +"Name " +name);
    }
    public static void main(String[] args) {
        static1 obj = new static1();
        obj.method2();
        method1(a);
    }
}
