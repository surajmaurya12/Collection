
import java.util.ArrayList;
import java.util.Scanner;

class ArrayListUserInput {

    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to add to the ArrayList: ");
        int n = sc.nextInt();

        // Read n elements from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt(); // Read integer input
            arrList.add(number); // Add to the ArrayList
        }

        // Display the elements in the ArrayList
        System.out.println("You have entered the following elements:");
        for (int num : arrList) {
            System.out.println(num);
        }

        sc.close(); // Close the scanner
    }
}

// Enter the number of elements you want to add to the ArrayList: 5
// Enter 5 integers:
// 66
// 67
// 68
// 69
// 70
// You have entered the following elements:
// 66
// 67
// 68
// 69
// 70
