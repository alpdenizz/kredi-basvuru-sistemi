package kbs.servis;

import kbs.model.Basvuru;
import kbs.model.Cevap;

public class CevapServisi {
	
	public static Cevap basvuruyuDegerlendir(Basvuru basvuru) {
		 
		return Cevap.hesapla(
					KrediServisi.skorAl(basvuru), 
					basvuru.getAylikGelir()
				);
	}

}
