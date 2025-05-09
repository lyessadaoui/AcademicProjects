import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreCardLayout extends JFrame {

	private static final long serialVersionUID = 1L;

	public FenetreCardLayout() {
		super("CardLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
		setSize(400, 200);
		setVisible(true);
	}
	
	private void init() {
	    // Créer le conteneur avec CardLayout
        JPanel cardPanel = new JPanel(new CardLayout());

        // Créer les 4 panneaux contenant les mots
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("bonjour"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("tout"));

        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("le"));

        JPanel panel4 = new JPanel();
        panel4.add(new JLabel("monde"));

        // Ajouter les panneaux dans le cardPanel
        cardPanel.add(panel1, "bonjour");
        cardPanel.add(panel2, "tout");
        cardPanel.add(panel3, "le");
        cardPanel.add(panel4, "monde");

        // Ajouter le cardPanel au frame
        add(cardPanel);

        // Créer un Timer pour effectuer le défilement automatique
        Timer timer = new Timer(2000, new ActionListener() {
            private int count = 0; // Nombre de fois que le cycle a été effectué

            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                
                // Faire défiler les cartes 2 fois (5 mots)
                if (count < 8) {  // 4 mots * 2 (pour 2 cycles)
                    switch (count % 4) {
                        case 0:
                            cardLayout.show(cardPanel, "bonjour");
                            break;
                        case 1:
                            cardLayout.show(cardPanel, "tout");
                            break;
                        case 2:
                            cardLayout.show(cardPanel, "le");
                            break;
                        case 3:
                            cardLayout.show(cardPanel, "monde");
                            break;
                    }
                    count++;
                } else if (count == 8) {
                    // Afficher "tout" pendant 2 secondes
                    cardLayout.show(cardPanel, "tout");
                    count++;
                } else if (count == 9) {
                    // Afficher "le" pendant 2 secondes
                    cardLayout.show(cardPanel, "le");
                    count++;
                } else if (count == 10) {
                    // Afficher "bonjour" pendant 2 secondes
                    cardLayout.show(cardPanel, "bonjour");
                    count++;
                }
            }
        });

        // Démarrer le Timer
        timer.start();
    }

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new FenetreCardLayout());
	}
}
