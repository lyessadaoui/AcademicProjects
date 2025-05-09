import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Dialogue4_2 extends JDialog {
	private static final long serialVersionUID = 1L;

	public Dialogue4_2(Frame f) {
		super(f, "Dialogue de TP1, partie 4, exo 2");
		init();
		setSize(600, 300);
		setLocationRelativeTo(f);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	private void init() {
		JPanel panneauHaut = new JPanel();
		LayoutManager gestionnaireHaut = new BoxLayout(panneauHaut, BoxLayout.X_AXIS);
		panneauHaut.setLayout(gestionnaireHaut);
		JButton b1 = new JButton("Bouton 1");
		JButton b2 = new JButton("Bouton 2");
		panneauHaut.add(b1);
		panneauHaut.add(Box.createHorizontalGlue());
		panneauHaut.add(b2);
		
		
		JPanel panneauCentre = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(2, 2, 2, 2); // Espacement autour des boutons
		JButton b3 = new JButton("Bouton 3");
		JButton b4 = new JButton("Bouton 4");
		// Ajouter des espaces autour des boutons pour bien les centrer
		gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0.45; gbc.weighty = 0.1;
		panneauCentre.add(Box.createGlue(), gbc);
		// Configuration pour bouton 3
		gbc.gridx = 1;
		gbc.weightx = 0.1;
		panneauCentre.add(b3, gbc);
		gbc.gridx = 2; gbc.weightx = 0.45;
		panneauCentre.add(Box.createGlue(), gbc);
		gbc.gridx = 0; gbc.gridy = 1;
		panneauCentre.add(Box.createGlue(), gbc);
		// Configuration pour bouton 4
		gbc.gridx = 1;
		gbc.weightx = 0.1;
		panneauCentre.add(b4, gbc);
		gbc.gridx = 2; gbc.weightx = 0.45;
		panneauCentre.add(Box.createGlue(), gbc);
		gbc.gridx = 0; gbc.gridy = 2; gbc.weighty = 0.8;
		panneauCentre.add(Box.createGlue(), gbc);
		gbc.gridx = 1; gbc.weightx = 0.1;
		panneauCentre.add(Box.createGlue(), gbc);
		gbc.gridx = 2; gbc.weightx = 0.45;
		panneauCentre.add(Box.createGlue(), gbc);
		
		
		JPanel panneauDroit = new JPanel();
		LayoutManager2 gestionnaireDroit = new BoxLayout(panneauDroit, BoxLayout.Y_AXIS);
		panneauDroit.setLayout(gestionnaireDroit);
		JLabel texte = new JLabel("texte");
		texte.setFont(new Font("Monospaced", Font.BOLD, 12));
		panneauDroit.add(Box.createVerticalGlue());
		panneauDroit.add(texte);
		panneauDroit.add(Box.createVerticalGlue());
		/* Autre façon de faire les choses...
		JPanel panneauDroit = new JPanel(new GridBagLayout());
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.fill = GridBagConstraints.BOTH;
		gbc2.insets = new Insets(0, 0, 0, 0); // Espacement autour des boutons
		
		gbc2.gridx = 0; gbc2.gridy = 0; gbc2.weightx = 1; gbc2.weighty = 0.33;
		panneauDroit.add(Box.createGlue(), gbc2);

		gbc2.gridy = 1; gbc2.fill = GridBagConstraints.VERTICAL;
		gbc2.anchor = GridBagConstraints.NORTHEAST;
		panneauDroit.add(new JLabel("texte"), gbc2);
		
		gbc2.gridy = 2;
		panneauDroit.add(Box.createGlue(), gbc2);
		*/
		
		
		// Pour équilibrer...
		JPanel panneauGauche = new JPanel();
		LayoutManager2 gestionnaireGauche = new BoxLayout(panneauGauche, BoxLayout.Y_AXIS);
		panneauGauche.setLayout(gestionnaireGauche);
		JLabel texte2 = new JLabel("     ");
		texte2.setFont(new Font("Monospaced", Font.BOLD, 12));
		panneauGauche.add(Box.createVerticalGlue());
		panneauGauche.add(texte2);
		panneauGauche.add(Box.createVerticalGlue());
		
		
		JPanel panneauBas = new JPanel();
		LayoutManager2 gestionnaireBas = new BoxLayout(panneauBas, BoxLayout.X_AXIS);
		panneauBas.setLayout(gestionnaireBas);
		JButton b5 = new JButton("Bouton 5");
		JButton b6 = new JButton("Bouton 6");
		JButton b7 = new JButton("Bouton 7");
		panneauBas.add(b5);
		panneauBas.add(Box.createHorizontalGlue());
		panneauBas.add(b6);
		panneauBas.add(Box.createHorizontalGlue());
		panneauBas.add(b7);
		
		
		add(panneauHaut, BorderLayout.NORTH);
		add(panneauBas, BorderLayout.SOUTH);
		add(panneauDroit, BorderLayout.EAST);
		add(panneauGauche, BorderLayout.WEST);
		add(panneauCentre, BorderLayout.CENTER);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(() -> new Dialogue4_2(new Frame()));
	}
}
