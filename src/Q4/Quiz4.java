package Q4;

import java.util.List;

public class Quiz4 {
    public static void recurse(int n)
    {
        if (n > 0)
        {
            System.out.print(n % 10);
            recurse(n / 10);
        }
    }

    public static long factorial(int n)
    {
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        recurse(1234);
//        factorial(20);


    }

}
