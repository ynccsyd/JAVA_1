package VeriYapilari;

import java.util.Scanner;

class ogrenci {
    public String ad_soyad;
    public int yas;

    ogrenci next;
}

public class VeriYapilari1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Sayi girin: ");
        int sayi = k.nextInt();
        ogrenci head;

        ogrenci ilk = new ogrenci();
        System.out.println("Ad ve soyad girin: ");
        ilk.ad_soyad = k.next();

        System.out.println("Yas Girin: ");
        ilk.yas = k.nextInt();
        head = ilk;

        for (int i = 1; i < sayi; i++) {
            ilk.next = new ogrenci();
            ilk = ilk.next;
            System.out.println("Ad Soyad Girin: ");
            ilk.ad_soyad = k.next();
            System.out.println("Yas Girin: ");
            ilk.yas = k.nextInt();
        }
        ilk.next = null;
    }
}
