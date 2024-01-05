import java.util.Scanner;

public class Main {
    public static void buyukBul(int sayi1, int sayi2){
        if(sayi1>sayi2){
            System.out.println(sayi1 + "Büyüktür.");
        } else if (sayi2>sayi1) {
            System.out.println(sayi2 + "Büyüktür.");
        }else {
            System.out.println("İki sayıda birbirine eşittir.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        int sayi1= input.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        buyukBul(sayi1,sayi2);
    }
}