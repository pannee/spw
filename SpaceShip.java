import java.awt.Color;
import java.awt.Graphics2D;

public class SpaceShip extends Sprite{

	int step = 8;
	
	public SpaceShip(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
		
	}

	public void move(int xdirection, int ydirection){
 		x += (step * xdirection);
 		if(x < 0) 
 		   x = 0;
 		if(x > 400 - width) 
 		   x = 400 - width;
 		
 		y += (step * ydirection);
 		if(y < 0) 
 		   y = 0;
 		if(y > 550 - height) 
 		   y = 550 - height;
  	}
}