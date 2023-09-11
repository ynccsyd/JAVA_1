import java.util.Scanner;

public class WhileSample1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("enter a number: ");
            int input = scan.nextInt();
            if (input == 0) {
                break; // Exit the loop when 0 is entered
            }
            if (input % 2 == 0 && input % 4 == 0) {
                sum += input; // Add the even number that is a multiple of 4 to the sum
            }
            System.out.println("Sum of even numbers that are multiples of 4: " + sum);
        }
    }
}
