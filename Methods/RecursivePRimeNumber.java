package Methods;

import java.util.Scanner;

public class RecursivePRimeNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = inp.nextInt();
        inp.close();

        if (isPrime(number, number - 1)) {
            System.out.println(" is a PRIME number.");
        } else {
            System.out.println(" is not a PRIME number.");
        }
    }

    public static boolean isPrime(int number, int divisor) {
        if (number <= 1) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor - 1);

    }

}
