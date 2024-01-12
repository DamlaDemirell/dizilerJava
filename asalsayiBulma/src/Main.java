public class Main {

    public static boolean asalKontrol(int sayi) {
        boolean sonuc = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sonuc = false;
                break;
            }
        }
        return sonuc;
    }


    public static void main(String[] args) {
        System.out.println(asalKontrol(11));

    }
}