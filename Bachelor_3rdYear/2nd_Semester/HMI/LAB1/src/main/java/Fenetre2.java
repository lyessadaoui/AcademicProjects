import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Fenetre2 extends JFrame {
	private static final long serialVersionUID = 1L;

	public Fenetre2() {
		// Création de la fenêtre et attribution du titre
		super("Ma fenêtre 2");
	    
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
	    JLabel labelNom = new JLabel("Ceci est ma deuxième fenêtre");
	    add(labelNom);
	}
	
	public static void main(String[] args) {
		// Créer la fenêtre avec le Thread Swing pour éviter "l'interruption" si thread principal...
		SwingUtilities.invokeLater(() -> new Fenetre2());
	}
}
