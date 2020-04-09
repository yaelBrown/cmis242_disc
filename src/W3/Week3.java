package W3;

import java.util.Random;

public class Week3 {
// Generates a random everytime it's called
public static int randInt() {
        Random out = new Random();
        return out.nextInt(100);
        }

// Example of a checked exception with error handling
public static String share(int val) throws NumberIsOddException {
        String out = "";
        try {
        if (val % 2 == 1) {
        throw new NumberIsOddException("This number is not even!: " + val);
        }
        int split = val / 2;
        out = "Each person will get " + split;

        // If the number is odd it is handled with this early return statement
        } catch (NumberIsOddException err) {
        return val + " is not even, try again";
        }

        // If number is even
        return out;
        }

// Example of unchecked except and will throw stand Java exception code (with red text)
public static String shareUnchecked(int val) throws NumberIsOddException {
        String out = "";

        if (val % 2 == 1) {
        // If the number is odd the exception is throw and not caught.
        throw new NumberIsOddException("This number is not even!: " + val);
        }

        int split = val / 2;
        out = "Each person will get " + split;

        return out;
        }

public static void main(String[] args) throws NumberIsOddException {
        int num = randInt();

        System.out.println(num + " : is the random number.");

        System.out.println(share(num));
        System.out.println(shareUnchecked(num));
        }

        }