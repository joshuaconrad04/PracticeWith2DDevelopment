package Main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Giving Parameter of the JFrame Window
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("2D Game Practice");
		
		//adding the Game panel class I created to this Window
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack();
		
		//displays window on the center of the screen
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

}
