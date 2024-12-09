package task4.solution01;
// Custom exception for invalid name
public class NameNotValidException01 extends Exception {
    // Constructor to pass the error message to the Exception superclass
    public NameNotValidException01(String message){
        super(message);
    }
}
