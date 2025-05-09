import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SplashScreen extends JDialog {
	private static final long serialVersionUID = 1L;

	public SplashScreen() {
		super(new JFrame(), false);
		
		setTitle("Splash screen");
		
		setSize(200, 200);
		
		setLocationRelativeTo(null);
	   
	    setVisible(true);
	    
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	    
	    setAlwaysOnTop(true);
	}
	
	public static void main(String args[]) {
		final SplashScreen[] splsh = new SplashScreen[1];
		try {
			SwingUtilities.invokeAndWait(() -> {splsh[0] = new SplashScreen();});
			Thread.sleep(1000);
			final Fenetre1[] fen1 = new Fenetre1[1];
			SwingUtilities.invokeLater(() -> fen1[0] = new Fenetre1());
			Thread.sleep(1000);
			SwingUtilities.invokeLater(() -> fen1[0].new Dialogue1(fen1[0], false));
		} catch(InterruptedException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		Runnable thread = new Runnable() {
			public void run() {	
				try {			
					for(int i = 1; i <= 10; i++) {
						System.out.println("*********************************************************" + i);
						if(i == 5) {
							// Fermeture de La fenêtre SplashScreen
							SwingUtilities.invokeLater(() -> splsh[0].dispose());
						} else if(i == 10) {
							System.exit(0);
						}
						Thread.sleep(1000);
					}
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(thread).start();
	}
}
