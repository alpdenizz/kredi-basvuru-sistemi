package kbs.servis;

import java.util.HashMap;
import java.util.TreeMap;

import kbs.model.Basvuru;

public class KrediServisi {
	
	private static final TreeMap<Basvuru,Integer> KREDI_SKORU_TABLOSU
		= new TreeMap<Basvuru,Integer>();
	
	public static Integer skorAl(Basvuru basvuru) {
		Integer tabloSkor = KREDI_SKORU_TABLOSU.get(basvuru);
		if(tabloSkor == null) {
			Integer skor = (int) (Math.random() * 2000 + 1);
			KREDI_SKORU_TABLOSU.put(basvuru,skor);	
		}
		return KREDI_SKORU_TABLOSU.get(basvuru);
	}
 
}
