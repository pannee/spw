
import java.awt.geom.Rectangle2D;

public class GameEngine{
	GamePanel gp;
		
	private SpaceShip v;	
	

	public GameEngine(GamePanel gp, SpaceShip v) {
		this.gp = gp;
		this.v = v;		
		
		gp.sprites.add(v);
		gp.updateGameUI();
	}
	

}