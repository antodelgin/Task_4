package task4.solution04;

import java.util.HashMap;
import java.util.Scanner;

public class Test04 {
    // HashMap to store student names(keys) and grades(values)
    public static HashMap<String,Integer> students=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //addStudent("adam",92);
        // Menu to interact with user
        System.out.println("1. Add students and grades");
        System.out.println("2. Remove student");
        System.out.println("3. Display ");
        System.out.println("4. Exit");

        while(true) {
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    // Adding a new student
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = sc.nextInt();
                    sc.nextLine();
                    addStudent(name, grade);
                    break;
                case 2:
                    // Removing an existing student
                    System.out.println("Enter student name to remove: ");
                    String removeName = sc.nextLine();
                    removeStudent(removeName);
                    break;
                case 3:
                    // Displaying student's grade
                    System.out.println("Enter student name to display grade: ");
                    String displayName = sc.nextLine();
                    displayStudent(displayName);
                    break;
                case 4:
                    // Exiting the program
                    System.out.println("Exit");
                    return;
                default:
                    // Handling invalid choice
                    System.out.println("Invalid choice");
            }
        }
    }
    // Method to add a student
    public static void addStudent(String name,int grade){
        students.put(name,grade);
    }
    // Method to remove a student
    public static void removeStudent(String name){
        if(students.containsKey(name)){
            students.remove(name);
            System.out.println("removed successfully");
        }else{
            System.out.println("Name not found");
        }
    }
    // Method to display specific student's grade
    public static void displayStudent(String name){
        if(students.containsKey(name)){
            System.out.println(name+"'s grade:"+students.get(name));
        }else{
            System.out.println("Name not found");
        }
    }
}
