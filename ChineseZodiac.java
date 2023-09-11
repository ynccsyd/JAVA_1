import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        scanner.close();

        // Define
        String[] zodiacSigns = {
                "Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox",
                "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"
        };
        int zodiacIndex = birthYear % 12;

        System.out.println("Your Chinese Zodiac Sign: " + zodiacSigns[zodiacIndex]);
    };
}
