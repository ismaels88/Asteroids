

/*
CLASS: Asteroids
DESCRIPTION: Extending Game, Asteroids is all in the paint method.
NOTE: This class is the metaphorical "main method" of your program,
      it is your control center.
Original code by Dan Leyzberg and Art Simon
*/
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Asteroids extends Game {
	static int counter = 0;
	
	
	//instance variable
	//ship
	Point p1 = new Point(30,200); //front of ship
	Point p2 = new Point(5,190); //back of ship
	Point p3 = new Point(15,200); 
	Point p4 = new Point(5,210); //back of ship
	Point[] ship1 = {p1,p2,p3,p4};
	Point pos = new Point(400,300);
	double offset = 0;
	Ship boom = new Ship(ship1,pos,offset);
	
	
	Point[] asteroid_Points_Array = {new Point(30,150), 
			new Point(0,160), 
			new Point(-5,200), 
			new Point(50,220), 
			new Point(90,200), 
			new Point(80,150)};
	Random r = new Random();
	
	Asteroid[] Array_of_Asteroids={new Asteroid(asteroid_Points_Array, new Point(r.nextInt(800), r.nextInt(600)),r.nextInt(360)),
			new Asteroid(asteroid_Points_Array, new Point(r.nextInt(800), r.nextInt(600)),r.nextInt(360)),
			new Asteroid(asteroid_Points_Array, new Point(r.nextInt(800), r.nextInt(600)),r.nextInt(360)),
		new Asteroid(asteroid_Points_Array, new Point(r.nextInt(800), r.nextInt(600)),r.nextInt(360)),
		new Asteroid(asteroid_Points_Array, new Point(r.nextInt(800), r.nextInt(600)),r.nextInt(360)),
		new Asteroid(asteroid_Points_Array, new Point(r.nextInt(800), r.nextInt(600)),r.nextInt(360))};

	boolean AC0 = false;
	boolean AC1 = false;
	boolean AC2 = false;
	boolean AC3 = false;
	boolean AC4 = false;
	boolean AC5 = false;
	

	
	public Asteroids() {
    super("Asteroids!",800,600);
    this.setFocusable(true);
	this.requestFocus();
	addKeyListener(boom);
	
  }
  
	public void paint(Graphics brush) {
		
    	brush.setColor(Color.black);
    	brush.fillRect(0,0,width,height);

    	
    	// sample code for printing message for debugging
    	// counter is incremented and this message printed
    	// each time the canvas is repainted
    	counter++;
    	brush.setColor(Color.green);
    	brush.drawString("Counter is " + counter,10,10);
    	//test.paint(brush);
    	
    	
    	brush.setColor(Color.orange);
    	
    	boom.paint(brush); 
    	boom.move();

    	
    	brush.setColor(Color.red);
    	Array_of_Asteroids[0].paint(brush);
    	Array_of_Asteroids[1].paint(brush);
    	Array_of_Asteroids[2].paint(brush);
    	Array_of_Asteroids[3].paint(brush);
    	Array_of_Asteroids[4].paint(brush);
    	Array_of_Asteroids[5].paint(brush);
    	
    	Array_of_Asteroids[0].move();
    	Array_of_Asteroids[1].move();
    	Array_of_Asteroids[2].move();
    	Array_of_Asteroids[3].move();
    	Array_of_Asteroids[4].move();
    	Array_of_Asteroids[5].move();
    	
    	//EXTRA FEATURE
    	//WHEN THE SHIP COLLIDES WITH ASTEROID, IT RETURNS TO THE DEFAULT POSITION
    	if (Array_of_Asteroids[0].crash(boom)){
    		boom.position = new Point(400,300);
    		AC0 = true;
    	}
    	if (Array_of_Asteroids[1].crash(boom)){
    		boom.position = new Point(400,300);
    		AC1 = true;
    	}
    	if (Array_of_Asteroids[2].crash(boom)){
    		boom.position = new Point(400,300);
    		AC2 = true;
    	}
    	if (Array_of_Asteroids[3].crash(boom)){
    		boom.position = new Point(400,300);
    		AC3 = true;
    	}
    	if (Array_of_Asteroids[4].crash(boom)){
    		boom.position = new Point(400,300);
    		AC4 = true;
    	}
    	if (Array_of_Asteroids[5].crash(boom)){
    		boom.position = new Point(400,300);
    		AC5 = true;
    	}
    	
    	//EXTRA FEATURE
    	//WHEN THE SHIP COLLIDES WITH ASTEROIDS, THE SCREEN FLASHES RED.
    	if (AC0){
    		brush.setColor(Color.red);
    		brush.fillRect(0,0,width,height);
    		AC0 = false;
    	}
    	if (AC1){
    		brush.setColor(Color.red);
    		brush.fillRect(0,0,width,height);
    		AC1 = false;
    	}
    	if (AC2){
    		brush.setColor(Color.red);
    		brush.fillRect(0,0,width,height);
    		AC2 = false;
    	}
    	if (AC3){
    		brush.setColor(Color.red);
    		brush.fillRect(0,0,width,height);
    		AC3 = false;
    	}
    	if (AC4){
    		brush.setColor(Color.red);
    		brush.fillRect(0,0,width,height);
    		AC4 = false;
    	}
    	if (AC5){
    		brush.setColor(Color.red);
    		brush.fillRect(0,0,width,height);
    		AC5 = false;
    	}

  }
  
	public static void main (String[] args) {
   		Asteroids a = new Asteroids();
		a.repaint();
		
	

		
  }
	
}