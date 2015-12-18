
import java.awt.Color;

import java.awt.Graphics;

import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JButton;

/**
 * Klasse Light
 * @author Jindra, Gao, Danho
 * @version 14-12-2015
 */
public class Light extends JButton{
	private boolean lon;
	private int x;
	private int y;
	
	/**
	 * Konstruktor
	 * @param x "x-Koordinate" vom Lichtfeld
	 * @param y "y-Koordinate" vom Lichtfeld
	 * @param c Controller
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public Light(int x,int y, Controller c){
		super();
		this.x=x;
		this.y=y;
		lon = false;
	    this.setBackground(Color.BLACK);
	    this.addActionListener(c);
	}
	
	/**
	 * Methode getX
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public int getX() {
		return x;
	}

	/**
	 * Methode isLon
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public boolean isLon() {
		return lon;
	}
	
	/**
	 * Methode setLon
	 * @param lon 
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public void setLon(boolean lon) {
		this.lon=lon;
		this.x=x;
		this.y=y;
		if(lon)this.setBackground(Color.CYAN);
		if(lon)this.setBackground(Color.YELLOW);
		else this.setBackground(Color.BLACK);
	}
	
	/**
	 * Methode getY
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Methode changeCol
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public void changeCol(){
		this.lon = !this.lon;
		if(lon)this.setBackground(Color.CYAN);
		if(lon)this.setBackground(Color.RED);
		else this.setBackground(Color.BLACK);
		this.repaint();
	}
}
