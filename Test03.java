package task4.solution03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        // Scanner object to get input from the user
        Scanner sc= new Scanner(System.in);
        // Array to store names of the weekdays
        String[] weekDays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        try {
            System.out.print("Enter day index (0-6): ");
            int index = sc.nextInt();
            // Print corresponding weekday based on the index
            System.out.println(weekDays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle cases when the user enters an invalid index
            System.out.println("Error: Index out of range. Day index must be between 0 to 6 ");
        }
    }
}
