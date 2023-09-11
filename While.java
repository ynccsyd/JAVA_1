import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessfull = false;

        while (!passwordSuccessfull) {
            System.out.println("Enter your password: ");
            String typedPassword = scanner.next();
            if (customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("You have entered successfully !");
            }
        }
    }
}

// public static void main(String[] args) {
// Scanner input =new Scanner(System.in);
// int pass;
// boolean askPassword=true;

// do{
// System.out.println("enter password:");
// pass=input.nextInt();
// if(pass==123){
// System.out.println("Correct");
// askPassword=false;
// }else{
// System.out.println("Wrong");
// }
// }while(askPassword);
// }
