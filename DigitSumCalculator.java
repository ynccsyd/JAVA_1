import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        long originalNumber = number;
        long digitSum = 0;

        while (number > 0) {
            long lastDigit = number % 10; // Get the last digit
            digitSum += lastDigit; // Add the last digit to the sum
            number /= 10; // Remove the last digit from the number
        }

        System.out.println("The sum of the digits of " + originalNumber + " is " + digitSum);

        scanner.close();
    }
}
