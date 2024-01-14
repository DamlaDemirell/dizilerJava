package compositionOrnek;

public class UrunYonetimi {
	public Urun urun;
	

	
	public UrunYonetimi(Urun urun) {
		this.urun = urun; // istediğim zaman ulaşabilirim.//
	 }
	public void ekle() {
		System.out.println("Ürün eklendi : " + urun.isim);
	}
	public void tip() {
		System.out.println("Ürün tipi : " +urun.kategori);
		
	}
	public void stok() {
		System.out.println("Ürün stoğu : " +urun.Stok);
	
	}
}
	
	

