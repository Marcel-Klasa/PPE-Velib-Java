import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

public class FrmStations extends JFrame{
	private JLabel adr;
	private JLabel cbC;
	private JLabel dispoC;
	private JLabel libreC;
	private JLabel ouvertC;
	private MyTableModel maTable;
	private JTable res;
	private JLabel totC;
	private JLabel maj;
	
	public FrmStations() {
		super("Disponibilité des stations de Vélib");
		maTable = new MyTableModel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.init();
		this.setVisible(true);
		
		init();
	}
	
	private void init() {
		res = new JTable(maTable);
		res.setPreferredScrollableViewportSize(new Dimension(700,300));
		res.setFillsViewportHeight(true);
		res.setRowSelectionAllowed(true);
		res.setColumnSelectionAllowed(false);
		JScrollPane scrollPane = new JScrollPane(res);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
