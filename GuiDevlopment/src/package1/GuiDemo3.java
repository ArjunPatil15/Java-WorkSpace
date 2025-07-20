package package1;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiDemo3 {
	public static void main(String[] args) {
		JFrame f1 = new JFrame();
		
		f1.setSize(500,500);
		
		f1.setTitle("My Button Frame");
		
		f1.setResizable(true);
		
		JButton b1 = new JButton();
		b1.setText("Click Me");
		
		f1.setLayout(null);
		
		Font fn = new Font("Monotype Corsiva", Font.BOLD, 40);
		b1.setFont(fn);
		
		b1.setBounds(100,200, 200, 60);
		
		f1.add(b1);
		
		f1.setVisible(true);
	}
}
