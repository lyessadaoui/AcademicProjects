import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Fenetre8 extends JFrame {
	private static final long serialVersionUID = 1L;

	public Fenetre8() {
		super("Exercice 7");
		init();
		setSize(600, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	private void init() {
		JTextField saisieHaut = new JTextField("titre");
		saisieHaut.setBackground(Color.YELLOW);
		saisieHaut.setEditable(false);
		saisieHaut.setFocusable(false);
		
		JPanel panneauCentre = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 0, 0, 0);
		JTextArea gauche = new JTextArea();
		JTextArea droite = new JTextArea();
		gauche.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		droite.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0; gbc.weighty = 1;
		panneauCentre.add(gauche, gbc);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.weightx = 1;
		panneauCentre.add(droite, gbc);
		gauche.setText("                                               ");
		
		JPanel panneauBas = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton bQuitter = new JButton("Quitter");
		panneauBas.add(bQuitter);
		
		add(saisieHaut, BorderLayout.NORTH);
		add(panneauBas, BorderLayout.SOUTH);
		add(panneauCentre, BorderLayout.CENTER);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(() -> new Fenetre8());
	}
}
