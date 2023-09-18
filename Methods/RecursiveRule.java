package Methods;

import java.util.Scanner;

public class RecursiveRule {
    public static void recursiveRule(int n, int limit) {
        System.out.print(n + " ");
        if (n <= 0) {
            return;
        }
        if (n == limit) {
            recursiveRule(n - 5, limit);
        } else {
            recursiveRule(n - 5, limit);
        }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = inp.nextInt();
        System.out.println("N Say: " + n1);
        inp.close();
        recursiveRule(n1, n1);

    }
}
