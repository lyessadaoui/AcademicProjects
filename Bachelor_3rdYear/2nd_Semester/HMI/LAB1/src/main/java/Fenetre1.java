import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Fenetre1 extends JFrame {
	private static final long serialVersionUID = 1L;

	public Fenetre1() {
		// Création de la fenêtre et attribution du titre
		super("Ma fenêtre 1");
		
		// Fixer la taille de la fenêtre
		setSize(600, 300);
		
		// centrer la fenêtre APRÈS avoir défini sa taille
	    setLocationRelativeTo(null);
	    
	    // rendre la fenêtre visible
	    setVisible(true);
	    
	    // paramétrer la case de fermeture
	    // Noter également DISPOSE_ON_CLOSE (fenêtre fermée, mais pas l'application)
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    // Pour confirmer qu'il s'agit bien du Thread Swing
	    System.out.println(Thread.currentThread().getName());
	}
	
	// À éviter absolument (C'EST UNE CLASSE PAR FRAME/WINDOW/DIALOG)
	public class Dialogue1 extends JDialog {
		private static final long serialVersionUID = 1L;

		public Dialogue1(JFrame f, boolean modal) {
			super(f, "Dialogue 1", modal);
			setSize(300, 400);
			setLocationRelativeTo(f);
			setVisible(true);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		}
	}
	
	public static void main(String[] args) {
		// Créer la fenêtre avec le Thread Swing pour éviter "l'interruption" si thread principal...
		SwingUtilities.invokeLater(() -> {Fenetre1 f = new Fenetre1();
										  f.new Dialogue1(f, true);});
	}
}
