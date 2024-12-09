package task4.solution02;

// Custom checked exception for invalid voter age
public class InvalidAgeException02 extends Exception {
    // Constructor to initialize the exception with a custom message
    public InvalidAgeException02(String message) {
        super(message); // Pass the message to the Exception superclass
    }

}
