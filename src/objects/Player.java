package objects;

public class Player extends Object {
	Head head;
	Feet feet;
	public Player(double x, double y) {
		head = new Head(0, 0, x, y);
		feet = new Feet(0,0,x,y);
	}
	public void playerMoveRight(){
		if(xVelocity<1) {
			applyforce(0.33,0);//this is how I think youll do it, with a parameter for amount of force being applied x and y, I might be wrong. the equation assumes i want speed always to be 1 for player movement

		}
	}
	public void playerMoveLeft() {
		if(xVelocity>-1) {
			applyforce(-0.33,0);
		}
	}
	public static void playerMoveLeft() {
		applyforce(0,1 - yVelocity * mass);
	}
}
