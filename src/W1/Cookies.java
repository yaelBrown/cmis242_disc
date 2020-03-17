package W1;

// Seperate Cookies class
public class Cookies {
    // Private instance variable. (Cannot be directly called "Cookies.name")
    // Must be USED (cannot be called because it's private) after instance is instantiated.
    private String name;

    // Constructor for cookies.
    public Cookies(String n) {
        this.name = n;
    }

    // Overwritten toString method prints out what I customized in the return.
    public String toString() {
        return "This delicious cookie is called " + this.name;
    }

}
