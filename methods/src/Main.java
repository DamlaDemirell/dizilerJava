import java.util.Scanner;

public class Main {
    public static double ortalamaBul (int sayi1, int sayi2) {
        int toplam = sayi1+sayi2;
        double ortalama = toplam / 2;
        return ortalama; // geriye değer döndürür.
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz:");
        int sayi1 = input.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int sayi2 = input.nextInt();
        double sonuc = ortalamaBul(sayi1,sayi2);
        System.out.println(sonuc);
    }
}