public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100.");

        for (int number = 2; number <= 100; number++) {
            if (isPrime(number)) {
                System.out.println(number + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
