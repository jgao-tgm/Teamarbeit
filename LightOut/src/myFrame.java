import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Robot;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.glass.events.KeyEvent;

public class myFrame extends JFrame{

	public myFrame(myPanel grids) {
		super();
		this.setContentPane(grids);															
		this.setTitle("Lights Out");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); 
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
