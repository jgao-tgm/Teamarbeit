<<<<<<< HEAD
import java.awt.Color;

import javax.swing.JButton;

public class Light extends JButton{
	boolean lon;
	int x;
	int y;
	public Light(int x,int y, boolean lon){
		this.lon=lon;
		this.x=x;
		this.y=y;
	}
	
	public void changeCol(){
		if(lon)this.setBackground(Color.YELLOW);
		else this.setBackground(Color.BLACK);
	}
}
=======
import java.awt.Color;

import javax.swing.JButton;

public class Light extends JButton{
	private boolean lon;
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public boolean isLon() {
		return lon;
	}

	public int getY() {
		return y;
	}

	public Light(int x,int y, boolean lon){
		this.lon=lon;
		this.x=x;
		this.y=y;
		if(lon)this.setBackground(Color.YELLOW);
		else this.setBackground(Color.BLACK);
		repaint();
	}
	
	public void changeCol(){
		this.lon = !this.lon;
		if(lon)this.setBackground(Color.YELLOW);
		else this.setBackground(Color.BLACK);
		repaint();
	}
}
>>>>>>> origin/master
