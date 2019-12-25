package kbs.model;

public class Basvuru implements Comparable<Basvuru>{
	
	private String tckno;
	
	private String isim;
	
	private String soyisim;
	
	private Integer aylikGelir;
	
	private String telno;
	
	
	public String getTckno() {
		return tckno;
	}

	public void setTckno(String tckno) {
		this.tckno = tckno;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public Integer getAylikGelir() {
		return aylikGelir;
	}

	public void setAylikGelir(Integer aylikGelir) {
		this.aylikGelir = aylikGelir;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null) return false;
		if(obj instanceof Basvuru) {
			Basvuru b2 = (Basvuru) obj;
			return this.getTckno().equals(b2.getTckno()) &&
					this.getIsim().equals(b2.getIsim()) &&
					this.getSoyisim().equals(b2.getSoyisim());
		}
		return false;
	}
	
	public boolean isValid() {
		return this.tckno != null &&
				this.isim != null &&
				this.soyisim != null &&
				this.telno != null &&
				this.aylikGelir != null;
	}

	@Override
	public int compareTo(Basvuru o) {
		// TODO Auto-generated method stub
		return 0;
	}

}