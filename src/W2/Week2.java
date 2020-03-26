package W2;

// Parent class week2
public class Week2 {
    // variable is protected so that other parent classes cannot modify it but can be used in our child class
    private String name;

    // Constuctor for parent class
    public Week2(String n) {
        this.name = n;
    }

    // Overwrittten toString method for our parent class.
    public String toString() {
        return "Your name is " + this.name;
    }

}
