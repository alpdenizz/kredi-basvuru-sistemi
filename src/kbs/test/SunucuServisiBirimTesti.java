package kbs.test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import kbs.model.Basvuru;
import kbs.servis.SunucuServisi;

public class SunucuServisiBirimTesti {
	
	private static final String TCKNO = "TCKNO";
	private static final String ISIM = "ISIM";
	private static final String SOYISIM = "SOYISIM";
	private static final String TELNO = "TELNO";
	
	@Test
	public void test_basvuruObjesiYap() {
		String test = "{\n" + 
				"	\"tckno\": \"TCKNO\",\n" + 
				"	\"isim\": \"ISIM\",\n" + 
				"	\"soyisim\": \"SOYISIM\",\n" + 
				"	\"aylikGelir\": 4000,\n" + 
				"	\"telno\": \"TELNO\"\n" + 
				"}";
	
		Basvuru b = SunucuServisi.basvuruObjesiYap(test);
		assertTrue(Arrays.equals(TCKNO.toCharArray(), b.getTckno().toCharArray()));
		assertTrue(Arrays.equals(ISIM.toCharArray(), b.getIsim().toCharArray()));
		assertTrue(Arrays.equals(SOYISIM.toCharArray(), b.getSoyisim().toCharArray()));
		assertTrue(Arrays.equals(TELNO.toCharArray(), b.getTelno().toCharArray()));
		assertTrue(4000 == b.getAylikGelir().intValue());
	}
	
}
