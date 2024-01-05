import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int deger = input.nextInt();
        int faktoriyel = 1;

        for(int i=1; i<=deger; i++){
            faktoriyel = faktoriyel *i;
        }
        System.out.println(faktoriyel);
    }

}