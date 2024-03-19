package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create array
        // This array has a 10 element
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        Scanner input = new Scanner(System.in);
        // Import Scanner and ask index number
        System.out.print("Enter The Index Of Array: ");
        int index = input.nextInt();

        // Exception Handler Structure
        try {
            // Show array element
            System.out.print(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Show error messages
            e.printStackTrace();
        }


    }
}
