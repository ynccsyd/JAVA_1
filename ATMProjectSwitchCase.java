import java.util.Scanner;

public class ATMProjectSwitchCase {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.println("Enter your username:");
            userName = input.nextLine();
            System.out.println("Enter your password:");
            password = input.nextLine();

            if (userName.equals("name") && password.equals("password123")) {
                System.out.println("You have logged in! Welcome to X BANK!!!");
                do {
                    System.out.println("1-Deposit money.\n" +
                            "2-Withdraw money.\n" +
                            "3-Show balance.\n" +
                            "4-Exit");
                    System.out.println("Select the action you want to:");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Enter the amount of money:");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                            break;
                        case 2:
                            System.out.println("Enter the amount of money:");
                            int withdrawAmount = input.nextInt();
                            if (balance < withdrawAmount) {
                                System.out.println("Sorry, insufficient funds. Check your balance.");
                            } else {
                                balance -= withdrawAmount;
                            }
                            break;
                        case 3:
                            System.out.println("The amount you can use: " + balance);
                            break;
                        case 4:
                            System.out.println("You have logged out. See you later.");
                            break;
                        default:
                            System.out.println("Invalid selection. Please choose a valid option.");
                            break;
                    }
                } while (select != 4);

                break;
            } else {
                right--;
                System.out.println("You entered an incorrect username or password. Please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact the BANK.");
                } else {
                    System.out.println("Your remaining attempts: " + right);
                }
            }
        }
        input.close();
    }
}
