package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.filechooser.FileFilter;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class FileChooserDemo {

	protected static final Component Frame = null;
	private JFrame frmFileChooser;
	private JTextField textField;
	
	String FileAbsolutePath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileChooserDemo window = new FileChooserDemo();
					window.frmFileChooser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FileChooserDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFileChooser = new JFrame();
		frmFileChooser.setTitle("File Chooser");
		frmFileChooser.setBounds(100, 100, 800, 600);
		frmFileChooser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFileChooser.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select File");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(243, 27, 301, 70);
		frmFileChooser.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(19, 156, 473, 70);
		frmFileChooser.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Get File");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser jfc = new JFileChooser("d:\\");
				jfc.addChoosableFileFilter(new FirstFileFilter());
				jfc.addChoosableFileFilter(new SecoundFileFilter());
				
				 int userChoice = jfc.showOpenDialog(frmFileChooser);
				 
				 if(userChoice == JFileChooser.CANCEL_OPTION) {
					 textField.setText("No File Selected");
				 }
				 
				 if(userChoice == JFileChooser.APPROVE_OPTION) {
					File selectedFile = jfc.getSelectedFile();
					textField.setText(selectedFile.getPath());
					FileAbsolutePath = selectedFile.getAbsolutePath();
				 }
		
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(540, 156, 218, 70);
		frmFileChooser.getContentPane().add(btnNewButton);
		
		JLabel lblImage = new JLabel("New label");
		lblImage.setBounds(19, 280, 473, 244);
		frmFileChooser.getContentPane().add(lblImage);
		
		JButton btnDisplayFile = new JButton("Display File");
		btnDisplayFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ImageIcon ic = new ImageIcon(FileAbsolutePath);
				Image newImage = ic.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_AREA_AVERAGING);
				ic.setImage(newImage);
				
				lblImage.setIcon(ic);
			}
		});
		btnDisplayFile.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDisplayFile.setBounds(540, 368, 218, 70);
		frmFileChooser.getContentPane().add(btnDisplayFile);
	}
	
	class FirstFileFilter extends FileFilter{
		

	@Override
	public boolean accept(File f) {
		// TODO Auto-generated method stub
		String fileName = f.getName();
		
		int start = fileName.lastIndexOf(".");
		int end = fileName.length();
		
		if (start < 0) {
			return false;
		}else {
			String ext = fileName.substring(start,end);
			
			if (ext.equalsIgnoreCase(".java")) {
				return true;
			}else {
				return false;
			}
		}
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		String msg = "Java Files (*.java)";
		return msg;
	}
	
	}
	
	class SecoundFileFilter extends FileFilter{

		@Override
		public boolean accept(File f) {
			String fileName = f.getName();
			
			int start = fileName.lastIndexOf(".");
			int end = fileName.length();
			
			if (start < 0) {
				return false;
			}else {
				String ext = fileName.substring(start,end);
				
				if (ext.equalsIgnoreCase(".png")) {
					return true;
				}else {
					return false;
				}
			}
		}

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			String msg = "Png Files (*.png)";
			return msg;
		}
		
	}

}


