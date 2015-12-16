import java.awt.Color;

import javax.swing.JButton;

public class Light extends JButton{
	boolean lon;
	int x;
	int y;
	
	public int getX() {
		return x;
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
		lon = !lon;
		if(lon)this.setBackground(Color.YELLOW);
		else this.setBackground(Color.BLACK);
		repaint();
	}
}
