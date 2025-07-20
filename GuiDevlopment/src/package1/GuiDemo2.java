package package1;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GuiDemo2 {
	public static void main(String[] args) {
		JFrame f1 = new JFrame();
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		Dimension dim = kit.getScreenSize();
		
		Image icon = kit.getImage("C:/Users/arjun/OneDrive/Pictures/Screenshots 1/arjunlogo.png");
		f1.setIconImage(icon);
		
		int w = (int)dim.getWidth();
		int h = (int)dim.getHeight();
		
		f1.setSize(w/2,h/2);
		
		f1.setTitle("Frame at centre");
		
		f1.setResizable(false);
		
		f1.setLocationRelativeTo(null);
		
		f1.setVisible(true);
		
		
	}

}
