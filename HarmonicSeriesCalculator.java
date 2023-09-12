import java.util.Scanner;

public class HarmonicSeriesCalculator {
    public static void main(String[] args) {

        // (i.e., 1/1 + 1/2 + 1/3 + ... + 1/n)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        double harmonicSum = 0;

        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
        }
        System.out.println("The harmonic series of " + n + "is:" + harmonicSum);
        scanner.close();

    }
}
