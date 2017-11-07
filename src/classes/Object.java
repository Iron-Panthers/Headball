package classes;

public abstract class Object {
	double mass;
	double xVelocity;
	double yVelocity;
	double acceleration;
	double position;
	public Object(double mass, double xVelocity, double yVelocity, double acceleration, double position) {
		this.mass = mass;
		this.xVelocity = xVelocity;
		this.yVelocity = yVelocity;
		this.acceleration = acceleration;
		this.position = position;
	}
	public void move() {
		
	}
}
