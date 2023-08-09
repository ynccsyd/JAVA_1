package VeriYapilari;

class Araba {
    public String model;
    Araba next;
}

    public static int bul(Araba head) {
        int sonuc = 0;
        for (int i = 1; head.next != null; i++) {
            head = head.next;
            sonuc = i;
        }
        return sonuc;
    }

public class VeriYapilari2 {
    public static void main(String[] args) {
        
    }

}
