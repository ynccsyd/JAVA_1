import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements in the Fibonacci series : ");
        int n = input.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series for " + n + " elements.");

        for (int i = 1; i <= n; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        input.close();
    }
}
