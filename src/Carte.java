import java.util.ArrayList;

public class Carte {
	private ArrayList<Station> mesStations;
	
	public Carte() {
		this.mesStations = new ArrayList<Station>();
		
	}
	
	public void ajouteStation(String unnumero, String uneadresse, boolean unbonus, boolean unouvert) {
		Station NouvelleStation = new Station(unnumero,uneadresse,unbonus,unouvert);
		mesStations.add(NouvelleStation);
	}
	
	public Station chercher(String uneStation) {
		return null;
	}
	
	public Station getLaStation(int uneStation) {
		Station returnStation = this.mesStations.get(uneStation);
		return returnStation;
	}
	
	public int nbStations() {
		return mesStations.size();
	}
}
