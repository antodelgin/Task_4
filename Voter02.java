package task4.solution02;

public class Voter02 {
    private int voterID;
    private String name;
    private int age;
    // Constructor to initialize Voter02 object and validate age
    public Voter02(int voterID, String name, int age) throws InvalidAgeException02{
        if(age<18){ // Check if age is less than 18 and throw custom exception if true
            throw new InvalidAgeException02("Invalid Age for voting");
        }
        this.voterID=voterID;
        this.name=name;
        this.age=age;
    }
    // Method to display voter details
    public void display(){
            System.out.println("VoterID: "+voterID+" Name: "+name+" Age: "+age);
    }
}
