import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main{
	
	public static void main(String[] args){
		
		JFrame frame = new JFrame("Space War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,600);
		frame.getContentPane().setLayout(new BorderLayout());
		
		GamePanel gp = new GamePanel();
		gp.updateGameUI();
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		
		
		frame.setVisible(true);
	}
}