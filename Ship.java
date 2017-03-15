

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ship extends Polygon implements KeyListener {
	private Point[] shape;
	public boolean forward;
	public boolean left;
	public boolean right;
	public boolean back;
	public boolean super_speed;
	
	
	public Ship(Point[] inShape, Point inPosition, double inRotation) {
		super(inShape, inPosition, inRotation);

	}
	
	
		
	public void keyPressed(KeyEvent e) {
		int keycode  = e.getKeyCode();
		switch (keycode) {
		case KeyEvent.VK_RIGHT:
			right=true;
			break;
		case KeyEvent.VK_LEFT:
			left=true;
			break;
		case KeyEvent.VK_UP:
			forward=true;
			break;
		case KeyEvent.VK_DOWN:
			back=true;
			break;
		case KeyEvent.VK_SPACE:
			super_speed=true;
			break;
				
		}
	}

	public void keyReleased(KeyEvent e) {
		int keycode  = e.getKeyCode();
		switch (keycode) {
		case KeyEvent.VK_RIGHT:
			right=false;
			break;
		case KeyEvent.VK_LEFT:
			left=false;
			break;
		case KeyEvent.VK_UP:
			forward=false;
			break;
		case KeyEvent.VK_DOWN:
			back=false;
			break;
		case KeyEvent.VK_SPACE:
			super_speed=true;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {
		
		}
	
	public void move(){
		if(right){
			rotation+=10;
		}
		 if(left){
			this.rotation-=10;
		}
		 //EXTRA FEATURE
		 //YOU CAN HOLD THE SPACE BAR FOR A CONTINUOUS BOOST OR TAP IT FOR A SHORT BOOST
		 if(super_speed){
			 position.x += 20*Math.cos(Math.toRadians(rotation));
			 position.y +=20*Math.sin(Math.toRadians(rotation));
			 super_speed=false;
			 
			 if(position.x > 800)
					position.x = 0;
				if(position.y > 600)
					position.y = 0;
				if(position.x < 0 )
					position.x = 800;
				if(position.y < 0)
					position.y=600;
		 }

		 
		 //EXTRA FEATURE 
		 //THE SHIP CAN REVERSE
		 if (back){
			position.x -= 15*Math.cos(Math.toRadians(rotation));
			position.y -=15*Math.sin(Math.toRadians(rotation));
			
			if(position.x > 800)
				position.x = 0;
			if(position.y > 600)
				position.y = 0;
			if(position.x < 0 )
				position.x = 800;
			if(position.y < 0)
				position.y=600;
		 }
		 if(forward){
			position.x += 15*Math.cos(Math.toRadians(rotation));
			position.y +=15*Math.sin(Math.toRadians(rotation));
			
			
			if(position.x > 800)
				position.x = 0;
			if(position.y > 600)
				position.y = 0;
			if(position.x < 0 )
				position.x = 800;
			if(position.y < 0)
				position.y=600;
			
		}
	                     
	}
	}
	

	

	


