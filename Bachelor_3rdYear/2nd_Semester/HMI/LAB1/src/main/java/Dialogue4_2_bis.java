import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Dialogue4_2_bis extends JDialog {
    private static final long serialVersionUID = 1L;

    public Dialogue4_2_bis(JFrame f) {
        super(f, "Dialogue de TP1, partie 4, exo 2, bis");
        init();
        pack();
        setLocationRelativeTo(f);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void init() {
        // Création des boutons
        JButton b1 = new JButton("Bouton 1");
        JButton b2 = new JButton("Mon deuxième bouton");
        JButton b3 = new JButton("Mon troisième bouton");
        JButton b4 = new JButton("Bouton 4");
        
        // Panneau central avec GridBagLayout
        JPanel panneauCentre = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Paramètres de base pour les contraintes des boutons
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(0, 0, 0, 0); // Espacement autour des boutons

        // Première ligne : centrer le bouton 1 et bouton 2
        gbc.anchor = GridBagConstraints.WEST; gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0.5; gbc.weighty = 0.5; // Poids pour le centrage
        panneauCentre.add(b1, gbc);

        gbc.gridx = 1;
        panneauCentre.add(b2, gbc);

        // Deuxième ligne : centrer le bouton 3 et bouton 4
        gbc.gridy = 1; gbc.gridx = 0;
        panneauCentre.add(b3, gbc);

        gbc.gridx = 1;
        panneauCentre.add(b4, gbc);

        // Ajouter le panneau avec les boutons à la fenêtre
        add(panneauCentre, BorderLayout.CENTER);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new Dialogue4_2_bis(new JFrame()));
    }
}
