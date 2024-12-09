package task4.solution02;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in); // Scanner object to take user input
        System.out.print("Enter no. of Voters: ");
        int n=sc.nextInt(); // Number of voters to be registered
        Voter02[] voters=new Voter02[n]; // Array to store voter objects
        int count=0;
        try {
            // Loop to get voter details and create voter objects
            for (int i = 0; i < n; i++) {
                System.out.print("Enter voterID: ");
                int voterID = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                voters[i] = new Voter02(voterID, name, age); // Create Voter02 object and add to array
                count++;
                System.out.println("Voter added Successfully");
            }
        } catch (InvalidAgeException02 e) {
            // Handle the custom exception for invalid voter age
            System.out.println("Error: "+e.getMessage());;
        }
        System.out.println();
        // Display registered voters
        System.out.println("Registered voters list:");
        for (int i = 0; i < n; i++) {
            if(count==0){
                System.out.println(0);
                return;
            }else{
                voters[i].display();
            }
        }
    }
}
