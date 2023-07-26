
import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] arg) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucreti giriniz: ");
        tutar = input.nextDouble();

        if (tutar <= 1000) {
            kdvOran = 0.18; // 18% KDV for amounts between 0 and 1000 TL
        } else {
            kdvOran = 0.08; // 8% KDV for amounts greater than 1000 TL
        }

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdv'siz tutar: " + tutar);
        System.out.println("Kdv Orani : " + kdvOran);
        System.out.println("Kdv Tutarı: " + kdvTutar);
        System.out.println("Kdv'li tutar: " + kdvliTutar);

    }
}
