

public class Asteroid extends Polygon {

	public Asteroid(Point[] Array_of_Asteroids, Point asteroid_pos, double asteroid_rot) {
		super(Array_of_Asteroids, asteroid_pos, asteroid_rot);
		
	}

	public void move(){
		position.x += 2*Math.cos(Math.toRadians(rotation));
		position.y +=2*Math.sin(Math.toRadians(rotation));
		
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
