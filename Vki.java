import java.util.Scanner;

public class Vki {
    public static void main(String[] args) {

        double boy, kilo, vki;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu yaziniz(m): ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu yaziniz(kg): ");
        kilo = input.nextDouble();
        vki = kilo / (boy * boy);

        System.out.println("Boyunuz: " + boy + "Kilonuz: " + kilo + "Vücut kitle indeksininiz(kg/m^2):" + vki);

    }
}