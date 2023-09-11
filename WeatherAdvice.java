import java.util.Scanner;

public class WeatherAdvice {
    public static void main(String[] args) {
        int temperature;

        Scanner input = new Scanner(System.in);
        System.out.print("What is the air temperature? :");
        temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("You can go skiing!.");
        } else if (temperature >= 5 && temperature >= 25) {
            if (temperature <= 15) {
                System.out.println("You can go o the cinema!.");
            }
            if (temperature >= 10) {
                System.out.println("You can go to the picnic.");
            }
        } else {
            System.out.println("You can go to the swimming.");
        }

    }

}
