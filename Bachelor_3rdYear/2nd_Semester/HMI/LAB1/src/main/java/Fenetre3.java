import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Fenetre3 extends JFrame {
	private static final long serialVersionUID = 1L;

	public Fenetre3() {
		// Création de la fenêtre et attribution du titre
		super("Ma fenêtre 3");
	    
	    // rendre la fenêtre visible
	    setVisible(true);
	    
	    // paramétrer la case de fermeture
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    // Initialiser le contenu de la fenetre
	    init();
	    
	    // calculer la taille automatiquement...
	    pack();
	    
	    // centrer la fenêtre APRÈS avoir défini sa taille
	    setLocationRelativeTo(null);
	}
	    
	public void init() {
		// Méthode 1...
		JPanel panneau = new JPanel();
	    JLabel labelNom = new JLabel("texte dans un JPanel");
	    panneau.add(labelNom);
	    add(panneau);
	}
	
	public static void main(String[] args) {
		// Créer la fenêtre avec le Thread Swing pour éviter "l'interruption" si thread principal...
		SwingUtilities.invokeLater(() -> new Fenetre3());
	}
}
