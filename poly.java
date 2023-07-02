class poly{
    public void sum(){
        int a=20;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
    public void sum(int i, int j){
        int c=i+j;
        System.out.println(c);
    }

    public static void main(String[] args) {
        poly obj=new poly();
        obj.sum();
        obj.sum(40,20 );
    }    
}
