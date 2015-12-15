
import java.awt.event.*;
public class Controller implements ActionListener{
	static View v;

	public static void main(String[] args) {
		v = new View ();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int x =((Light)e.getSource()).getX();
		int y =((Light)e.getSource()).getY();
		v.getLights()[x-1][y].changeCol();
		v.getLights()[x][y-1].changeCol();
		v.getLights()[x+1][y].changeCol();
		v.getLights()[x][y+1].changeCol();
	}
	
}