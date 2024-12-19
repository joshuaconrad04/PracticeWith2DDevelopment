package Main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

//This is a subclass of JPanel so it has all the methods from JPanel
public class GamePanel extends JPanel{
	
	
	//SCREEN SETTINGS and character 
	final int originalTileSize = 16; //16x16 Tiles
	//We need to scale the size to fix our current monitors
	final int scale = 3;
	
	final int tileSize = originalTileSize * scale; // 48x484
	
	//now we need to determine the size of the screen
	
	//num of columns I want
	final int maxScreenCol = 16;
	//num of row I want
	final int maxScreenRow = 12;
	//actual screen width
	final int screenWidth = tileSize*maxScreenCol;	// 768 pixels
	//actual screen length
	final int screenHeight = tileSize*maxScreenRow; //576 pixels
	
	//Game Panel Constructor
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		//drawings from this component will be done in an offscreen painting buffer
		this.setDoubleBuffered(true);
	}
	
	
	
	
	
}


