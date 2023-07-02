abstract class A {
    
        public abstract void method1(); 
        public void method2() {
            
            System.out.println("Nalbari polytechnic");
        }
    }
        class B extends A{
            public void method1(){
                System.out.println("Welcome    ");

            }
        }   
        class abstraction{
            public static void main(String[] args) {
                B obj1=new B();
                obj1.method1();
                obj1.method2();
            }
        }
            
    
    
