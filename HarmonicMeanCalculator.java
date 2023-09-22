import java.util.Scanner;

public class HarmonicMeanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        double harmonicSeries = calculateHarmonicSeries(n);

        System.out.println("Harmonic Mean: " + harmonicSeries);

        scanner.close();
    }

    public static double calculateHarmonicSeries(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}
