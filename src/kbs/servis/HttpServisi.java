package kbs.servis;

import kbs.model.Basvuru;
import kbs.model.Cevap;
import spark.Request;
import spark.Response;

public class HttpServisi {
	
	public static String krediBasvuruKabul(Request request, Response response) {
		try {
    		Basvuru basvuru = SunucuServisi.basvuruObjesiYap(request.body());
    		if(!basvuru.isValid()) {
    			return SunucuServisi.cevapHazirla(response, 400, "Girdi geçerli değil");
    		}
    		System.out.printf("-----> %s numaranıza SMS gönderilmiştir\n", basvuru.getTelno());
    		return SunucuServisi.cevapHazirla(response, 201, 
    				Cevap.hesapla(KrediServisi.skorAl(basvuru), basvuru.getAylikGelir()).jsonFormat());
    	}catch(Exception e) {
    		response.status(400);
    		return "Hatalı girdi!";
    	}
	}

}
