import java.util.Random;

public class PredictionNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        System.out.println(number);

    }
}
