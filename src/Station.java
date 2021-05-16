
public class Station {
	private String adresse;
	private String arrondissement;
	private boolean bonus;
	private String numero;
	private boolean ouvert;

	public Station (String unnumero, String uneadresse, boolean unbonus, boolean unouvert) {
		adresse = uneadresse;
		numero = unnumero;
		bonus = unbonus;
		ouvert = unouvert;
		
		int numeronum = Integer.valueOf(numero);
		if(numeronum > 1000 && numeronum < 9999) {
			arrondissement = numero.substring(0, 1);
		} else if (numeronum > 10000 && numeronum < 20999) {
			arrondissement = numero.substring(0, 2);
		} else if (numeronum > 21000 && numeronum < 29999){
			arrondissement = "92";
		} else if (numeronum > 30000 && numeronum < 39999){
			arrondissement = "93";
		} else if (numeronum > 40000 && numeronum < 49999){
			arrondissement = "94";
		}
	}
	
	public String getAdresse() {
		return arrondissement;
	}
	
	public String getArrondissement() {
		return numero;
	}
	
	public boolean isBonus() {
		return bonus;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public boolean isOuvert() {
		return ouvert;
	}
	
	public String toString() {
		return numero + " " + adresse;
	}
}