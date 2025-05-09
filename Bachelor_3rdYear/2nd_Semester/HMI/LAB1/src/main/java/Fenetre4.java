import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Fenetre4 extends JFrame {
	private static final long serialVersionUID = 1L;

	public Fenetre4() throws IOException {
		// Création de la fenêtre et attribution du titre
		super("Ma fenêtre 4");
	    
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
	    
	public void init() throws IOException {
		// Méthode 2...
		JPanel panneau = (JPanel) getContentPane();
		// panneau.setLayout(new BorderLayout()); // Nécessaire ? Non
		
		JLabel labelNom = new JLabel("Mont Saint-Michel");
		JLabel labelImage = new JLabel(getIconFromResource("ane.png"));
		panneau.add(labelNom, BorderLayout.NORTH);
		panneau.add(labelImage, BorderLayout.CENTER);
	}
	
	// Pas besoin de spécifier que l'image se trouve dans le répertoire resources...
	private static Icon getIconFromResource(String nomFichier) throws IOException {
		Icon icone;
		InputStream fichier = Thread.currentThread()
		.getContextClassLoader()
		.getResourceAsStream(nomFichier);
		if (fichier == null) {
		throw new IOException("Image non trouvée");
		}
		BufferedImage image = ImageIO.read(fichier);
		icone = new ImageIcon(image);
		return icone;
		}
	
	public static void main(String[] args) {
		// Créer la fenêtre avec le Thread Swing pour éviter "l'interruption" si thread principal...
		SwingUtilities.invokeLater(() -> {
			try {
				new Fenetre4();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
