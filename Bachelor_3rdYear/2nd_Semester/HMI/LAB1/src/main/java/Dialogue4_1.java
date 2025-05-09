import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Dialogue4_1 extends JDialog {
	private static final long serialVersionUID = 1L;

	public Dialogue4_1(Frame f) {
		super(f, "Dialogue de TP1, partie 4, exo 1");
		setSize(600, 300);
		init();
		setLocationRelativeTo(f);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	private void init() {
		JPanel panneau = (JPanel) getContentPane();
		
		JPanel panneauHaut = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton b1 = new JButton("Fenetre 1");
		JButton b2 = new JButton("Fenetre 2");
		JButton b3 = new JButton("Fenetre 3");
		panneauHaut.add(b1);
		panneauHaut.add(b2);
		panneauHaut.add(b3);
		
		JPanel panneauBas = new JPanel(new FlowLayout(FlowLayout.LEADING));
		
		JPanel panneauBasInterne = new JPanel();
		LayoutManager gestionnaire = new BoxLayout(panneauBasInterne, BoxLayout.Y_AXIS);
		panneauBasInterne.setLayout(gestionnaire);
		
		JButton b4 = new JButton("Fenetre 4");
		JButton b5 = new JButton("Fenetre 5");
		panneauBasInterne.add(b4);
		panneauBasInterne.add(b5);
		panneauBas.add(panneauBasInterne);
		
		panneau.add(panneauHaut, BorderLayout.NORTH);
		panneau.add(panneauBas, BorderLayout.SOUTH);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(() -> new Dialogue4_1(new Frame()));
	}
}
