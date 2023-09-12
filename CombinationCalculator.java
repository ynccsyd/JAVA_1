import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // C(n,r) = n! / (r! * (n-r)!)
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Enter the value of r: ");
        int r = scanner.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println(
                    "Invalid input! n and r should be non-negative integers, and r should be less than or equal to n.");
        } else {
            long combination = calculateCombination(n, r);
            System.out.println("C(" + n + "," + r + ")=" + combination);
        }
        scanner.close();

    }

    public static long factoriel(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;

    }

    public static long calculateCombination(int n, int r) {
        long combination = factoriel(n) / (factoriel(r) * factoriel(n - r));
        return combination;
    }
}
// Output:
// Enter the value of n: 5
// Enter the value of r:
// 2
// C(5,2)=10
