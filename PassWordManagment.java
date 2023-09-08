import java.util.Scanner;

public class PassWordManagment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "java123";

        System.out.print("Enter your password: ");
        String enteredPassword = input.nextLine();

        if (enteredPassword.equals(password)) {
            System.out.println("Login successful.");
        } else {
            System.out.println(("Incorrect password. Do you want to reset your password? (Yes/No): "));
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("Yes")) {
                System.out.println("Enter your new password: ");
                String newPassword = input.nextLine();

                if (newPassword.equals(enteredPassword)) {
                    System.out.println("The new password cannot be the same as the old password.");
                } else {
                    System.out.println("Password created.");
                }
            } else {
                System.out.println("Password reset operation canceled.");
            }

        }
        input.close();
    }
}
