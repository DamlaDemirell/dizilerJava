package compositionOrnek;

public class Main {

	public static void main(String[] args) {
	Urun urun1 = new Urun("Iphone 11", "Telefon",22400 , 512, 1);
		
	System.out.println("Sepetiniz aşağıdaki gibidir.");
	UrunYonetimi urunYonetimi = new UrunYonetimi(urun1);
	
	urunYonetimi.ekle();
	urunYonetimi.tip();
	urunYonetimi.stok();
	}

}
