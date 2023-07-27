import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double elma, armut, domates, muz, patlican, toplam;
        double elmaFiyat = 2.14;
        double armutFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Elma Kaç Kilo?: ");
        elma = input.nextInt();
        System.out.print("Armut Kaç Kilo: ");
        armut = input.nextInt();
        System.out.print("Domates Kaç Kilo: ");
        domates = input.nextInt();
        System.out.print("Muz Kaç Kilo: ");
        muz = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo: ");
        patlican = input.nextInt();
        toplam = (elmaFiyat * elma) + (armutFiyat * armut) + (domatesFiyat * domates) + (muzFiyat * muz)
                + (patlicanFiyat * patlican);

        System.out.println("Ödemeniz gereken toplam tutar: " + toplam);

    }
}
