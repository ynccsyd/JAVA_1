import java.util.Scanner;

public class calculaterCombinationRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = input.nextInt();

        System.out.println("Enter the value of r:");
        int r = input.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println(
                    "Invalid input! n and r should be non-negative integers, and r should be less than or equal to n.");
        } else {
            long combination = calculateCombination(n, r);
            System.out.println("C(" + n + "," + r + ") = " + combination);
        }
        input.close();
    }

    public static long calculateCombination(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        } else {
            return calculateCombination(n - 1, r - 1) + calculateCombination(n - 1, r);
        }
    }
}
