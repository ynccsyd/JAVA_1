package Methods;

public class Exponentiation {
    static int power(int base, int exp) {
        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        // f(x)=a^b

        System.out.println(power(2, 5));

    }
}
