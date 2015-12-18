import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class myPanel extends JPanel{
	private Light[][] lights;
	
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
	
	public void pattern3() {
		lights[2][2].changeCol();
		lights[2][4].changeCol();
		lights[4][4].changeCol();
		lights[4][2].changeCol();
	}
	
	public void pattern4() {
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				lights[i][j].changeCol();
			}
		}
	}
	
	public Light[][] getLights() {
		return lights;
	}

	public void randomPattern() {
		int anzahl = (int)(Math.random()*15);
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
