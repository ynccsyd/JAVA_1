import java.util.Scanner;

public class MaxMinNumberFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value o N:");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("N must be a positive integer.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number " + i + ":");
            int number = input.nextInt();

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Smallest number is: " + min);
        System.out.println("Biggest number is: " + max);

    }
}
