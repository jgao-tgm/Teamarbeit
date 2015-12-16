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


public class View extends JFrame{
	
	private Light[][] lights = new Light[5][5];
	JPanel grids = new JPanel();
	JPanel panel1 = new JPanel();
	private Controller c = new Controller();

	public View() {
		this.setTitle("Lights Out");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); 
		GUI();
	}
	
	public void GUI(){
		this.init();
		this.setContentPane(grids);
		grids.setLayout(new GridLayout(5, 5));
		grids.setBorder(BorderFactory.createTitledBorder(""));
		pattern1();
		repaint();
		this.setVisible(true);
	}
	
	private void init() {
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				lights[i][j] = new Light(i, j, false);
				grids.add(lights[i][j]);
				lights[i][j].addActionListener(c);
			}
		}
	}
	
	public void pattern1() {
		for(int i = 0; i < 5; i+=2){
			for(int j = 0; j < 5; j+=2){
				lights[i][j].changeCol();
			}
		}
	}
	
	public void pattern2() {
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j+=2){
				lights[i][j].changeCol();
			}
		}
	}
	
	public Light[][] getLights() {
		return lights;
	}


}
