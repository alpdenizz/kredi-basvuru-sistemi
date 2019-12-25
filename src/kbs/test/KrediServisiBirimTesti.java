package kbs.test;

import org.junit.Test;

import kbs.model.Basvuru;
import kbs.servis.KrediServisi;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class KrediServisiBirimTesti {
	
	@Test
	public void test_basvuru_kayit_et_ve_tut() {
		Basvuru test = new Basvuru();
		test.setTckno("tckno");
		test.setIsim("isim");
		test.setSoyisim("soyisim");
		
		int skor = KrediServisi.skorAl(test);
		
		assertTrue(skor == KrediServisi.skorAl(test));
	}
}
