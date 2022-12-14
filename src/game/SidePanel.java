package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SidePanel extends JPanel {
	
	private static final Font LARGE_FONT = new Font("Tahoma", Font.BOLD, 20);
	
	private static final Font MEDIUM_FONT = new Font("Tahoma", Font.BOLD, 16);

	private static final Font SMALL_FONT = new Font("Tahoma", Font.BOLD, 12);
	
	private SnakeGame game;
	
	public SidePanel(SnakeGame game) {
		this.game = game;
		
		setPreferredSize(new Dimension(300, BoardPanel.ROW_COUNT * BoardPanel.TILE_SIZE));
		setBackground(Color.BLACK);
	}
	
	private static final int SCORES_OFFSET = 150;
	
	private static final int CONTROLS_OFFSET = 320;
	
	private static final int MESSAGE_STRIDE = 30;
        
	
	private static final int SMALL_OFFSET = 5;
	
	private static final int LARGE_OFFSET = 50;
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.WHITE);
		
		g.setFont(MEDIUM_FONT);
		g.drawString("Scores", SMALL_OFFSET, SCORES_OFFSET);
		g.drawString("Controls", SMALL_OFFSET, CONTROLS_OFFSET);
		
		g.setFont(SMALL_FONT);
		
		int drawY = SCORES_OFFSET;
		g.drawString("Total Score: " + game.getScore(), LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Fruit Eaten: " + game.getFruitsEaten(), LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		//g.drawString("Fruit Score: " + game.getNextFruitScore(), LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		
		drawY = CONTROLS_OFFSET;
		g.drawString("Move Up: Up Arrowkey", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Move Down: Down Arrowkey", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Move Left: Left Arrowkey", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Move Right: Right Arrowkey", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Pause Game: P", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
	}

}
