package kbs.test;

import org.junit.Test;
import kbs.model.Basvuru;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class BasvuruModeliBirimTesti {
	
	
	@Test
	public void test_getter_setter_isValid() {
		
		//given
		final Basvuru BASVURU = new Basvuru();
		
		//then
		assertNull(BASVURU.getAylikGelir());
		assertNull(BASVURU.getIsim());
		assertNull(BASVURU.getSoyisim());
		assertNull(BASVURU.getTckno());
		assertNull(BASVURU.getTelno());
		assertFalse(BASVURU.isValid());
		
		//when
		BASVURU.setAylikGelir(100);
		BASVURU.setIsim("isim");
		BASVURU.setSoyisim("soyisim");
		BASVURU.setTckno("tckno");
		BASVURU.setTelno("telno");
		
		//then
		assertSame(100, BASVURU.getAylikGelir());
		assertSame("isim", BASVURU.getIsim());
		assertSame("soyisim", BASVURU.getSoyisim());
		assertSame("tckno", BASVURU.getTckno());
		assertSame("telno", BASVURU.getTelno());
		assertTrue(BASVURU.isValid());
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void test_equals() {
		final Basvuru BASVURU_1 = new Basvuru();
		final Basvuru BASVURU_2 = new Basvuru();
		String notBasvuru = "HELLO-WORLD";
		
		assertFalse(BASVURU_1.equals(null));
		assertFalse(BASVURU_1.equals(notBasvuru));
		
		BASVURU_1.setIsim("isim");
		BASVURU_1.setSoyisim("soyisim");
		BASVURU_1.setTckno("tckno");
		
		BASVURU_2.setIsim("isim");
		BASVURU_2.setSoyisim("soyisim");
		BASVURU_2.setTckno("tckno");
		assertTrue(BASVURU_1.equals(BASVURU_2));
	}
}
