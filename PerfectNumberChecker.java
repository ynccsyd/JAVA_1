import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number:");
        int num = inp.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a PERFECT number.");
        } else {
            System.out.println(num + " is not a PERFECT number.");
        }

        inp.close();

    }
}
