import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a year:");
        int year = scanner.nextInt();
        scanner.close();

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || (year % 400 == 0)) {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println(year + " " + "is a leap year :).");
        } else {
            System.out.println(year + " " + "is not a leap year :/.");
        }
    }
}
