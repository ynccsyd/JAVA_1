import java.util.Scanner;

public class TriangleStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.println(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.println("*");
            }
            System.out.println(" ");
        }
        scanner.close();

    }
}
