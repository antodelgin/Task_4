package task4.solution05;

import java.util.Scanner;
import java.util.Stack;

public class Test05 {
    // Stack to hold integers
    private static Stack<Integer> stack=new Stack<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // menu options
        System.out.println("1. Add integer to stack.");
        System.out.println("2. Delete an integer from stack.");
        System.out.println("3. Is stack empty? ");
        System.out.println("4. Display elements in stack.");
        System.out.println("5. Exit");
        // loop runs until the user chooses to exit
        while(true){
            System.out.print("Enter choice: ");
            int choice= sc.nextInt();
            // Switch case to handle user input
            switch(choice){
                case 1:
                    // Add an integer to the stack
                    System.out.print("Enter integer to add: ");
                    int n=sc.nextInt();
                    add(n);
                    break;
                case 2:
                    // Delete the top element from the stack
                    delete();
                    break;
                case 3:
                    // Check if the stack is empty
                    System.out.println("Is stack empty? "+isEmpty());
                    break;
                case 4:
                    // Display all elements in the stack
                    display();
                    break;
                case 5:
                    // Exit the program
                    System.out.print("Exit");
                    return;
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice");
            }
        }
    }
    // Method to add an integer
    public static void add(Integer n){
        stack.add(n);
        System.out.println(n+" is added to stack");
    }
    // Method to delete the top integer
    public static void delete(){
        stack.pop();
        System.out.println("Top element in stack removed succesfully");
    }
    // Method to check if the stack is empty
    public static boolean isEmpty(){
        return stack.isEmpty();
    }
    // Method to display all elements
    public static void display(){
        System.out.println(stack);
    }

}
