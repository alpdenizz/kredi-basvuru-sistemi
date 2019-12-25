package kbs.model;

public class Cevap {
	
	private static final int KREDI_LIMIT_CARPANI = 4;
	
	private enum BasvuruCevabi {
		ONAYLANDI, REDDEDILDI;
		
	}
	
	private Cevap() {}
	
	private BasvuruCevabi cevap;
	
	private Integer kredi;
	
	public String getCevap() {
		return cevap.name();
	}
	public Integer getKredi() {
		return kredi;
	}
	
	public static Cevap hesapla(Integer krediSkoru, Integer aylikGelir) {
		Cevap c = new Cevap();
		if(krediSkoru < 500) {
			c.cevap = BasvuruCevabi.REDDEDILDI;
			c.kredi = 0;
			return c;
		}
		if(krediSkoru >= 500 && krediSkoru < 1000 && aylikGelir < 5000) {
			c.cevap = BasvuruCevabi.ONAYLANDI;
			c.kredi = 10000;
			return c;
		}
		c.cevap = BasvuruCevabi.ONAYLANDI;
		c.kredi = KREDI_LIMIT_CARPANI * aylikGelir;
		return c;
	}
	
	public String jsonFormat() {
		StringBuilder sb = new StringBuilder();
		sb.append("{\"basvuruCevabi: ").append("\"").
				append(this.getCevap()).append("\"").append(",")
				.append("\"kredi: ").append("\"").append(this.getKredi())
				.append("\"}");
		return sb.toString();
	}
 
}

