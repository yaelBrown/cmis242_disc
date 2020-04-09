package Q2;

public class Quiz2 {

    public static void main(String[] args)
    {
        try
        {
            aMethod();
            System.out.println("After the call");
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Arithmetic Exception");
        }
        catch (RuntimeException exception)
        {
            System.out.println("Runtime Exception");
        }
        System.out.println("After the try-catch statement");
    }
    private static void aMethod() throws RuntimeException
    {
        int x = 1/0;
    }
}
