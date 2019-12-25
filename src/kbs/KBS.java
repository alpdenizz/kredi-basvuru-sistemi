package kbs;

import kbs.servis.HttpServisi;
import kbs.servis.SunucuServisi;
import kbs.servis.SunucuServisi.HttpVerb;

public class KBS {
	
	public static void main(String[] arg){
		start();
    }
	
	public static void start() {
		SunucuServisi.baslat(8080);
		SunucuServisi.servisTanimla(HttpVerb.POST, "/credit-apply", HttpServisi::krediBasvuruKabul);
	}
	
}
