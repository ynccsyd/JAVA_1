import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden yaziniz: ");
        km = input.nextInt();

        total += (km * perKm);
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar: " + total);

    }
}