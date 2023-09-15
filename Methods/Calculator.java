package Methods;

import java.util.Scanner;

public class Calculator {
    static int add(int a, int b) {
        int result = a + b;
        System.out.println("Result: " + result);
        return result;
    }

    static int subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Result: " + result);
        return result;

    }

    static int multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Result: " + result);
        return result;
    }

    static int division(int a, int b) {
        if (b == 0) {
            System.out.println("Divisor can not be 0 (zero)!");
            return 0;
        }
        int result = a / b;
        System.out.println("Result: " + result);
        return result;
    }

    static int exponentiation(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void rectangleCalculation(int a, int b) {
        System.out.println("Area calculation : " + (a * b));
        System.out.println("Perimeter calculation : " + (2 * (a + b)));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;

        String menu = "1- Addition \n"
                + "2- Subtraction \n"
                + "3- Multiplication \n"
                + "4- Division \n"
                + "5- Exponentiation \n"
                + "6- Subtraction \n"
                + "7- Modulo \n"
                + "8- Rectangle Calculation \n"
                + "9- Exit";

        while (true) {
            System.out.println(menu);
            System.out.println("Choose calculation:");
            select = inp.nextInt();

            if (select == 0) {
                break;
            }

            System.out.println("First number: ");
            int a = inp.nextInt();
            System.out.println("Second number :");
            int b = inp.nextInt();

            switch (select) {
                case 1:
                    add(a, b);
                    break;
                case 2:
                    subtraction(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;
                case 5:
                    System.out.println(a + "^" + b + "=" + exponentiation(a, b));
                    break;
                case 6:
                    subtraction(a, b);
                    break;
                case 7:
                    System.out.println(a + "%" + b + "=" + mod(a, b));
                    break;
                case 8:
                    rectangleCalculation(a, b);
                    break;
                default:
                    System.out.println(" Invalid selection");
            }
        }
        inp.close();
    }
}
