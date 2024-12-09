package task4.solution01;

public class Student01 {
    private int rollno;
    private String name;
    private int age;
    private String course;
    // Constructor to initialize student details and validate inputs
    public Student01(int rollno, String name,  int age, String course) throws AgeNotWithinRangeException01, NameNotValidException01 {
        if(age<15 || age>21) { // Validate age: should be between 15 and 21
            throw new AgeNotWithinRangeException01("Age must be between 15 and 21.");
        }
        if (!name.matches("[a-zA-Z\\s]+")) { // Validate name: should not contain numbers or special characters
            throw new NameNotValidException01("Name must not contain numbers and special characters.");
        }
        // Assign values if validation passes
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    @Override
    // Overriding toString() method
    public String toString() {
        return "Roll No: "+ rollno+" Name: "+name+" Age: "+age+" Course: "+course;
    }
}
