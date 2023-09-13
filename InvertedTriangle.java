import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the number of digits: ");
        int numDigits = inp.nextInt();

        for (int i = numDigits; i >= 1; i--) {
            for (int j = numDigits - i; j > 0; j--) {
                System.out.println(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.println("*");
            }
            System.out.println();
        }
        inp.close();
    }
}
