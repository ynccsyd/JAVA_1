import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("write a number: ");
        a = input.nextInt();

        System.out.println("write a number: ");
        b = input.nextInt();

        System.out.println("write a number: ");
        c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a>b>c");
            } else {
                System.out.println("a>c>b");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b>a>c");
            }
        } else {
            if (a > b) {
                System.out.println("c>a>b");
            }
        }
    }
}
