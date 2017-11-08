package classes;

public abstract class Object {
	double mass;
	double xVelocity;
	double yVelocity;
	double acceleration;
	double xPosition;
	double yPosition;
	double width;
	double height;
	public Object(double mass, double xVelocity, double yVelocity, double acceleration, double xPosition, double yPosition, double width, double height) {
		this.mass = mass;
		this.xVelocity = xVelocity;
		this.yVelocity = yVelocity;
		this.acceleration = acceleration;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.width = width;
		this.height = height;
	}
	public void move() {
		
	}
}
