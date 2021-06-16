package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e -> {
			int first = Integer.parseInt(JOptionPane.showInputDialog("First number"));
			int second = Integer.parseInt(JOptionPane.showInputDialog("Second number"));
			int result = first+second;
			JOptionPane.showMessageDialog(null, "Result: " + result);
		});
		
		randNumber.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Random: " + Math.floor(Math.random() * 1000));
		});
		
		tellAJoke.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Do you want to hear a joke about sodium?");
			JOptionPane.showMessageDialog(null, "Na");
		});
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
