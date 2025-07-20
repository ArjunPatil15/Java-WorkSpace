package package1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiDemo4 {
	public static void main(String[] args) {
		JFrame f1 = new JFrame();
		
		f1.setSize(500,500);
		
		f1.setTitle("Frame With Multiple Buttons Using Border Layout");
		
		f1.setResizable(true);
		
		JButton b1 = new JButton("East");
		f1.getContentPane().add(BorderLayout.EAST,b1);
		
		f1.setVisible(true);
	}
}
