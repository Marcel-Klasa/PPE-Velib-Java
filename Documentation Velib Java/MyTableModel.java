import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class MyTableModel extends AbstractTableModel{
	private String[] nomColonnes = {"Num�ro", "Adresse", "Bonus", "Ouvert"};
	private Carte laCarte;
	private ArrayList<Station> lesStations;
	
	public MyTableModel()
	{
		// initialise laCarte grace � Passerelle puis
		// charge l'ensemble des stations de laCarte dans les Stations
		
	}
	
	public int getColumnCount()
	{
		// renvoie le nombre de colonnes
		
	}
	
	public int getRowCount() {
        // renvoie le nombre de stations � g�rer
		
    }
	
	public String getColumnName(int col)
	{
		//renvoie le nom de la colonne col
		
	}
	
	public Object getValueAt(int row, int col)
	{
		// renvoie la valeur de l'attribut correspondant � la colonne col pour la station d'index row
		
	}
	
	public Class getColumnClass(int c) {
        // renvoie la classe d'un �l�ment de la colonne c
		
    }
	
	public void setLesStations(String n) {
		// vide la liste des stations puis 
		// la remplit avec toutes les stations de l'arrondissement n
		
	}
}
