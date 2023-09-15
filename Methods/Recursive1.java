package Methods;

public class Recursive1 {
    // f(1) = 1;
    // f(2) = f(1) + 2;
    // f(3) = f(2) + 3;
    // ..........
    // f(n) = f(n-1) + n;
    static int recFonk(int n) {

        if (n == 1) {
            return 1;
        }
        int sum = recFonk(n - 1) + n;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(recFonk(5));
    }
}
