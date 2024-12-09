package task4.solution01;

// Custom exception for invalid age
public class AgeNotWithinRangeException01 extends Exception{
    // Constructor to pass the error message to the Exception superclass
    public AgeNotWithinRangeException01(String message){
        super(message);

    }
}
