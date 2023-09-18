package Methods;

import java.util.Scanner;

public class RecursivePRimeNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = inp.nextInt();
        inp.close();

        if (isPrime(number)) {
            System.out.println(" is a prime number.");
        } else {
            System.out.println(" is not a prime number.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int maxDivisor = (int) Math.sqrt(number);
        return isPrime(number, 3, maxDivisor);
    }

    public static boolean isPrime(int number, int divisor, int maxDivisor) {
        if (divisor > maxDivisor) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor + 2, maxDivisor);

    }

}
