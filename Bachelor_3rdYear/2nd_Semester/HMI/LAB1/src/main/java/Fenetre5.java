import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Fenetre5 extends JFrame {
	private static final long serialVersionUID = 1L;

	public Fenetre5() {
		// Création de la fenêtre et attribution du titre
		super("Ma fenêtre 5");
	    
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
		// Méthode 3...
		JPanel panneau = new JPanel();
		
		JButton bouton1 = new JButton("Bouton 1");
	    JButton bouton2 = new JButton("Bouton 2");
	    JButton bouton3 = new JButton("Bouton 3");
	    JButton bouton4 = new JButton("Bouton 4");
	    JButton bouton5 = new JButton("Bouton 5");
	    
	    panneau.add(bouton1);
	    panneau.add(bouton2);
	    panneau.add(bouton3);
	    panneau.add(bouton4);
	    panneau.add(bouton5);
	    
	    setContentPane(panneau);
	}
	
	public static void main(String[] args) {
		// Créer la fenêtre avec le Thread Swing pour éviter "l'interruption" si thread principal...
		SwingUtilities.invokeLater(() -> new Fenetre5());
	}
}
