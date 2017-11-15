package objects;

public class Player extends Object {
	Head head;
	Feet feet;
	public Player() {
		head = new Head(0, 0, 0, 0);
		feet = new Feet(0,0,0,0);
	}
	public void playerMoveRight(){
			applyforce(1 - xVelocity * mass,0);//this is how I think youll do it, with a parameter for amount of force being applied x and y, I might be wrong. the equation assumes i want speed always to be 1 for player movement
		}
	public void playerMoveLeft() {
		
	applyforce(0,1 - yVelocity * mass);
	}
}
