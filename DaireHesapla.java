import java.util.Scanner;

public class DaireHesapla {
    public static void main(String[] args) {
        int yaricap, aci;
        double pi = 3.14, alan, cevre, daireDilimiAlani;

        Scanner input = new Scanner(System.in);
        System.out.print("Yaricapi yaziniz: ");
        yaricap = input.nextInt();
        System.out.print("Açıyı yaziniz: ");
        aci = input.nextInt();
        alan = pi * yaricap * yaricap;
        cevre = 2 * pi * yaricap;
        daireDilimiAlani = ((pi * yaricap * yaricap) * aci) / 360;

        System.out.println("Dairenin alani: " + alan);
        System.out.println("Dairenin cevresi: " + cevre);
        System.out.println("Daire dilimi alani: " + daireDilimiAlani);
    }
}