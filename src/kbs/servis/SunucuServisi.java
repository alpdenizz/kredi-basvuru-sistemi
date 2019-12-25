package kbs.servis;

import static spark.Spark.port;
import static spark.Spark.post;

import com.google.gson.Gson;

import kbs.model.Basvuru;
import spark.Response;
import spark.Route;

public class SunucuServisi {
	
	public enum HttpVerb {
		POST, GET, PUT, DELETE;
	}
	
	public static void baslat(int port) {
		port(8080);
	}
	
	public static Basvuru basvuruObjesiYap(String cevirilicek) {
		return new Gson().fromJson(cevirilicek, Basvuru.class);
	}
	
	public static String cevapHazirla(Response response, int status, String mesaj) {
		response.status(status);
		return mesaj;
	}
	
	public static void servisTanimla(HttpVerb verb, String path, Route yönet) {
		if(verb == HttpVerb.POST) {
			post(path, yönet);
		}
	}

}
