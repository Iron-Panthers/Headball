package classes;

public abstract class Object {
	double mass;
	double xVelocity;
	double yVelocity;
	double xAcceleration;
	double yAcceleration;
	double xPosition;
	double yPosition;
	double width;
	double height;
	public Object(double mass, double xVelocity, double yVelocity, double xAcceleration, double yAcceleration, double xPosition, double yPosition, double width, double height) {
		this.mass = mass;
		this.xVelocity = xVelocity;
		this.yVelocity = yVelocity;
		this.xAcceleration = xAcceleration;
		this.yAcceleration = yAcceleration;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.width = width;
		this.height = height;
	}
	public void move() {
		
	}
}
