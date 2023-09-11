// Task
// Given an integer, , perform the following conditional actions:

// If  is odd, print Weird
// If  is even and in the inclusive range of  to , print Not Weird
// If  is even and in the inclusive range of  to , print Weird
// If  is even and greater than , print Not Weird
// Complete the stub code provided in your editor to print whether or not  is weird.

// Input Format

// A single line containing a positive integer, .

import java.util.Scanner;

public class HackerRankOddWeird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n % 2 == 1) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && (2 <= n && n <= 5)) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && (6 <= n && n <= 20)) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}
