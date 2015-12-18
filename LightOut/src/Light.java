
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
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
		if(lon)this.setBackground(Color.YELLOW);
		else this.setBackground(Color.BLACK);
	}

	public int getY() {
		return y;
	}
	
	public void changeCol(){
		this.lon = !this.lon;
		if(lon)this.setBackground(Color.RED);
		else this.setBackground(Color.BLACK);
	}
}
