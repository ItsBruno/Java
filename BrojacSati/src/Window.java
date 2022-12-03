import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Window extends JFrame{

	public Window() {
		JTextArea typeBox = new JTextArea();
		
		typeBox.setCaretPosition(0);
		typeBox.setForeground(Color.white);
		
		
		typeBox.setPreferredSize(new Dimension(900, 500));
		typeBox.setBackground(Color.black);
		
		add(typeBox, BorderLayout.CENTER);
	}
	
	
	public static void main(String[] args) {
		Window window = new Window();
		
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setVisible(true);
		window.pack();
		window.setLocation(320,140);
		
	}
}
