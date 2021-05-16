import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import javax.xml.parsers.*;
import org.xml.sax.SAXException;
import org.json.JSONException;
import org.json.JSONObject;

public class Passerelle {
	private static String urlCarto = "https://opendata.paris.fr/api/records/1.0/search/?dataset=velib-disponibilite-en-temps-reel&q=&rows=10000&sort=name";
	private static String urlDispo = "http://www.velib.paris.fr/service/stationdetails/";
	
	Passerelle() throws ParserConfigurationException, SAXException, IOException{
	}
	
	public static Carte getCarte() {
		Carte uneCarte = new Carte();
		
		try {
			//Récupération du fichier JSON en ligne
			InputStream lien = new URL(urlCarto).openStream();
			BufferedReader fichier = new BufferedReader(new InputStreamReader(lien, Charset.forName("UTF-8")));
			//Convertion en format JSON Object
			JSONObject json = new JSONObject(fichier.readLine());
			fichier.close();
			for(int I=0;I<json.getInt("nhits");I++) {
				
				uneCarte.ajouteStation(
						String.valueOf(json.getJSONArray("records").getJSONObject(I).getJSONObject("fields").get("stationcode")),
						String.valueOf(json.getJSONArray("records").getJSONObject(I).getJSONObject("fields").get("name")),
						Boolean.valueOf(json.getJSONArray("records").getJSONObject(I).getJSONObject("fields").get("is_renting").toString()),
						Boolean.valueOf(json.getJSONArray("records").getJSONObject(I).getJSONObject("fields").get("is_renting").toString()));
				
				System.out.println(json.getJSONArray("records")
										.getJSONObject(I)
										.getJSONObject("fields")
										.get("name"));
			}
		}
		catch(FileNotFoundException err){
			System.out.println("Erreur :\n" + err);
		}
		catch(IOException err) {
			System.out.println("Erreur: \n" + err);
		}
		catch(JSONException err) {
			System.out.println("Erreur: \n" + err);
		}
		
		return uneCarte;

	}
	
	public HashMap<String, String> getDispo(String A, String B){
		HashMap<String,String> table = new HashMap<String, String>();
		table.put(A,B);
		return table;
	}
	
	public static void testCarte() {
		try {
			//Récupération du fichier JSON en ligne
			InputStream lien = new URL(urlCarto).openStream();
			BufferedReader fichier = new BufferedReader(new InputStreamReader(lien, Charset.forName("UTF-8")));
			//Convertion en format JSON Object
			JSONObject json = new JSONObject(fichier.readLine());
			fichier.close();
			for(int I=0;I<json.getInt("nhits");I++) {
				System.out.println(json.getJSONArray("records")
										.getJSONObject(I)
										.getJSONObject("fields")
										.get("name"));
			}
		}
		catch(FileNotFoundException err){
			System.out.println("Erreur :\n" + err);
		}
		catch(IOException err) {
			System.out.println("Erreur: \n" + err);
		}
		catch(JSONException err) {
			System.out.println("Erreur: \n" + err);
		}
		catch(NoClassDefFoundError err) {
			System.out.println("Erreur: \n" + err);
		}
		finally{
			System.out.println("OK");
		}
	}
}
