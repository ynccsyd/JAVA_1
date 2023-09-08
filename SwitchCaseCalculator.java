import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result;
        char operator;

        System.out.print("The first number:");
        number1 = scanner.nextDouble();

        System.out.print("The second number: ");
        number2 = scanner.nextDouble();

        System.out.print("Choose the operator( +,-,*,/ ): ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(("Result: " + result));
                break;
            case '-':
                result = number1 - number2;
                System.out.println(("Result: " + result));
                break;
            case '*':
                result = number1 * number2;
                System.out.println(("Result: " + result));
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println(("Result: " + result));
                } else {
                    System.out.println("Error: number2 must not be zero!");
                }
                break;
            default:
                System.out.println("Operation is invalid");
        }
    }
}
// Output:
// The first number:1
// The second number: 2
// Choose the operator( +,-,*,/ ): +
// Result: 3.0