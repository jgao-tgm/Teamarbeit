import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Robot;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.glass.events.KeyEvent;

public class myFrame extends JFrame{
	private JPanel all;
	private JPanel top;
	private JLabel z�hlen;
	private JButton reset;
	private Controller c;
	private int zug;
	private myPanel grids;
	
	public void zug(){
		zug++;
		getZ�hlen().setText("Zug Nr. : "+getZug());
	}
	
	public void setZug(int zug){
		this.zug=zug;
		getZ�hlen().setText("Zug Nr. : "+getZug());
	}
	
	public int getZug(){
		return zug;
	}

	public JLabel getZ�hlen() {
		return z�hlen;
	}

	public myFrame(myPanel grids,Controller c) {
		super();
		this.grids = grids;
		zug = 0;
		grids.setPreferredSize(new Dimension(500,500));
		all = new JPanel();
		all.setLayout(new BoxLayout(all,BoxLayout.Y_AXIS));
		top = new JPanel();
		top.setLayout(new BoxLayout(top,BoxLayout.X_AXIS));
		top.setPreferredSize(new Dimension(500,20));
		z�hlen = new JLabel("Zug Nr. : "+zug);
		reset = new JButton("Reset");
		reset.addActionListener(c);
		top.add(reset);
		top.add(z�hlen);
		all.add(top);
		all.add(grids);
		this.setContentPane(all);															
		this.setTitle("Lights Out");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); 
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public JButton getReset() {
		return reset;
	}

}
