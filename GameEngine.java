import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;
 
import javax.swing.Timer;
 
 
 public class GameEngine implements GameReporter{
 	GamePanel gp;
 		
 	private ArrayList<Enemy> enemies = new ArrayList<Enemy>();	
 	private SpaceShip v;	
 	
 	private Timer timer;
 	
 	private long score = 0;
 	private double difficulty = 0.1;
 	
 	public GameEngine(GamePanel gp, SpaceShip v) {
 		this.gp = gp;
 		this.v = v;		
		
 		gp.sprites.add(v);
 		
 		timer = new Timer(100, new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent arg0) {
 				process();
 			}
 		});
 		timer.setRepeats(true);
 		
 	}
 	
 	public void start(){
 		timer.start();
 	}
 	
 	private void generateEnemy(){
 		Enemy e = new Enemy((int)(Math.random()*390), 30);
 		gp.sprites.add(e);
 		enemies.add(e);
 	}
 	
	private void process(){
 		
 			if( Math.random() < difficulty){
 				
 				generateEnemy();
 			}
 			
 			Iterator<Enemy> e_iter = enemies.iterator();
 			
 			while(e_iter.hasNext()){
 				Enemy e = e_iter.next();
 				e.proceed();
				
 				if(!e.isAlive()){
 					e_iter.remove();
					gp.sprites.remove(e);
					score += 0;
 				}
 				
 			}
 		
 			gp.updateGameUI(this);
 			
 			Rectangle2D.Double vr = v.getRectangle();
 			Rectangle2D.Double er;
 			for(Enemy e : enemies){
 				er = e.getRectangle();
 				
 			}
 	}
 	
 	public long getScore(){
 		return score;
 	}
	
}