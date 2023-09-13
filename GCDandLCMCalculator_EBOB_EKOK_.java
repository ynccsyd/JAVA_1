import java.util.Scanner;

public class GCDandLCMCalculator_EBOB_EKOK_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number:");
        int num2 = input.nextInt();

        int originalNum1 = num1;
        int originalNum2 = num2;

        //// Calculate GCD (EBOB) using the Euclidean algorithm///
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        int gcd = num1;
        int lcm = (originalNum1 * originalNum2) / gcd;

        System.out.println("Greatest Common Divisor (EBOB): " + " " + gcd);
        System.out.println("Least Common Multiple (EKOK):" + " " + lcm);
        input.close();
    }
}

// import java.util.Scanner;

// public class GCDandLCMCalculator_EBOB_EKOK_ {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);

// System.out.println("Enter the first number: ");
// int num1 = input.nextInt();

// System.out.println("Enter the second number:");
// int num2 = input.nextInt();

// int gcd = 1;

// for(int i=1;i<=(num1*num2); i++){
// if(i%num1==0 && i%num2==0){
// System.out.println("Least Common Divisor (EKOK):" + " " + i);
// break;
// }
// }
// System.out.println();
// for (int k = num1; k >= 1; k--) {
// if (num1 % k == 0 && num2 % k == 0) {
// gcd = k;
// System.out.println("Greatest Common Divisor (EBOB): " + " " + gcd);
// break;
// }
// }

// input.close();
// }
// }
