package W2;

// Child is a child class that extends from its parent Week2
public class Child extends Week2 {
    // arms is private, and can only be used in the child class
    private int arms;

    // constructor method for the child cass
    public Child(String n, int a) {
        // super is called to use the parent constructor. That's why we have to pass String of n
        // which is the Name. It is passed as a parameter in the super because then the super passes it
        // to the parent constructor.
        super(n);
        this.arms = a;
    }

    // Overwritten toString method
    public String toString() {
        return super.toString() + " and you have " + this.arms + " arms!";
    }

    // psvm as usual
    public static void main(String[] args) {

        // instantiate with Parent and use the toString method
        Week2 aa = new Week2("cookies");
        System.out.println("aa.toString() = " + aa.toString());

        // instantiate with Child and use the toString method
        Child bb = new Child("donut", 8);
        System.out.println("bb.toString() = " + bb.toString());

    }

}
