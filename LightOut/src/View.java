import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class View extends JFrame {
	
	private static final JButton[] JButton = null;
	private JButton ng = new JButton("new");
	private JPanel grids = new JPanel();
	private JPanel panel1 = new JPanel();
	
	public View() {
		this.setTitle("Lights Out");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		
		this.add(grids, BorderLayout.CENTER);
		grids.setLayout(new GridLayout(5, 5));
		grids.setBorder(BorderFactory.createTitledBorder("Leesss Goo"));
		
		for(int i = 0; i < 25; i++){
			addButton("");
		}
		
	    this.add(panel1, BorderLayout.SOUTH);
	    panel1.setLayout(new FlowLayout());
	    panel1.add(ng);
	    
		this.setVisible(true);
	}
	
	private void addButton(String label) {
		   
	      JButton button = new JButton("");
	      grids.add(button);
	   }
	
	public static void main (String[] args){
		View v = new View();
	}

}
