import java.util.Scanner;

public class Kapsulleme {
    public static void main(String[] args) {
    Kullanici kullanici = new Kullanici();
        Scanner input = new Scanner(System.in);

    kullanici.bilgileriYazdir();
        System.out.println("Üye olmak için bilgilerinizi giriniz.");
        System.out.print("Adınız:");
        String ad = input.nextLine();

        System.out.print("Soyadınız:");
        String soyad = input.nextLine();

        System.out.print("E-mail adresi : ");
        String email = input.nextLine();

        System.out.print("Yaşınız:");
        int yas = input.nextInt();

        System.out.println("başarıyla kayıt oldunuz.");


        kullanici.setAd(ad);


    }
}