import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class MyTableModel extends AbstractTableModel{
	private String[] nomColonnes = {"Numéro", "Adresse", "Bonus", "Ouvert"};
	private Carte laCarte;
	private ArrayList<Station> lesStations;
	
	public MyTableModel()
	{
		// initialise laCarte grace à Passerelle puis
		// charge l'ensemble des stations de laCarte dans les Stations
		laCarte = Passerelle.getCarte();
	}
	
	public int getColumnCount()
	{
		// renvoie le nombre de colonnes
		return 0;
	}
	
	public int getRowCount() {
        // renvoie le nombre de stations à gérer
		return 0;
    }
	
	public String getColumnName(int col)
	{
		//renvoie le nom de la colonne col
		return null;
	}
	
	public Object getValueAt(int row, int col)
	{
		// renvoie la valeur de l'attribut correspondant à la colonne col pour la station d'index row
		return null;
	}
	
	public Class getColumnClass(int c) {
        // renvoie la classe d'un élément de la colonne c
		return null;
    }
	
	public void setLesStations(String n) {
		// vide la liste des stations puis 
		// la remplit avec toutes les stations de l'arrondissement n
		
	}
}
	