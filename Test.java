

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Test implements KeyListener {
	//instance variables
	boolean key1 = false;
	boolean key2 = false;
	boolean anotherKey = false;
	
	
	public Test(){
		
	}
	
	public void keyPressed(KeyEvent e){
		//find out what key was pressed
		int keycode = e.getKeyCode();
		switch (keycode){
		case KeyEvent.VK_1:
			key1=true;
			break;
		case KeyEvent.VK_2:
			key2 = true;
			break;
		default:
				anotherKey = false;
				break;
				
		}
		if(keycode == KeyEvent.VK_1){
			//change to true to show key is being pressed
			key1 = true;
		}
	}
	
	public void keyReleased(KeyEvent e){
		//find out what key was pressed
				int keycode = e.getKeyCode();
				
				switch (keycode){
				case KeyEvent.VK_1:
					key1 = false;
					break;
				case KeyEvent.VK_2:
					key2 = false;
					break;
					default:
							anotherKey = true;
							break;
				}
				
				if(keycode == KeyEvent.VK_1){
					//change to true to show key is being pressed
					key1 = false;
					

				}
	}
	
	public void paint(Graphics brush){
		if (key1){
			brush.drawString("You are pressing 1", 100, 100);
		}
		if (key2){
			brush.drawString("You are pressing 2", 100,500);
		}
		if (anotherKey){
			brush.drawString("You are pressing another key", 100,300);
		}
	}
	
	//not implemented
	public void keyTyped(KeyEvent e){
		
	}
}
