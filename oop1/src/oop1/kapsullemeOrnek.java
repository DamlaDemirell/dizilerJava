package oop1;
import java.util.Scanner;
public class kapsullemeOrnek {

	public static void main(String[] args) {
		ogrenciSistemi ogrenci = new ogrenciSistemi();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Öğrenci adı: ");
		String ad = input.nextLine();
		
		System.out.print("Öğrenci soyadı : ");
		String soyad =input.nextLine();
		
		System.out.print("Öğrenci okul numarası : ");
		int okulNo = input.nextInt();
		
		System.out.print("Öğrenci doğum yılı: ");
		int dogumYili = input.nextInt();
		
		
		ogrenci.setAd(ad);
		ogrenci.setSoyad(soyad);
		ogrenci.setOkulNo(okulNo);
		ogrenci.setDogumYili(dogumYili);
		
		

	}

}
