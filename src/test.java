public class test {
	public static void main(String[] args) {
		Carte c = new Carte();
		c = Passerelle.getCarte();
		
		System.out.println(c.nbStations());
		System.out.println(c.getLaStation(0));
		System.out.println(c.chercher("2017"));
		
		FRMStations Fenetre = new FRMStations();
	}
}