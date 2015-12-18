import javax.swing.*;
import java.awt.event.*;
public class Controller implements ActionListener{
	static View v;
	int i;

	public static void main(String[] args) {
		v = new View ();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int x =((Light)e.getSource()).getX();
		int y =((Light)e.getSource()).getY();
		v.getLights()[x][y].changeCol();
		if(x>0)v.getLights()[x-1][y].changeCol();
		if(y>0)v.getLights()[x][y-1].changeCol();
		if(x<6)v.getLights()[x+1][y].changeCol();
		if(y<6)v.getLights()[x][y+1].changeCol();
		for(int i = 0; i < 5; i+=2){
			for(int j = 0; j < 5; j+=2){
				if(v.getLights()[i][j].isLon())
				return;
			}
		}
		i++;
		
		JOptionPane.showMessageDialog(v.grids, "Sie haben die "+i+".te Runde geschafft");
		switch(i){
		case 1: v.pattern2(); v.repaint(); break; 
		}
	}
	
}