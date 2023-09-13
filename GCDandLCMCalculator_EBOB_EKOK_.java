import java.util.Scanner;

public class GCDandLCMCalculator_EBOB_EKOK_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number:");
        int num2 = input.nextInt();

        int originalNum1 = num1;
        int originalNum2 = num2;

        //// Calculate GCD (EBOB) using the Euclidean algorithm///
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        int gcd = num1;
        int lcm = (originalNum1 * originalNum2) / gcd;

        System.out.println("Greatest Common Divisor (EBOB): " + " " + gcd);
        System.out.println("Least Common Multiple (EKOK):" + " " + lcm);
        input.close();
    }
}
