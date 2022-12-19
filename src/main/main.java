package main;

import javax.swing.JFrame;

public class main {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit window
		window.setResizable(false); //no resizing window
		window.setTitle("Fortnite Battle Royal X Among Us"); //title
		
		GamePanel gamePanel = new GamePanel(); //bring in GamePanel class
		window.add(gamePanel);
		
		window.pack(); //allows visibility
		
		window.setLocationRelativeTo(null); // sets window to center of screen
		window.setVisible(true);
		
		gamePanel.setupGame();
		gamePanel.startGameThread();
	}
}
