import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main{
	
	public static void main(String[] args){
		
		JFrame frame = new JFrame("Space War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,600);
		frame.getContentPane().setLayout(new BorderLayout());
		
		
		SpaceShip v = new SpaceShip(180, 500, 20, 20);
		GamePanel gp = new GamePanel();
		GameEngine engine = new GameEngine(gp, v);
		gp.updateGameUI();
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		
		
		frame.setVisible(true);
	}
}