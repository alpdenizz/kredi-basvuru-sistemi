package kbs.test;

import org.junit.Test;

import kbs.model.Cevap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class CevapModeliBirimTesti {
	
	@Test
	public void test_hesapla_skor500Alti() {
		Cevap test = Cevap.hesapla(499, null);
		assertEquals("reddedildi", test.getCevap().toLowerCase());
		assertTrue(0 == test.getKredi());
	}
	
	@Test
	public void test_hesapla_skor500_1000Arasinda() {
		Cevap test = Cevap.hesapla(501, 1);
		assertEquals("onaylandi", test.getCevap().toLowerCase());
		assertEquals(10000, test.getKredi().intValue());
		
		Cevap test2 = Cevap.hesapla(999, 1);
		assertEquals("onaylandi", test2.getCevap().toLowerCase());
		assertEquals(10000, test2.getKredi().intValue());
	}
	
	@Test
	public void test_hesapla_skor1000Ustunde() {
		Cevap test = Cevap.hesapla(1001, 1);
		assertEquals("onaylandi", test.getCevap().toLowerCase());
		assertEquals(4, test.getKredi().intValue());
	}

}
