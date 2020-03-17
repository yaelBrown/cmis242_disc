/*
    Explain how class (static) variables and methods differ from their instance counterparts.
Give an example of a class that contains at least one class variable and at least one class method.
Explain why using a class variable and method rather than an instance variable and method would be
the correct choice in the example you select.
*/


/*
    Static variables and methods can only be called from within a static context. Instance methods and variables
    Can only be called once their constuctor is instantiated.

 */
package W1;

public class Week1 {
    // Class method that adds 2 numbers together.
    public static int add(int a, int b) {
        return a + b;
    }
    // main is technically a class method but not what you are looking for
    public static void main(String[] args) {

        // Create an instance of the Cookies class
        Cookies snickerDoodle = new Cookies("Snickery Doodley");

        System.out.println("add(4,6) = " + add(4, 6));
        System.out.println("snickerDoodle.toString() = " + snickerDoodle.toString());

    }

}