import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FenetreGridLayout extends JFrame {
  private static final long serialVersionUID = 1L;

public FenetreGridLayout() {
    super("GridLayout");
    
    init();
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    pack();
    
    setLocationRelativeTo(null);
    
    setVisible(true);
    }

  private void init() {
    JPanel panneau = new JPanel();
    LayoutManager grille = new GridLayout(4, 3);
    panneau.setLayout(grille);
    String[] noms = {"7", "8", "9",
                     "4", "5", "6",
                     "1", "2", "3",
                     "*", "0", "#"};
    for (int i = 0; i < noms.length; i++) {
      JButton bouton = new JButton(noms[i]);
      panneau.add(bouton);
    }
    setContentPane(panneau);
  }
  
  public static void main(String[] args) {
    //new Fenetre();
    SwingUtilities.invokeLater(() -> new FenetreGridLayout());
  }

}