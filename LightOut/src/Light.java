
<<<<<<< HEAD
=======
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
>>>>>>> origin/master
import java.awt.Color;

import javax.swing.JButton;

public class Light extends JButton{
	private boolean lon;
	private int x;
	private int y;
	
	public Light(int x,int y, Controller c){
		super();
		this.x=x;
		this.y=y;
		lon = false;
	    this.setBackground(Color.BLACK);
	    this.addActionListener(c);
	}
	
	public int getX() {
		return x;
	}

	public boolean isLon() {
		return lon;
	}
	
	public void setLon(boolean lon) {
		this.lon=lon;
<<<<<<< HEAD
		this.x=x;
		this.y=y;
		if(lon)this.setBackground(Color.CYAN);
=======
		if(lon)this.setBackground(Color.YELLOW);
>>>>>>> origin/master
		else this.setBackground(Color.BLACK);
	}

	public int getY() {
		return y;
	}
	
	public void changeCol(){
		this.lon = !this.lon;
<<<<<<< HEAD
		if(lon)this.setBackground(Color.CYAN);
=======
		if(lon)this.setBackground(Color.RED);
>>>>>>> origin/master
		else this.setBackground(Color.BLACK);
		this.repaint();
	}
}
