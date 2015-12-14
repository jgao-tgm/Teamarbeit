import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class View extends JFrame implements ActionListener{
	
	private Light[][] lights = new Light[5][5];
	private JPanel grids = new JPanel();
	private JPanel panel1 = new JPanel();
	
	public View() {
		this.setTitle("Lights Out");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		GUI();
	}
	
	public void GUI(){
		this.init();
		
		this.add(grids, BorderLayout.CENTER);
		grids.setLayout(new GridLayout(5, 5));
		grids.setBorder(BorderFactory.createTitledBorder(""));
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				grids.add(lights[i][j]);
			}
		}
		
	    this.add(panel1, BorderLayout.SOUTH);
	    panel1.setLayout(new FlowLayout());

	    
		this.setVisible(true);
	}
	
	private void addButton(String label) {
	      JButton button = new JButton("");
	      grids.add(button);
	   }
	
	private void init() {
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				lights[i][j] = new Light(i, j, false);
			}
		}
	}
	
	public static void main (String[] args){
		View v = new View();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
