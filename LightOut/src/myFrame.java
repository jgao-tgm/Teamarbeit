import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class myFrame extends JFrame{

	public myFrame(JPanel grids) {
		super();
		this.setContentPane(grids);
		this.setTitle("Lights Out");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); 
		this.setSize(500, 500);
		this.repaint();
		this.setVisible(true);
	}

}
