import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class myPanel extends JPanel{
	private Light[][] lights;
	
	public myPanel(Controller c) {
		super();
		lights = new Light[5][5];
		for(int i = 0; i <5; ++i){
			for(int j = 0; j < 5; ++j){
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
	
	public Light[][] getLights() {
		return lights;
	}

}
