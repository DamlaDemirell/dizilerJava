package oop1;


public class ogrenciSistemi {
	
	private String ad;
	private String soyad;
	private int okulNo;
	private int dogumYili;
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		
		if(ad.isEmpty()) {
			System.out.println("lütfen öğrenci adını giriniz:");
		} else {
			this.ad = ad;
		}
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		if(soyad.isEmpty()) {
			System.out.println("lütfen öğrenci soyadını giriniz:");
		} else {
			this.soyad = soyad;
		}
	}

	public int getOkulNo() {
		return okulNo;
	}
	public void setOkulNo(int okulNo) {
		
		if(okulNo>1000) {
			this.okulNo = okulNo; 
		}else {
			System.out.print("Okul numarasını 1000 üzeri giriniz. ");
		}
		
		
	}
	public int getDogumYili() {
		return dogumYili;
	}
	public void setDogumYili(int dogumYili) {
		if(dogumYili>1900 && dogumYili<2020) {
			this.dogumYili = dogumYili;
		} else {
			System.out.print("Geçerli bir doğum yılı giriniz.");
		}
	}
	
	
}
