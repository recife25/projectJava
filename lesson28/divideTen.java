/*
 * Felipe Ruiz aka - Phil
 * Lesson 28
 * Exceptions, checked, unchecked, final & finally
 * 
 */


public class divideTen {
    static int divideMethod(int a, int b) {
       int c = a / b;
        return c;
    }


    public static void main(String[] args) {
        try{
            System.out.println("try block");
            //divideTen.divideMethod(10, 0);

            //divideTen.divideMethod(5, 0);

            //divideTen.divideMethod(6, 2);
            System.out.println(divideMethod(6 , 2));
        

        }
        catch (ArithmeticException e) {
            System.out.println("catch block");
            System.out.println(e);
        }
        finally {
            System.out.println("This is my finally block");
        }
    }
    
}
