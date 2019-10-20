package Java8.LambdaExpressions;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithoutLambda {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Action listner before JAVA");
		
		Button button = new Button("Click here");
		button.setBounds(50,100,80,50);
		
		//before java 8
		
		/*
		 * button.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * 
		 * System.out.println("Hello World");
		 * 
		 * } });
		 */
		 
		
		
		// after java 8 with Lambda expression
		button.addActionListener(e -> System.out.println("hello world")); 
		
		frame.add(button);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
