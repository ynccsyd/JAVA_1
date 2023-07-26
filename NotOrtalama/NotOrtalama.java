package NotOrtalama;

import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner not = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat = not.nextInt();
        System.out.print("Fizik notunuz:");
        fizik = not.nextInt();
        System.out.print("Kimya notunuz:");
        kimya = not.nextInt();
        System.out.print("Turkce notunuz:");
        turkce = not.nextInt();
        System.out.print("Tarih notunuz:");
        tarih = not.nextInt();
        System.out.print("Muzik notunuz:");
        muzik = not.nextInt();
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ort = toplam / 6.0; // Use 6.0 to get a double result in division
        boolean gecmeNotu = ort >= 50;

        // Use ternary operator to display the result
        String sonuc = gecmeNotu ? "Geçti" : "Kaldi";
        System.out.println("Geçme notunuz: " + ort + " " + sonuc);
    }
}
