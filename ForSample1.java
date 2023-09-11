import java.util.Scanner;

public class ForSample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0; // variable to store the sum of numbers
        int count = 0; // variable to count the numbers divisible by 3 and 4

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i; // Add the number to the sum
                count++; // Increment the count
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of numbers divisible by 3 and 4: " + average);
        } else {

        }
        System.out.println("There are no numbers divisible by both 3 and 4 in the range.");
    }

}
