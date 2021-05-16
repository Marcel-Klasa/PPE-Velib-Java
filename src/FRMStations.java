import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FRMStations extends JFrame {

	private JPanel JPanel;
	private JButton bAffprec;
	private JButton baffsuiv;
	private JButton bAjout;
	private JButton bQuit;
	private int numCourant;
	private JTable table;
	

	public FRMStations() {
		
		numCourant = 0;
		
		//setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 190);
		JPanel = new JPanel();
		JPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(JPanel);
		JPanel.setLayout(null);
		
		bAffprec = new JButton("<< Affiche");
		bAffprec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//affichePrec();
			}
		});
		bAffprec.setBounds(249, 119, 117, 25);
		JPanel.add(bAffprec);
		
		baffsuiv = new JButton("Affiche >>");
		baffsuiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//afficheSuiv();
			}
		});
		baffsuiv.setBounds(378, 119, 117, 25);
		JPanel.add(baffsuiv);
		
		bAjout = new JButton("Ajout");
		bAjout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//ajoutePersonne();
			}
		});
		bAjout.setBounds(120, 119, 117, 25);
		JPanel.add(bAjout);
		
		bQuit = new JButton("QUITTER");
		bQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		bQuit.setBounds(507, 119, 117, 25);
		JPanel.add(bQuit);
		
		table = new JTable();
		table.setBounds(12, 90, 726, -93);
		JPanel.add(table);
		
		setVisible(true);
		setDefaultCloseOperation(0);
	}
	
	/*private void ajoutePersonne() { //Vérifier si tout les champs sont remplis, sinon ajouter une personne avec les variables des champs
		if(Nom_textField.getText().isEmpty() ||
			Prenom_textField.getText().isEmpty() ||
			Rue_textField.getText().isEmpty() ||
			CP_textField.getText().isEmpty() ||
			Ville_textField.getText().isEmpty() ||
			Tel_textField.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Erreur, Remplisez les champs.","Attention",JOptionPane.WARNING_MESSAGE);
		} else {
			
		}
	}
	
	public static void ajoutePersonne(String Nom,String Prenom,String Rue,String CP,String Ville,String Tel){
		
	}
	
	private void affichePrec() {
		if(numCourant-1 >= 0) {
			numCourant--;
			//ChangerTextField();
			lblId.setText(("ID # " + numCourant+1));
		}
	}
	
	private void afficheSuiv() {
		
	}*/
}
