
import java.util.Scanner;

public class UcgenAlanHesapla {
    public static void main(String[] arg) {
        // Degiskenleri olustur
        int a, b, c;
        double alan, cevre, u;

        // Kullanicidan verileri al
        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci kenari giriniz: ");
        a = girdi.nextInt();
        System.out.print("İkinci kenari giriniz: ");
        b = girdi.nextInt();
        System.out.print("Ucuncu kenari giriniz: ");
        c = girdi.nextInt();

        u = (a + b + c) / 2;
        cevre = 2 * u;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Ucgenin Alani: " + alan);
    }
}
