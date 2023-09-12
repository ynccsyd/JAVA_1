import java.util.Scanner;

public class ForSample2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Define the limit: ");

        int n = input.nextInt();

        for (int i = 1; Math.pow(5, i) <= n; i++) {
            System.out.println((int) Math.pow(5, i));
        }

        for (int i = 1; Math.pow(5, i) <= n; i++) {
            System.out.println((int) Math.pow(5, i));
        }
        input.close();
    }
}
