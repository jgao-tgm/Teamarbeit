import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

/**
 * Klasse myPanel
 * @author Gao, Jindra(überarbeitet)
 * @version 14-12-2015
 */
public class myPanel extends JPanel{
	private Light[][] lights;
	
	/**
	 * Konstruktor
	 * @param c
	 * @since 14-12-2015
	 */
	public myPanel(Controller c) {
		super();
		lights = new Light[5][5];
		for(int i = 0; i <5; i++){
			for(int j = 0; j < 5; j++){
				lights[i][j] = new Light(i, j, c);
				this.add(lights[i][j]);
			}		
		}
		this.setLayout(new GridLayout(5, 5));
		pattern1();

	}
	
	/**
	 * Methode pattern1
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
	 * Methode pattern3
	 * @since 14-12-2015
	 */
	public void pattern3() {
		lights[1][1].changeCol();
		lights[1][3].changeCol();
		lights[3][3].changeCol();
		lights[3][1].changeCol();
	}
	
	/**
	 * Methode pattern4
	 * @since 14-12-2015
	 */
	public void pattern4() {
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				lights[i][j].changeCol();
			}
		}
		for(int i = 0; i < 5; i+=2){
			for(int j = 0; j < 5; j+=2){
				lights[i][j].changeCol();
			}
		}
	}
	
	/**
	 * Methode getLights
	 * @since 14-12-2015
	 */
	public Light[][] getLights() {
		return lights;
	}

	/**
	 * Methode randomPattern
	 * @since 14-12-2015
	 */
	public void randomPattern() {
		int anzahl = (int)(Math.random()*15)+1;
		int i = 0;
		int x;
		int y;
		while(i<anzahl){
			x = (int)(Math.random()*5);
			y = (int)(Math.random()*5);
			lights[x][y].changeCol();
			i++;
		}
	}

}
