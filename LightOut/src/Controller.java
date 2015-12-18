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
<<<<<<< HEAD
		
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
		
		
=======
		if(e.getSource()!=mF.getReset()){
			mF.zug();
			int x =((Light)e.getSource()).getX();
			int y =((Light)e.getSource()).getY();
			mP.getLights()[x][y].changeCol();
			if(x>0)mP.getLights()[x-1][y].changeCol();
			if(y>0)mP.getLights()[x][y-1].changeCol();
			if(x<4)mP.getLights()[x+1][y].changeCol();
			if(y<4)mP.getLights()[x][y+1].changeCol();
			for(int i = 0; i < 5; i++){
				for(int j = 0; j < 5; j++){
					if(mP.getLights()[i][j].isLon())
					return;
				}
			}
			i++;
			JOptionPane.showMessageDialog(mP, "Sie haben die "+i+".te Runde geschafft");
		}
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				mP.getLights()[i][j].setLon(false);
			}
		}
		mF.setZug(0);
		switch(i){
		case 0: mP.pattern1(); break;
		case 1: mP.pattern2(); break;  
		case 2: mP.pattern3(); break; 
		case 3: mP.pattern4(); break; 
		default: mP.randomPattern();break;
>>>>>>> origin/master
		}
	}


