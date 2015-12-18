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

/**
 * Klasse View
 * @author Jindra, Gao, Danho
 * @version 14-12-2015
 *
 */
public class View extends JFrame{
	
	private Light[][] lights = new Light[5][5];
	JPanel grids = new JPanel();
	JPanel panel1 = new JPanel();
	private Controller c = new Controller();
	private JLabel klicks;
	int clicks;

	/**
	 * Konstruktor 
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public View() {
		this.setTitle("Lights Out");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); 
		GUI();
	}
	
	/**
	 * Methode GUI 
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public void GUI(){
		this.init();
		this.setContentPane(grids);
		grids.setLayout(new GridLayout(5, 5));
		grids.setBorder(BorderFactory.createTitledBorder(""));
		pattern1();
		this.setVisible(true);
	}
	
	/**
	 * Methode init 
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	private void init() {
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				lights[i][j] = new Light(i, j, null);
				grids.add(lights[i][j]);
				lights[i][j].addActionListener(c);
			}
		}
	}
	
	/**
	 * Methode pattern1
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public void pattern1() {
		for(int i = 0; i < 5; i+=2){
			for(int j = 0; j < 5; j+=2){
				lights[i][j].changeCol();
			}
		}
	}
	
	/**
	 * Methode pattern2
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public void pattern2() {
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j+=2){
				lights[i][j].changeCol();
			}
		}
	}
	
	/**
	 * Methode getLights
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public Light[][] getLights() {
		return lights;
	}


}
