public class nested {
            public static void main(String args[])
        {
                try {
                    int a[] = { 1, 2, 3, 4, 5 };
                    System.out.println(a[5]);
                    try {
                      int tr = a[2] / 0;
                }
                catch (ArithmeticException e2) {
                    System.out.println("division by zero is not possible");
                }
            }
            catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println("ArrayIndexOutOfBoundsException");
                System.out.println("Element at such index does not exists");
            }
        }
    
    }
    