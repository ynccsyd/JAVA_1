import java.util.Scanner;

public class ExponentiationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.println("Enter the exponent(power):");
        int exponent = scanner.nextInt();

        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(base + "^" + exponent + "=" + result);
        scanner.close();
    }
}
