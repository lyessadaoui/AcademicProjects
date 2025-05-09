import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Dialogue4_3 extends JDialog {
	private static final long serialVersionUID = 1L;

	public Dialogue4_3(Frame f) {
		super(f, "Dialogue de TP1, partie 4, exo 3");
		init();
		pack();
		setLocationRelativeTo(f);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	private void init() {
		JPanel panneauHaut = new JPanel();
		JButton b1 = new JButton("Bouton 1");
		JButton b2 = new JButton("Mon deuxième bouton");
		panneauHaut.add(b1);
		panneauHaut.add(b2);
		
		JPanel panneauBas = new JPanel();
		JButton b3 = new JButton("Mon troisième bouton");
		JButton b4 = new JButton("Bouton 4");
		panneauBas.add(b3);
		panneauBas.add(b4);
		
		add(panneauHaut, BorderLayout.NORTH);
		add(panneauBas, BorderLayout.SOUTH);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(() -> new Dialogue4_3(new Frame()));
	}
}
