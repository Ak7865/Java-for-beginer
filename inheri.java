class Animal {
    public void eat(){
    System.out.println("Cat love fish");
    }
    
}
class  Cat extends Animal{
    public void meow(){
        System.out.println("Meow");
    }
}

class inheri{

    public static void main(String [] args) {
       Cat c = new Cat();
       c.meow();
       c.eat();
    }
}