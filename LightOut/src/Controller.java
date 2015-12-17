import javax.swing.*;
import java.awt.event.*;
public class Controller implements ActionListener{
	private View v;
	private myFrame mF;
	private myPanel mP;
	int i;

	public static void main(String[] args) {
		Controller c = new Controller();
	}
	
	public Controller() {
		mP = new myPanel(this);
		mF = new myFrame(mP);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int x =((Light)e.getSource()).getX();
		int y =((Light)e.getSource()).getY();
		mP.getLights()[x][y].changeCol();
		if(x>0)mP.getLights()[x-1][y].changeCol();
		if(y>0)mP.getLights()[x][y-1].changeCol();
		if(x<4)mP.getLights()[x+1][y].changeCol();
		if(y<4)mP.getLights()[x][y+1].changeCol();
		
		for(int i = 0; i < 5; i+=2){
			for(int j = 0; j < 5; j+=2){
				if(mP.getLights()[i][j].isLon())
				return;
			}
		}
		i++;
		
		JOptionPane.showMessageDialog(mP, "Sie haben die "+i+".te Runde geschafft");
		switch(i){
		case 0: mP.pattern1(); break;
		case 1: mP.pattern2(); break; 
		}
	}
	
}