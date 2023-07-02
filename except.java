public class except {
    public static void main(String[] args) {
        try {
            int a []= {10,20,30};
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("ArrayOutOfBounded: Error");
        }
        finally{
            System.out.println("The size of array doesn't found ");
        }
    }
    
}
