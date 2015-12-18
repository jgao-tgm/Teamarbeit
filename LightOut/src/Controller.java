import javax.swing.*;
import java.awt.event.*;

/**
 * Klasse Controller
 * @author Jindra, Gao, Danho
 * @version 14-12-2015
 */
public class Controller implements ActionListener{
	private myFrame mF;
	private myPanel mP;
	int i;

	/**
	 * Methode main
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public static void main(String[] args) {
		Controller c = new Controller();
	}
	
	/**
	 * Konstruktor 
	 * @author Jindra, Gao, Danho
	 * @since 14-12-2015
	 */
	public Controller() {
		mP = new myPanel(this);
		mF = new myFrame(mP,this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()!=mF.getReset()){
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
		}
	}
	
}