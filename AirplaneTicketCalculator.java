import java.util.Scanner;

public class AirplaneTicketCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Distance (KM) :");
        int distance = scanner.nextInt();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your Trip Type  (1: One Direction, 2: Round Trip) :");
        int tripType = scanner.nextInt();

        scanner.close();

        // control if data is invalid or not
        if (distance < 0 || age < 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Data is invalid ! ");
            return;
        }

        // Define Base Price (0.10 TL/km)
        double basePrice = 0.10 * distance;

        // define the all discount
        double discount = 0.0;
        if (age < 12) {
            discount = basePrice * 0.50;
        } else if (age >= 12 && age <= 24) {
            discount = basePrice * 0.10;
        } else if (age >= 65) {
            discount = basePrice * 0.30;
        }

        // choose your tripType
        if (tripType == 2) {
            discount += basePrice * 0.20;
        }

        // Calculate the Total Price
        double totalPrice = basePrice - discount;

        System.out.println("Total Price: " + totalPrice + "TL");
    }
}
