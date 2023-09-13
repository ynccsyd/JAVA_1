import java.util.Scanner;

public class ATMProject {
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
                    System.out.println("1-Deposite money .\n" +
                            "2-Withdraw money.\n" +
                            "3-Show balance.\n" +
                            "4-Exit");
                    System.out.println("Select the action you want to:");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.println("Enter the amount of money:");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.println("Enter the amount of money:");
                        int price = input.nextInt();
                        if (balance < price) {
                            System.out.println("Sorry, unsufficient funds...Check your balance.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("The amount you can use: " + " " + balance);
                    }
                } while (select != 4);
                System.out.println("You have logged out.See you later.");
                break;
            } else {
                right--;
                System.out.println("You entered an incorrect username or password. Please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact the BANK");
                } else {
                    System.out.println("Your remaining right: " + right);
                }

            }
        }
        input.close();
    }
}
