import javax.swing.*;
import java.awt.event.*;
public class Controller implements ActionListener{
	private myFrame mF;
	private myPanel mP;
	int i;

	public static void main(String[] args) {
		Controller c = new Controller();
	}
	
	public Controller() {
		mP = new myPanel(this);
		mF = new myFrame(mP,this);
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
=======
		if(!(e.getSource()== mF.getReset())){
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
>>>>>>> origin/master
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
		default: mP.randomPattern();break;
		}
	}
	
}