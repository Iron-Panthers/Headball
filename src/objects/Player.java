package objects;

public class Player {
	public Head head;
	public Feet feet;
	public Player(double x, double y) {
		head = new Head(0, 0, x, y);
		feet = new Feet(0,0,x,y);
	}
	public void playerMoveRight(){
		if(head.xVelocity < 1) {
			head.applyForce(0.33,0);//this is how I think youll do it, with a parameter for amount of force being applied x and y, I might be wrong. the equation assumes i want speed always to be 1 for player movement
			feet.applyForce(0.33,0);//this is how I think youll do it, with a parameter for amount of force being applied x and y, I might be wrong. the equation assumes i want speed always to be 1 for player movement
		}
	}
	public void playerMoveLeft() {
		if(head.xVelocity > -1) {
			head.applyForce(-0.33,0);
			feet.applyForce(-0.33,0);
		}
	}
	public void jump() {
		if(head.yVelocity < 1) {
			head.applyForce(0.33, 0.33);
			feet.applyForce(0.33, 0.33);
		}
	}
}