import java.util.Scanner;

public class SwitchCaseYapisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        switch (value) {
            case 1:
                // Value 1
                break;
            case 2:
                // Value 2
                break;
            case 3:
                // Value 3
                break;
            default:
                // Value is not invalid
                break;

        }
    }
}

// public class SwitchCase {
// public static void main(String[] args) {
// int day = 2;
// switch (gun) {
// case 6:
// System.out.println("Today is Saturday");
// break;
// case 7:
// System.out.println("Today is Monday");
// break;
// default:
// System.out.println("Today is Weekday");
// }
// // Çıktısı "Week days"
// }

// }