import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PredictionNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        // System.out.println(number);

        while (right < 5) {
            System.out.println("Enter your prediction : ");
            selected = input.nextInt();
            if (selected < 0 || selected > 90) {
                System.out.println("Please enter a number between 0-100.");
                continue;
            }
            if (selected == number) {
                System.out.println("Congrats...! The number is: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Try again...!");
                if (selected > number) {
                    System.out.println(selected + "  is bigger than number");
                } else {
                    System.out.println(selected + "  is smaller than number");
                }
                wrong[right++] = selected;
                System.out.println("Rest of your right : " + (5 - right));
            }

        }
        System.out.println(number);
        if (!isWin) {
            System.out.println("I am sory, you have lost.");
            if (!isWrong) {
                System.out.println("Your predictions : " + Arrays.toString(wrong));
            }
        }

    }
}
