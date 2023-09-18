package Methods;

import java.util.Scanner;

public class RecursiveRule {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = inp.nextInt();
        inp.close();

        performRule(number);
    }

    public static void performRule(int number) {
        if (number <= 0) {
            System.out.println("The latest number: " + number);
            return;
        }
        System.out.println("Sub :" + number);
        performRule(number - 5);

        System.out.println("");
    }
}
