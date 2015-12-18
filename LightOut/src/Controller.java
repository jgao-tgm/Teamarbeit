import javax.swing.*;

import java.awt.event.*;

/**
 * Klasse Controller
 * @author Jindra, Gao, Danho
 * @version 14-12-2015
 */
public class Controller implements ActionListener{
	
	View v;
	int i;
	
	/**
	 * Methode main
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public static void main(String[] args) {
		Controller c = new Controller();
		View v = new View();
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
		JOptionPane.showMessageDialog(null, "Sie haben die "+i+".te Runde geschafft");
		
		
		}
	}


