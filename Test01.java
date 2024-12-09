package task4.solution01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // Scanner object to take user input
        System.out.print("Number of students: ");
        int n=sc.nextInt(); // Number of students to register
        Student01[] students=new Student01[n];
        System.out.println("Enter Students details");
        try {
            for (int i = 0; i < n; i++) {
                // Loop to collect details for each student
                System.out.print("Enter Rollno.: ");
                int rollno=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name= sc.nextLine();
                System.out.print("Enter Age: ");
                int age=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter course: ");
                String course=sc.nextLine();
                // Create a Student01 2object and add it to the array
                students[i]=new Student01(rollno, name, age, course);
            }
        } catch (AgeNotWithinRangeException01 e) {
            // Handle age-related exceptions
            System.out.println("Error: "+e.getMessage());;
        } catch (NameNotValidException01 e) {
            // Handle name validation exceptions
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            // Display details of all registered students
            if (students[i] != null) {
                System.out.println(students[i].toString());
            }
        }


    }
}
